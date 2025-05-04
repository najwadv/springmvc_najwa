package com.codeid.eshopper.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="oe.region")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="region_id")
    private Long region_id;

    @Column(name="region_description")
    private String region_description;

    public Region() {}

    public Long getRegion_id() {
        return region_id;
    }

    public void setRegion_id(Long region_id) {
        this.region_id = region_id;
    }

    public String getRegion_description() {
        return region_description;
    }

    public void setRegion_description(String region_description) {
        this.region_description = region_description;
    }

}