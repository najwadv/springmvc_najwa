package com.codeid.eshopper.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="oe.shippers")
public class Shipper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="shipper_id")
    private Long shipper_id;

    @Column(name="company_name")
    @Size(max = 40)
    @NotBlank(message="Nama perusahaan harus diisi.")
    private String company_name;

    @Column(name="phone")
    @Size(max = 24)
    @NotBlank(message = "Nomor telepon harus diisi.")
    private String phone;

    public Shipper(){}

    public Long getShipper_id() {
        return shipper_id;
    }

    public void setShipper_id(Long shipper_id) {
        this.shipper_id = shipper_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}
