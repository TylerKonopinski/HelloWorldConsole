package com.applications.world.hello;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldConsoleTest {

    @Test
    public void printText() {
        HelloWorldConsole hwc = new HelloWorldConsole();

        assertEquals("hello there", hwc.printText());
    }
}