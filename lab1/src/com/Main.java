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
        
    }

    int storage(String s) {
        return s.length() * 2;
    }
}
