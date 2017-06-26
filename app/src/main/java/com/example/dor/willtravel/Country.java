package com.example.dor.willtravel;

/**
 * Created by Dor on 23/6/17.
 */

public class Country {
    private String name;
    private String[] vaccines;
    public Country(String name,String[] vaccines){
        this.name=name;
        this.vaccines=vaccines;
    }

    public String[] getVaccines() {
        return vaccines;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return this.name;
    }
}
