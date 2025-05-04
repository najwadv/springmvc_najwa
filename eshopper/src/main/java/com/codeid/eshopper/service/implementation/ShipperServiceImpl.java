package com.codeid.eshopper.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codeid.eshopper.entities.Shipper;
import com.codeid.eshopper.repository.ShipperRepository;
import com.codeid.eshopper.service.ShipperService;

@Service
public class ShipperServiceImpl implements ShipperService{

    private final ShipperRepository shipperRepository;

    public ShipperServiceImpl(ShipperRepository shipperRepository) {
        this.shipperRepository = shipperRepository;
    }

    @Override
    public Shipper addShipper(Shipper shipper) {
        // TODO Auto-generated method stub
        return shipperRepository.save(shipper);
    }

    @Override
    public void deleteShipperById(Long shipper_id) {
        // TODO Auto-generated method stub
        shipperRepository.deleteById(shipper_id);
    }

    @Override
    public List<Shipper> findAllShipper() {
        // TODO Auto-generated method stub
        return shipperRepository.findAll();
    }

    @Override
    public Optional<Shipper> findShipperById(Long shipper_id) {
        // TODO Auto-generated method stub
        return shipperRepository.findById(shipper_id);
    }

    
    
}
