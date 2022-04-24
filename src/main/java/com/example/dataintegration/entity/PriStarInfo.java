package com.example.dataintegration.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pri_star_info", schema = "dm_tmp")
public class PriStarInfo {
    @Id
    private String uid;
    private String starLevel;

    @Basic
    @Column(name = "uid")
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "star_level")
    public String getStarLevel() {
        return starLevel;
    }

    public void setStarLevel(String starLevel) {
        this.starLevel = starLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PriStarInfo that = (PriStarInfo) o;
        return Objects.equals(uid, that.uid) && Objects.equals(starLevel, that.starLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, starLevel);
    }
}
