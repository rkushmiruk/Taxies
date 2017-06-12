package com.romankushmiruk.util;

import com.romankushmiruk.model.entity.factory.TaxiCategory;
import com.romankushmiruk.model.entity.factory.TaxiBuilderFactory;
import com.romankushmiruk.model.entity.taxi.Taxi;
import com.romankushmiruk.model.entity.taxi.builder.TaxiBuilder;
import com.romankushmiruk.view.View;

import java.util.Scanner;

public class TaxiScanner {
    private static final Scanner scanner = new Scanner(System.in);
    private static TaxiBuilder taxiBuilder;

    public static Taxi createTaxi(TaxiCategory category) {
        taxiBuilder = TaxiBuilderFactory.createTaxiBuilder(category);

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

        return taxiBuilder.mark(mark)
                .engineCapacity(engineCapacity)
                .buildCarClazz()
                .fuelPerKm(fuelPerKm)
                .yearOfIssue(yearOfIssue)
                .speed(speed)
                .buildStartPay()
                .buildPayPerKm()
                .cost(cost)
                .buildCondition()
                .build();
    }
}
