package com.example.dataintegration.repository;

import com.example.dataintegration.entity.DmVTrContractMx;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface DmVTrContractMxRepository extends JpaRepository<DmVTrContractMx,Integer>, Serializable {
    List<DmVTrContractMx> findAllByUid(String uid);

    @Query("select d.etlDt as date,sum(d.bussAmt) as sum from DmVTrContractMx d where d.uid=:uid group by d.etlDt")
    List<Map<Object, Object>> findAmt(@Param("uid") String uid);

    @Query(nativeQuery = true,value = "select dm_v_tr_contract_mx.uid as uuid,dm_v_tr_contract_mx.etl_dt as ddate from dm_v_tr_contract_mx group by uuid,ddate order by sum(dm_v_tr_contract_mx.buss_amt) desc")
    List<Map<String,String>> findTop();
}
