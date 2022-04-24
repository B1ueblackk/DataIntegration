package com.example.dataintegration.repository;

import com.example.dataintegration.entity.DmVTrDsfMx;
import com.example.dataintegration.entity.DmVTrDuebillMx;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface DmVTrDuebillMxRepository extends JpaRepository<DmVTrDuebillMx,Integer>, Serializable {
    List<DmVTrDuebillMx> findAllByUid(String uid);
    @Query("select d.etlDt as date,sum(d.bussAmt) as sum from DmVTrDuebillMx d where d.uid=:uid group by d.etlDt")
    List<Map<Object, Object>> findAmt(@Param("uid") String uid);
}
