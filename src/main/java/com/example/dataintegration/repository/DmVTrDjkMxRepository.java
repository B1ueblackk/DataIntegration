package com.example.dataintegration.repository;

import com.example.dataintegration.entity.DmVTrContractMx;
import com.example.dataintegration.entity.DmVTrDjkMx;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface DmVTrDjkMxRepository extends JpaRepository<DmVTrDjkMx,Integer>, Serializable {
    List<DmVTrDjkMx> findAllByUid(String uid);

    @Query("select d.etlDt as date,sum(d.tranAmt) as sum from DmVTrDjkMx d where d.uid=:uid group by d.etlDt")
    List<Map<Object, Object>> findAmt(@Param("uid") String uid);

    @Query(nativeQuery = true,value = "select uid as uuid,etl_dt as ddate from dm_v_tr_djk_mx group by uuid,ddate order by sum(tran_amt) desc")
    List<Map<String,String>> findTop();
}
