package com.example.phoneshop.util;

import com.example.phoneshop.dto.BrandDTO;
import com.example.phoneshop.entity.Brand;

public class Mapper {

  public static Brand toBrand(BrandDTO dto){
    Brand brand = new Brand();
    brand.setId(dto.getId());
    brand.setName(dto.getName());

    return brand;
  }

}
