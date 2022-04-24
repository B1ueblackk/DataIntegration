package com.example.dataintegration.repository;

import com.example.dataintegration.entity.DmVTrDsfMx;
import org.springframework.data.jpa.repository.JpaRepository;
import java.io.Serializable;

public interface DmVTrDsfMxRepository extends JpaRepository<DmVTrDsfMx,Integer>, Serializable {

}
