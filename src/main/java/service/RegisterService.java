package service;

import entity.Citizen;
import entity.City;
import service.inter.RegisterServiceInter;

import java.sql.Ref;
import java.util.ArrayList;
import java.util.List;

public class RegisterService extends Citizen implements RegisterServiceInter {
    public List<Citizen> registerCitizen() throws InterruptedException {
        InputService inputService=new InputService();
        Citizen c=new Citizen();
        City city=new City();
        List<Citizen> list=new ArrayList<>();
        String name=inputService.getStringInput("Ad");
        String surname=inputService.getStringInput("Soyad");
        String age=inputService.getStringInput("Yaş");
        String number=inputService.getStringInput("Nömrə");
        String cName=inputService.getStringInput("Şəhər");

        c.setName(name);
        c.setSurname(surname);
        c.setAge(age);
        c.setNumber(number);
        c.setCity(cName);
        list.add(c);

        System.out.println("Sorğunuz qəbul olundu 10 saniyə geri sayım başladı!");

        for (int i = 10; i >0 ; i--) {
            System.out.println(i);
            Thread.sleep(1000);}
        System.out.println("Təbriklər Artıq Şəhər Qeydiyyatıındasınız!");















        return list;
    }



}
