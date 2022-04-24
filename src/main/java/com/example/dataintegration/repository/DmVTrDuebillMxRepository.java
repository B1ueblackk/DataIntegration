package com.example.dataintegration.repository;

import com.example.dataintegration.entity.DmVTrDuebillMx;
import org.springframework.data.jpa.repository.JpaRepository;
import java.io.Serializable;

public interface DmVTrDuebillMxRepository extends JpaRepository<DmVTrDuebillMx,Integer>, Serializable {

}
