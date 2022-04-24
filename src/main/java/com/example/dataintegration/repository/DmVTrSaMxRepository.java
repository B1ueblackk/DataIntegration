package com.example.dataintegration.repository;

import com.example.dataintegration.entity.DmVTrSaMx;
import org.springframework.data.jpa.repository.JpaRepository;
import java.io.Serializable;

public interface DmVTrSaMxRepository extends JpaRepository<DmVTrSaMx,Integer>, Serializable {

}
