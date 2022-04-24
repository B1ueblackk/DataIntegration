package com.example.dataintegration.repository;

import com.example.dataintegration.entity.PriCustLiabInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.io.Serializable;
import java.util.List;

public interface PriCustLiabInfoRepository extends JpaRepository<PriCustLiabInfo,Integer>, Serializable {
    List<PriCustLiabInfo> findAllByUid(String uid);
}
