package com;

public class Main {
    public static void main(String[] args) {
        //task1
        IntChar notInit = new IntChar();
        System.out.println("not initialized char:" + notInit.getNotInitChar());
        System.out.println("not initialized int:" + notInit.getNotInitInt());

        //task2
        HelloWorld sayer = new HelloWorld();
        sayer.sayHelloWorld();

        //task3
        ATypeName smth = new ATypeName();

        //task4
        DataOnly data = new DataOnly();

        //task5
        data.i = 47;
        data.d = 1.1;
        data.b = false;
        System.out.println("i=" + data.i + "\nd=" + data.d + "\nb=" + data.b);

        //task6
        Main a = new Main();
        System.out.println("Hello world - " + a.storage("Hello world"));

        //task7
        Incrementable fl = new Incrementable();
        fl.increment();
        Incrementable.increment();
        System.out.println(StaticTest.i);

        //task8
        Incrementable dem1 = new Incrementable();
        Incrementable dem2 = new Incrementable();
        dem1.increment();
        dem2.increment();
        Incrementable dem3 = new Incrementable();
        System.out.println(StaticTest.i);

        //task9
        boolean b = true;
        Boolean B;
        B = b;
        System.out.println("boolean: " + B);

        char ch = 'c';
        Character Ch;
        Ch = ch;
        System.out.println("char: " + Ch);

        byte by = 3;
        Byte By;
        By = by;
        System.out.println("byte: " + By);

        short sh = 6;
        Short Sh;
        Sh = sh;
        System.out.println("short: " + Sh);

        int i = 1;
        Integer I;
        I = i;
        System.out.println("integer: " + I);

        long l = 9;
        Long L;
        L = l;
        System.out.println("long integer: " + L);

        float f = (float) 1.1;
        Float F;
        F = f;
        System.out.println("float: " + F);

        double d = 3.4;
        Double D;
        D = d;
        System.out.println("double: " + D);

        //task10
        /*for(int j = 0;  j < 3; j++ ){
               System.out.println(args[j]+" ");
          }*/

        //task11
        AllTheColorsOfTheRainbow allTheColorsOfTheRainbow = new AllTheColorsOfTheRainbow();
        allTheColorsOfTheRainbow.ChangeTheHueOfTheColor(0);
        System.out.println(allTheColorsOfTheRainbow.anIntegerRepresentingColors);

        //task12
        HelloDate helloDate = new HelloDate();
        helloDate.runHelloDate();
    }

    int storage(String s) {
        return s.length() * 2;
    }
}
