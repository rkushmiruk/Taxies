package com.romankushmiruk.util.iterator;

import com.romankushmiruk.model.Taxis;
import com.romankushmiruk.model.entity.taxi.Taxi;

import java.util.Iterator;
import java.util.List;

public class TaxiIterator implements CustomIterator {
    private Taxis taxis;
    private Taxi current;
    private Iterator<Taxi> iterator;
    private boolean done;

    public TaxiIterator(Taxis taxis) {
        this.taxis = taxis;
    }

    @Override
    public void first() {
        iterator = taxis.getAllTaxis().iterator();
        next();
    }

    @Override
    public void sortList(List<Taxi> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (list.get(j).getFuelPerKm() > list.get(j + 1).getFuelPerKm()) {
                    int temp = list.get(j).getFuelPerKm();
                    list.get(j).setFuelPerKm(list.get(j + 1).getFuelPerKm());
                    list.get(j + 1).setFuelPerKm(temp);
                }
            }
        }
    }

    @Override
    public void next() {
        if (iterator.hasNext()) {
            current = iterator.next();
        } else {
            done = true;
        }
    }

    @Override
    public boolean isDone() {
        return done;
    }

    @Override
    public Taxi currentItem() {
        return current;
    }
}
