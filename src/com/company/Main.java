package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose data storage Json(J), Xml(X), MySql(M): ");
        var storage = scanner.nextLine();

        DataStorageRepository repo;

        if (storage.equals("J")) {
            repo = new JsonRepository();
        } else if (storage.equals("X")) {
            repo = new XmlRepository();
        } else if (storage.equals("M")) {
            repo = new MySqlRepository();
        } else {
            return;
        }

        var data = repo.load();

        for (var dog:data ) {
            System.out.println(dog.getNickname());
        }
//
//        List<Dog> data = new ArrayList<>();
//        var dog1 = new Dog("Pēcis", 5d, "Ch12345");
//        var dog2 = new Dog("Čipsis", 1d, "Ch457895");
//
//        data.add(dog1);
//        data.add(dog2);
//
//        repo.save(data);

    }
}
