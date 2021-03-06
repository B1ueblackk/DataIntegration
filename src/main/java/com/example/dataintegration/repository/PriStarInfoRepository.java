package com.example.dataintegration.repository;

import com.example.dataintegration.entity.PriStarInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.io.Serializable;
import java.util.List;

public interface PriStarInfoRepository extends JpaRepository<PriStarInfo,Integer>, Serializable {
    List<PriStarInfo> findAllByUid(String uid);
}
