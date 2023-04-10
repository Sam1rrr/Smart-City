package service;

import entity.Citizen;
import entity.City;
import service.inter.SelectServiceInter;
import util.AllTextFiles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectService extends City implements SelectServiceInter {
    City city=new City();
    AllTextFiles allTextFiles=new AllTextFiles();
    InputService inputService=new InputService();
    RegisterService register=new RegisterService();
    CityService cityService=new CityService();
    List<Citizen> citizenList=new ArrayList<>();

    public void SelectService() throws InterruptedException {
        while (true) {
            System.out.println(AllTextFiles.Select.City.getText() + AllTextFiles.Select.Register.getText() + AllTextFiles.Select.About.getText() +AllTextFiles.Select.User.getText());

            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            if (number == 1) {
                cityService.CityService();

                String menu = inputService.getStringInput("Ana Səhifəyə Qayıtmaq üçün 'quit' Yazın!");
                if (menu.equalsIgnoreCase("quit")) {
                    continue;
                }else{
                    break;
                }

            }
        else if (number == 2) {
                citizenList.addAll(register.registerCitizen()) ;
            } else if (number == 3) {
                allTextFiles.aboutSmartCity();
            } else if (number==4) {
                citizenList.forEach(System.out::println);




            }

        }


    }
}

