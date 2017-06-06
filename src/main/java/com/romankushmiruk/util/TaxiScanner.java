package com.romankushmiruk.util;

import com.romankushmiruk.model.entity.factory.TaxiCategory;
import com.romankushmiruk.model.entity.factory.TaxiFactory;
import com.romankushmiruk.model.entity.taxi.Taxi;
import com.romankushmiruk.view.View;

import java.util.Scanner;

public class TaxiScanner {
    private static final Scanner scanner = new Scanner(System.in);

    public static Taxi createTaxi(TaxiCategory category) {

        View.printMark();
        String mark = scanner.nextLine();
        View.printEngineCapacity();
        Integer engineCapacity = scanner.nextInt();
        View.printFuelPerKm();
        Integer fuelPerKm = scanner.nextInt();
        View.printYear();
        Integer yearOfIssue = scanner.nextInt();
        View.printSpeed();
        Integer speed = scanner.nextInt();
        View.printCost();
        Integer cost = scanner.nextInt();

        return TaxiFactory.createTaxi(category, mark, engineCapacity, fuelPerKm, yearOfIssue, speed, cost);
    }


}
