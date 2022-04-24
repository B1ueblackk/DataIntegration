package com.example.dataintegration.repository;

import com.example.dataintegration.entity.DmVAsDjkInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.io.Serializable;

public interface DmVAsDjkInfoRepository extends JpaRepository<DmVAsDjkInfo,Integer>, Serializable {

}
