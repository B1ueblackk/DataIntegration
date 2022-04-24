package com.example.dataintegration.repository;

import com.example.dataintegration.entity.DmVTrShopMx;
import org.springframework.data.jpa.repository.JpaRepository;
import java.io.Serializable;

public interface DmVTrShopMxRepository extends JpaRepository<DmVTrShopMx,Integer>, Serializable {

}
