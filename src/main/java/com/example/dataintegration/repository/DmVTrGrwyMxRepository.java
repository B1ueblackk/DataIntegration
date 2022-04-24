package com.example.dataintegration.repository;

import com.example.dataintegration.entity.DmVTrGrwyMx;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface DmVTrGrwyMxRepository extends JpaRepository<DmVTrGrwyMx,Integer>, Serializable {
    List<DmVTrGrwyMx> findAllByUid(String uid);

    @Query("select d.etlDt as date,sum(d.tranAmt) as sum from DmVTrGrwyMx d where d.uid=:uid group by d.etlDt")
    List<Map<Object, Object>> findAmt(@Param("uid") String uid);
}
