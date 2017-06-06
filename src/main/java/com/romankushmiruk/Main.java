package com.romankushmiruk;

import com.romankushmiruk.controller.Controller;
import com.romankushmiruk.model.Taxis;

public class Main {
    public static void main(String[] args) {
        Taxis taxis = Taxis.getInstance();

        Controller controller = new Controller(taxis);

        controller.initTaxis();

        System.out.println(controller.getTaxisCost());

        controller.sortTaxis(taxis.getAllTaxis());
        System.out.println(taxis.getAllTaxis());

        System.out.println(controller.searchTaxiBetweenSpeed(15, 300));

    }
}
