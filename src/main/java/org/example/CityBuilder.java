package org.example;

public class CityBuilder {
    private String name;
    private String region;
    private String district;
    private int population;
    private String foundation;

    public CityBuilder name(String name) {
        this.name = name;
        return this;
    }

    public CityBuilder region(String region) {
        this.region = region;
        return this;
    }

    public CityBuilder district(String district) {
        this.district = district;
        return this;
    }

    public CityBuilder population(int population) {
        this.population = population;
        return this;
    }

    public CityBuilder foundation(String foundation) {
        this.foundation = foundation;
        return this;
    }

    public City build() {
        return new City(name, region, district, population, foundation);
    }


}
