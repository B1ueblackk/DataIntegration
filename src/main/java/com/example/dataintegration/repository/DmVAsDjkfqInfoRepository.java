package com.example.dataintegration.repository;

import com.example.dataintegration.entity.DmVAsDjkfqInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface DmVAsDjkfqInfoRepository extends JpaRepository<DmVAsDjkfqInfo,Integer>, Serializable {
    List<DmVAsDjkfqInfo> findAllByUid(String uid);

    @Query("select d.etlDt as date,sum(d.mthInstl) as sum from DmVAsDjkfqInfo d where d.uid=:uid group by d.etlDt")
    List<Map<Object,Object>> findAmt(@Param("uid") String uid);

    @Query(nativeQuery = true,value = "select uid as uuid,etl_dt as ddate from dm_v_as_djkfq_info group by uuid,ddate order by sum(mth_instl) desc")
    List<Map<String,String>> findTop();

}
