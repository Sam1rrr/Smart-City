package service.inter;

import entity.Citizen;

import java.util.List;

public interface RegisterServiceInter {
    List<Citizen> registerCitizen() throws InterruptedException;
}
