package com.example.dataintegration.repository;

import com.example.dataintegration.entity.PriCustBaseInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.io.Serializable;
import java.util.List;

public interface PriCustBaseInfoRepository extends JpaRepository<PriCustBaseInfo,Integer>, Serializable {
    List<PriCustBaseInfo> findAllByUid(String uid);
}
