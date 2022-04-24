package com.example.dataintegration.repository;

import com.example.dataintegration.entity.DmVAsDjkInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.io.Serializable;
import java.util.List;

public interface DmVAsDjkInfoRepository extends JpaRepository<DmVAsDjkInfo,Integer>, Serializable {
    List<DmVAsDjkInfo> findAllByUid(String uid);
}
