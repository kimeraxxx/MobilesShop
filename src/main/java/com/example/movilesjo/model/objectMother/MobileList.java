package com.example.movilesjo.model.objectMother;

import com.example.movilesjo.model.mobile.Mobile;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class MobileList {
    private LinkedList<String> brand = new LinkedList<>(List.of("Samsung", "Apple", "Motorola", "Nokia", "Huawei",
            "Oppo", "Honor", "TCL", "Alcatel", "Doogee", "Realme", "Cubot", "Oukitel", "Ulefone", "Elephone", "Google",
            "OnePlus", "Nubia", "Vivo", "Meizu", "Mywigo", "Sony", "Umidigi", "Vernee", "Wiko", "ZTE", "Lenovo"));

    private LinkedList<String> model = new LinkedList<>(List.of("Edge x30", "Note 10 Pro", "GT Neo 2", "Nord 2",
            "Mate 20X", "11T", "iPhone 13", "F3", "Edge", "Find N", "Pixel 2 XL", "10 PRO", "iQOO 8", "X3 NFC",
            "11 Lite", "8i", "9AT", "Pixel 3A", "GT Neo 2", "C21Y", "Narzo 50i", "20SE", "Pixel 3", "Civi", "P40 Lite",
            "GT Master", "iQOO 7", "Reno 6", "Galaxy S20", "K40", "9RT", "F2 PRO", "X60", "Galaxy S21", "Magic 6", "9R",
            "Z30", "G100"));

    private ArrayList<Mobile> phoneList = new ArrayList<>();

    public ArrayList<Mobile> getPhoneList() {
        return this.phoneList;
    }

    public MobileList() {
        super();
        this.brand.forEach((concreteMark) -> {
            this.model.forEach((concreteModel) -> {
                this.phoneList.add(new Mobile.BuilderPhone(concreteMark.toLowerCase(), concreteModel.toLowerCase()).builder());
            });
        });
    }

    public ArrayList<Optional<Mobile>> findByBrand(String brand) {
        ArrayList<Optional<Mobile>> optionalPhoneList = new ArrayList<>();
        this.phoneList.stream()
                .filter(phone ->
                        phone.getBrand().equalsIgnoreCase(brand))
                .forEach(phone ->
                        optionalPhoneList.add(Optional.ofNullable(phone)));
        return optionalPhoneList;
    }
}
