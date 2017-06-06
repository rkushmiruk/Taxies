package com.romankushmiruk.util.iterator;

import com.romankushmiruk.model.entity.taxi.Taxi;

import java.util.List;

public interface CustomIterator {
    void first();

    void next();

    boolean isDone();

    Taxi currentItem();

    void sortList(List<Taxi> list);
}
