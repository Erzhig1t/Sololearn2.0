package com.company;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args){
        // write your code here
     ArrayList<Student> students = new ArrayList<>();
     students.add(new Student("Asan", 23));
     try {
         students.add(new Student("Samat", -2));
     }catch (ArithmeticException e){
         System.out.println(e.getMessage());
         students.add(null);
     }catch (NullPointerException e) {
         System.out.println(e.getMessage());
     }finally {
         System.out.println("Buttu");
     }
        System.out.println(students);
    }
}
