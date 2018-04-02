package com.example.goro.visitvanadzor;

class Person {
    String name;
    String age;

    int photoId;

//    public static String getName() {
//        return name;
//    }
//
//    public static void setName(String name) {
//        Person.name = name;
//    }

    Person(String name, String age, int photoId) {
        this.name = name;
        this.age = age;
        this.photoId = photoId;
    }
}