package com.example.movilesjo.model.mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;
@RestController
@RequestMapping("mobile")
public class MobileController {
    @Autowired
    private MobileService mobileService;

    @GetMapping("list")
    public ResponseEntity<Response> list() {
        Response response = buildResponse(Map.of("allMobile", mobileService.getPhoneList()));
        return ResponseEntity.ok(response);
    }

    @GetMapping("findByBrand")
    public ResponseEntity<Response> findByBrand(@RequestParam("brand") String brand) {
        brand.toLowerCase();
        Response response = buildResponse(Map.of("brandMobiles", mobileService.findByBrand(brand)));
        return ResponseEntity.ok(response);
    }

    @GetMapping("findById")
    public ResponseEntity<Response> findById(@RequestParam("id") int id) {
        Response response = buildResponse(Map.of("idMobile", mobileService.findById(id)));
        return ResponseEntity.ok(response);
    }

    private Response buildResponse(Map<?, ?> data) {
        Response build = Response.builder()
                .TimeStamp(LocalDateTime.now())
                .Message("mobiles recovered")
                .Status(HttpStatus.OK)
                .Data(data)
                .build();
        return build;
    }
}
