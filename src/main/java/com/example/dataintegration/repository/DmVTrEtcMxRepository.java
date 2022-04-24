package com.example.dataintegration.repository;

import com.example.dataintegration.entity.DmVTrEtcMx;
import org.springframework.data.jpa.repository.JpaRepository;
import java.io.Serializable;

public interface DmVTrEtcMxRepository extends JpaRepository<DmVTrEtcMx,Integer>, Serializable {

}
