package service;

import entity.Citizen;
import entity.City;
import service.inter.CityServiceInter;
import util.AllTextFiles;

public class CityService extends City implements CityServiceInter {
    City city=new City();
    AllTextFiles allTextFiles=new AllTextFiles();
    InputService inputService=new InputService();
    RegisterService register=new RegisterService();
    public void CityService(){

        while (true) {
            System.out.println(AllTextFiles.Citys.first.getText());
            System.out.println(AllTextFiles.Citys.second.getText());
            System.out.println(AllTextFiles.Citys.third.getText());
            int numberSelect = inputService.getIntInput("Şəhərlərdən birini seçin");
            if (numberSelect == 1) {
                allTextFiles.aboutEcolifeCity();
                setAd("Ecolife City");
                setEhali(2);
                setLimit(10);
                setTehsil("5/10");
                setRefahSeviyesi("8/10");
                setTemizlik("9/10");
                setTibb("6/10");
                System.out.println("\nAd-" + getAd() + "\nƏhali-" + getEhali() + "\nMax Əhali-" + getLimit() + "\nTəhsil-" + getTehsil() + "\nTibb-" +
                        getTibb() + "\nRəfah Səviyyəsi-" + getRefahSeviyesi());
            } else if (numberSelect == 2) {
                allTextFiles.aboutInnovateCity();
                setAd("Innovate City");
                setEhali(2);
                setLimit(10);
                setTehsil("9/10");
                setRefahSeviyesi("6/10");
                setTemizlik("5/10");
                setTibb("7/10");
                System.out.println("\nAd-" + getAd() + "\nƏhali-" + getEhali() + "\nMax Əhali-" + getLimit() + "\nTəhsil-" + getTehsil() + "\nTibb-" +
                        getTibb() + "\nRəfah Səviyyəsi-" + getRefahSeviyesi());
            } else if (numberSelect == 3) {
                allTextFiles.aboutUnityCity();
                setAd("Unity City");
                setEhali(2);
                setLimit(10);
                setTehsil("/10");
                setRefahSeviyesi("/10");
                setTemizlik("7/10");
                setTibb("9/10");
                System.out.println("\nAd-" + getAd() + "\nƏhali-" + getEhali() + "\nMax Əhali-" + getLimit() + "\nTəhsil-" + getTehsil() + "\nTibb-" +
                        getTibb() + "\nRəfah Səviyyəsi-" + getRefahSeviyesi());

            }

            String answer = inputService.getStringInput("\n\nDigər Şəhərlərə baxmaq istəyirsiz? y/n");
            if (answer.equalsIgnoreCase("y")) {
                continue;
            } else {
                break;
            }
        }
    }

    }

