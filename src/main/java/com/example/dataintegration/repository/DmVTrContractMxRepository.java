package com.example.dataintegration.repository;

import com.example.dataintegration.entity.DmVTrContractMx;
import org.springframework.data.jpa.repository.JpaRepository;
import java.io.Serializable;

public interface DmVTrContractMxRepository extends JpaRepository<DmVTrContractMx,Integer>, Serializable {

}
