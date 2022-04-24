package com.example.dataintegration.repository;

import com.example.dataintegration.entity.PriCustLiabAcctInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.io.Serializable;

public interface PriCustLiabAcctInfoRepository extends JpaRepository<PriCustLiabAcctInfo,Integer>, Serializable {

}
