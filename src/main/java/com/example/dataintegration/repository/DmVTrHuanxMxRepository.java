package com.example.dataintegration.repository;

import com.example.dataintegration.entity.DmVTrHuanxMx;
import org.springframework.data.jpa.repository.JpaRepository;
import java.io.Serializable;

public interface DmVTrHuanxMxRepository extends JpaRepository<DmVTrHuanxMx,Integer>, Serializable {

}
