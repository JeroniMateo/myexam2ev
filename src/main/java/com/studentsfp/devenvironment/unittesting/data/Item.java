package com.studentsfp.devenvironment.unittesting.data;

/**
 *
 */
public class Item {
    private String name;
    private String country;
    private String region;
    private String island;
    private String description;

    public Item(){

    }

    public Item(String city,String  name, String country,String region, String island, String description){
        setName(name);
        setCountry(country);
        setRegion(region);
        setIsland(island);
        setDescription(description);
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getIsland() {
        return island;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry(String country) {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion(String region) {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getIsland(String island) {
        return this.island;
    }

    public void setIsland(String island) {
        this.island = island;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String todo;

    public String getTodo() {
        return todo;
    }




    public void setTodo(String todo) {
        this.todo = todo;
    }
}
