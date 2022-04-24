package com.example.dataintegration.repository;

import com.example.dataintegration.entity.PriCustAssetInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.io.Serializable;
import java.util.List;

public interface PriCustAssetInfoRepository extends JpaRepository<PriCustAssetInfo,Integer>, Serializable {
    List<PriCustAssetInfo> findAllByUid(String uid);
}
