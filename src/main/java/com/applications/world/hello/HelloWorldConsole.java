package com.applications.world.hello;

public class HelloWorldConsole {

    public String printText() {
        return "Hello, world!";
    }

    public static void main(String[] args) {

        HelloWorldConsole hwc = new HelloWorldConsole();

        System.out.println(hwc.printText());
    }
}
