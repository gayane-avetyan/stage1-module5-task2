package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return list -> {
            List<Integer> newList = new ArrayList<>();
            for (Integer el : list)
                newList.add(el / divider);

            return newList;
        };
    }
}
