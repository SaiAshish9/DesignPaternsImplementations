package com.sai.designPatterns.factory;

import com.sai.designPatterns.factory.enums.VehicleType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class VehicleProvider {

   private Map<VehicleType, Vehicle> vehicleMap;

   @Autowired
   public VehicleProvider(List<Vehicle> vehicleList){
      vehicleMap = new HashMap<>();
      for(Vehicle vehicle : vehicleList){
         vehicleMap.put(vehicle.getType(), vehicle);
      }
   }

   public Vehicle getVehicle(VehicleType type){
      return vehicleMap.get(type);
   }

}
