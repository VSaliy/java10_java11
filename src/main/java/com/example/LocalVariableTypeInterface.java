package com.example;

import java.util.ArrayList;
import java.util.List;

public class LocalVariableTypeInterface {

    public static void main(String[] args) {
        System.out.println("Hello world ");
    }

    public void localVariableTypeInterface() {
        String programmingLanguage = "Kotlin";
        Object programmingLanguage2 = "Kotlin";
        var programmingLanguage3 = "Java";
        Object programmingLanguage4 = null;
        test1(programmingLanguage);
        test1(programmingLanguage2);
        test1(programmingLanguage3);
        test1(programmingLanguage4);
        System.out.println(programmingLanguage.equals(programmingLanguage2));
    }

    public void test1(Object o) {
        System.out.println("test1");
    }

    public void test1(String s) {
        System.out.println("test2");
    }

    public void before() {
        List<String> list = new ArrayList<String>();
        List<String> list2 = new ArrayList<>();
        int myFavouriteNumber = 12;
        Object programmingLanguage = "Java";
    }

    public void after() {
        var list = new ArrayList<String>();
        var myFavouriteNumber = 12;

        var programmingLanguage= "Java";
        programmingLanguage = "Kotlin";

    }
}
