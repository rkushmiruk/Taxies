package com.romankushmiruk.util;

import java.util.ResourceBundle;

public interface EngineCapacity {
    String resourceName = "EngineCapacity";
    ResourceBundle resourceBundle = ResourceBundle.getBundle(resourceName);
    int B1_CAPACITY = Integer.parseInt(resourceBundle.getString("B1_CAPACITY"));
    int B2_CAPACITY = Integer.parseInt(resourceBundle.getString("B2_CAPACITY"));
    int B3_CAPACITY = Integer.parseInt(resourceBundle.getString("B3_CAPACITY"));
    int B4_CAPACITY = Integer.parseInt(resourceBundle.getString("B4_CAPACITY"));
}
