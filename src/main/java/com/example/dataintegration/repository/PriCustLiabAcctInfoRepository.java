package com.example.dataintegration.repository;

import com.example.dataintegration.entity.PriCustLiabAcctInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.io.Serializable;
import java.util.List;

public interface PriCustLiabAcctInfoRepository extends JpaRepository<PriCustLiabAcctInfo,Integer>, Serializable {
    List<PriCustLiabAcctInfo> findAllByUid(String uid);
}
