package com.example.dataintegration.repository;

import com.example.dataintegration.entity.PriCustAssetAcctInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.io.Serializable;

public interface PriCustAssetAcctInfoRepository extends JpaRepository<PriCustAssetAcctInfo,Integer>, Serializable {

}
