package com.romankushmiruk.model.entity.car;

import static com.romankushmiruk.util.constants.EngineCapacity.*;

public enum CarClass {
    B1, B2, B3, B4;

    public static CarClass getCarClazz(int engineCapacity) {
        if (numberBetween(engineCapacity, B1_CAPACITY, B2_CAPACITY)) {
            return B1;
        } else if (numberBetween(engineCapacity, B2_CAPACITY, B3_CAPACITY)) {
            return B2;
        } else if (numberBetween(engineCapacity, B3_CAPACITY, B4_CAPACITY)) {
            return B3;
        }
        return B4;
    }

    private static boolean numberBetween(int number, int start, int finish) {
        return (number >= start && number < finish);
    }
}
