package com.example.movilesjo.model.mobile;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.Optional;

public interface MobileRepository extends CrudRepository<Mobile,Integer> {
    ArrayList<Optional<Mobile>> findByBrand(String brand);
}
