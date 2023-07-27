package org.example;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    static List<City> cities = new ArrayList<>();
    static File fileCities = new File("cityFile.csv");

    public static void main(String[] args) throws FileNotFoundException {

        loadCitiesFromFile();

        for (City city : cities) {
            System.out.println(city);
            System.out.println();
        }


    }

    private static void loadCitiesFromFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(fileCities);

        while (scanner.hasNext()) {

            String[] str = scanner.nextLine().split(";");
            CityBuilder cityBuilder = new CityBuilder()
                    .name(str[1])
                    .region(str[2])
                    .district(str[3])
                    .population(parseInt(str[4]));
            if (str.length > 5) {
                City city = cityBuilder
                        .foundation(str[5])
                        .build();
                cities.add(city);
            } else {
                City city = cityBuilder.build();
                cities.add(city);
            }

        }
    }

}