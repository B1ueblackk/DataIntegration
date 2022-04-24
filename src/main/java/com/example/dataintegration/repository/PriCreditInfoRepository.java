package com.example.dataintegration.repository;

import com.example.dataintegration.entity.PriCreditInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface PriCreditInfoRepository extends JpaRepository<PriCreditInfo,Integer>, Serializable {
    List<PriCreditInfo> findAllByUid(String uid);

}
