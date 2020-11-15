package com.company;

import java.util.ArrayList;
import java.util.List;

public class DogsStorageItem {
    List<Dog> dogs = new ArrayList<>();

    public List<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(List<Dog> dogs) {
        this.dogs = dogs;
    }


    //si klase nepieciesama, jo pa taisno ierakstot listu failaa, neierakstaas pareizi, un deserializeejot objektu, javeic papildu darbibas

}
