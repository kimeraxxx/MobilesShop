package com.example.movilesjo.model.mobile;

import com.example.movilesjo.model.objectMother.MobileList;

import java.util.ArrayList;
import java.util.Optional;

public class MobileService {
    private MobileRepository mobileRepository;

    public ArrayList<Mobile> getPhoneList() {
        MobileList mobileList = new MobileList();
        return mobileList.getPhoneList();
    }

    public MobileService(MobileRepository mobileRepository) {
        this.mobileRepository = mobileRepository;
//		enterNewPhonesToTheDatabase();
    }

    public void enterNewPhonesToTheDatabase() {
        this.mobileRepository.saveAll(getPhoneList());
    }

    public ArrayList<Optional<Mobile>> findByBrand(String brand) {
        return mobileRepository.findByBrand(brand);
    }

    public Optional<Mobile> findById(int id) {
        return mobileRepository.findById(id);
    }
}
