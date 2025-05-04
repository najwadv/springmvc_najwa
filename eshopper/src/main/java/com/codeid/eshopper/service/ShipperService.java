package com.codeid.eshopper.service;

import java.util.List;
import java.util.Optional;

import com.codeid.eshopper.entities.Shipper;

public interface ShipperService {

    List<Shipper> findAllShipper();
    
    Shipper addShipper(Shipper shipper);

    Optional<Shipper> findShipperById(Long shipper_id);

    void deleteShipperById(Long shipper_id);
    
}