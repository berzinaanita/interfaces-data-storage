package com.company;

import java.util.List;

public class MySqlRepository implements DataStorageRepository {
    @Override
    public List<Dog> load() {
        System.out.println("MySql - load");
        return null;
    }

    @Override
    public void save(List<Dog> dogs) {
        System.out.println("MySql - save");
    }
}
