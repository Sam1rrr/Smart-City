package service;

import service.inter.InputServiceInter;

import java.util.Scanner;

public class InputService implements InputServiceInter {
    public String getStringInput(String text){
        Scanner sc =new Scanner(System.in);
        System.out.println(text+":");
        String stringInput=sc.nextLine();
        return stringInput;

    }
    public int getIntInput(String text) {
        Scanner sc = new Scanner(System.in);
        System.out.println(text+":");
        int intInput=sc.nextInt();
        return intInput;
    }
}
