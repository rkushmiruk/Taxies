package com.romankushmiruk.util.constants;

import java.util.ResourceBundle;

public interface Rate {
    String resourceName = "TaxiRate";
    ResourceBundle resourceBundle = ResourceBundle.getBundle(resourceName);

    Integer ECONOMY_TAXI_START_RATE = Integer.parseInt(resourceBundle.getString("ECONOMY_TAXI_START_RATE"));
    Integer COMFORT_TAXI_START_RATE = Integer.parseInt(resourceBundle.getString("COMFORT_TAXI_START_RATE"));
    Integer BUSINESS_TAXI_START_RATE = Integer.parseInt(resourceBundle.getString("BUSINESS_TAXI_START_RATE"));
    Integer PREMIUM_TAXI_START_RATE = Integer.parseInt(resourceBundle.getString("PREMIUM_TAXI_START_RATE"));

    Integer ECONOMY_TAXI_PER_KM_RATE = Integer.parseInt(resourceBundle.getString("ECONOMY_TAXI_PER_KM_RATE"));
    Integer COMFORT_TAXI_PER_KM_RATE = Integer.parseInt(resourceBundle.getString("COMFORT_TAXI_PER_KM_RATE"));
    Integer BUSINESS_TAXI_PER_KM_RATE = Integer.parseInt(resourceBundle.getString("BUSINESS_TAXI_PER_KM_RATE"));
    Integer PREMIUM_TAXI_PER_KM_RATE = Integer.parseInt(resourceBundle.getString("PREMIUM_TAXI_PER_KM_RATE"));

}
