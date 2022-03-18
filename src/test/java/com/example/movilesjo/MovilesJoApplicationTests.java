package com.example.movilesjo;

import com.example.movilesjo.model.mobile.Mobile;
import com.example.movilesjo.model.mobile.MobileRepository;
import com.example.movilesjo.model.objectMother.MobileList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MovilesJoApplicationTests {
    @Autowired
    private MobileRepository mobileRepository;


    @Test
    void contextLoads() {
        MobileList generatorMobile = new MobileList();
        mobileRepository.saveAll(generatorMobile.getPhoneList());


    }

}
