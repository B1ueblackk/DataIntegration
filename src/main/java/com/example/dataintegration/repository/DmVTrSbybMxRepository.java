package com.example.dataintegration.repository;

import com.example.dataintegration.entity.DmVTrSaMx;
import com.example.dataintegration.entity.DmVTrSbybMx;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface DmVTrSbybMxRepository extends JpaRepository<DmVTrSbybMx,Integer>, Serializable {
    List<DmVTrSbybMx> findAllByUid(String uid);

    @Query("select d.etlDt as date,sum(d.tranAmtFen) as sum from DmVTrSbybMx d where d.uid=:uid group by d.etlDt")
    List<Map<Object, Object>> findAmt(@Param("uid") String uid);

    @Query(nativeQuery = true,value = "select uid as uuid,etl_dt as ddate from dm_v_tr_sbyb_mx group by uuid,ddate order by sum(tran_amt_fen) desc")
    List<Map<String,String>> findTop();

}
