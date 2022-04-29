package com.example.dataintegration.repository;

import com.example.dataintegration.entity.DmVTrEtcMx;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface DmVTrEtcMxRepository extends JpaRepository<DmVTrEtcMx,Integer>, Serializable {
    List<DmVTrEtcMx> findAllByUid(String uid);

    @Query("select d.etlDt as date,sum(d.realAmt) as sum from DmVTrEtcMx d where d.uid=:uid group by d.etlDt")
    List<Map<Object, Object>> findAmt(@Param("uid") String uid);

    @Query(nativeQuery = true,value = "select uid as uuid,etl_dt as ddate from dm_v_tr_etc_mx group by uuid,ddate order by sum(real_amt) desc")
    List<Map<String,String>> findTop();
}
