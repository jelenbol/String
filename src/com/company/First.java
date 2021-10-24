package com.company;

public class First {
    public static void main(String[] args) {

        String[] values = {"Computer", "Plate", "Chair", "Girl", "Boy", "Cat", "Dog", "Shirt", "Determination"};
        {
            startsWithC(values);
            endsWithF(values);
        }
    }

    public static void startsWithC(String[] values) {

        int letter = 0;

        for (int i = 0; i < values.length; i++)
            if (values[i].charAt(0) == 'C')
                letter++;
        System.out.printf(" %s words start with C;", letter);

    }


    public static void endsWithF(String[] values) {


    }
}

















