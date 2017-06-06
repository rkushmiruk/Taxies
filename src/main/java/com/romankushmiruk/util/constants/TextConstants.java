package com.romankushmiruk.util.constants;

import java.util.ResourceBundle;

public interface TextConstants {
    String resourceName = "StringConstants";
    ResourceBundle resourceBundle = ResourceBundle.getBundle(resourceName);


    String MARK = resourceBundle.getString("MARK");
    String ENGINE_CAPACITY = resourceBundle.getString("ENGINE_CAPACITY");
    String YEAR_OF_ISSUE = resourceBundle.getString("YEAR_OF_ISSUE");
    String FUEL_PER_KM = resourceBundle.getString("FUEL_PER_KM");
    String SPEED = resourceBundle.getString("SPEED");
    String COST = resourceBundle.getString("COST");
}
