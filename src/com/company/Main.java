package com.company;

import java.util.*;

public class Main {
    /*City деген класс тузунуз. (code, name, ...)
Эгерде code так сан болсо TreeSetke салыныз.
Аларды чонунан кичинесине караган тартипте чыгарыныз.*/
    public static void main(String[] args) {
        // write your code here

        Set<City> city = new HashSet<>();

        city.add(new City(222, "Paris"));
        city.add(new City(275, "Mexico"));
        city.add(new City(293, "stambul"));
        city.add(new City(486, "Praga"));
        city.add(new City(88, "Amsterdam"));
        city.add(new City(389, "London"));
        city.add(new City(585, "Madrid"));

        Set<City> takSort = new TreeSet<>(city);
        for (City city1 : takSort) {
            if (city1.getCode() % 2 != 0) {
                System.out.println(city1);
            }
        }


    }
}
