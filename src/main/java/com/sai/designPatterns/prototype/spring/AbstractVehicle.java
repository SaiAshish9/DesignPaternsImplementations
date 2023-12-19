package com.sai.designPatterns.prototype.spring;

import lombok.Data;

import java.util.List;

@Data
public abstract class AbstractVehicle {
   private List<String> vehicleList;
   public abstract AbstractVehicle clone();
}
