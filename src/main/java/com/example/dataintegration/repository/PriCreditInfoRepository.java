package com.example.dataintegration.repository;

import com.example.dataintegration.entity.PriCreditInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.io.Serializable;

public interface PriCreditInfoRepository extends JpaRepository<PriCreditInfo,Integer>, Serializable {

}
