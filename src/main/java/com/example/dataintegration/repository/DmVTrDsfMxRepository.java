package com.example.dataintegration.repository;

import com.example.dataintegration.entity.DmVTrDsfMx;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface DmVTrDsfMxRepository extends JpaRepository<DmVTrDsfMx,Integer>, Serializable {
    List<DmVTrDsfMx> findAllByUid(String uid);

    @Query("select d.etlDt as date,sum(d.tranAmt) as sum from DmVTrDsfMx d where d.uid=:uid group by d.etlDt")
    List<Map<Object, Object>> findAmt(@Param("uid") String uid);
}
