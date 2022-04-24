package com.example.dataintegration.repository;

import com.example.dataintegration.entity.PriCustBaseInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.io.Serializable;

public interface PriCustBaseInfoRepository extends JpaRepository<PriCustBaseInfo,Integer>, Serializable {

}
