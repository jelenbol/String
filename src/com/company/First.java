package com.company;

public class First {
    public static void main(String[] args) {

        String[] values = {"Computer", "Plate", "Chair", "Girl", "Boy", "Cat", "Dog", "Shirt", "Determination"};
        {
            startsWithC(values);
            endsWithE(values);
            lenghtIsFive(values);
            withCharacterE(values);
            withSubStringTe(values);
        }
    }


    public static void startsWithC(String[] values) {

        int letter = 0;

        for (int i = 0; i < values.length; i++)
            if (values[i].charAt(0) == 'C')
                letter++;
        System.out.printf(" %s words start with C;", letter);

    }


    public static void endsWithE(String[] values) {

        int letter = 0;

        for (int i = 0; i < values.length; i++)
            if (values[i].endsWith("e"))
                letter++;

        System.out.println(+letter + " word ends with letter 'e';");
    }


    public static void lenghtIsFive(String[] values) {

        int five = 0;

        for (int i = 0; i < values.length; i++)
            if (values[i].length() == 5) five++;

        System.out.println(+five + "words consist of 5 characters;");
    }


    public static void withCharacterE(String[] values) {

        int character = 0;

        for (int i = 0; i < values.length; i++)
            if (values[i].contains("e"))
                character++;

        System.out.println(+character + "words contain letter 'e';");
    }

    public static void withSubStringTe(String[] values) {

        int te = 0;

        for (int i = 0; i < values.length; i++)
            if (values[i].contains("te"))
                System.out.println(+te + "contains 'te'");

        //it does not work properly


    }

}





















