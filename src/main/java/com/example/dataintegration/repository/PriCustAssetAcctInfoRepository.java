package com.example.dataintegration.repository;

import com.example.dataintegration.entity.PriCustAssetAcctInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.io.Serializable;
import java.util.List;

public interface PriCustAssetAcctInfoRepository extends JpaRepository<PriCustAssetAcctInfo,Integer>, Serializable {
    List<PriCustAssetAcctInfo> findAllByUid(String uid);
}
