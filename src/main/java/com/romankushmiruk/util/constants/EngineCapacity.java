package com.romankushmiruk.util.constants;

import java.util.ResourceBundle;

public interface EngineCapacity {
    String resourceName = "EngineCapacity";
    ResourceBundle resourceBundle = ResourceBundle.getBundle(resourceName);

    Integer B1_CAPACITY = Integer.parseInt(resourceBundle.getString("B1_CAPACITY"));
    Integer B2_CAPACITY = Integer.parseInt(resourceBundle.getString("B2_CAPACITY"));
    Integer B3_CAPACITY = Integer.parseInt(resourceBundle.getString("B3_CAPACITY"));
    Integer B4_CAPACITY = Integer.parseInt(resourceBundle.getString("B4_CAPACITY"));
}
