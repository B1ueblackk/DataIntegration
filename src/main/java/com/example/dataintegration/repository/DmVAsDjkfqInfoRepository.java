package com.example.dataintegration.repository;

import com.example.dataintegration.entity.DmVAsDjkfqInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.io.Serializable;

public interface DmVAsDjkfqInfoRepository extends JpaRepository<DmVAsDjkfqInfo,Integer>, Serializable {

}
