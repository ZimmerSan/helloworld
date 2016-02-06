package com.google.training.helloworld;

public class HelloClass {
    public String message = "Hello World";

    public HelloClass () {
    }

    public HelloClass (String name) {
        this.message = "Hello " + name + "!";
    }

    public HelloClass (String name, String period) {
        this.message = "Hello " + name + "! Your period is " + period;
    }

    public HelloClass (String name, int age) {
        this.message = "Hello " + name + "! Your age: " + age;
    }

    public String getMessage() {
        return message;
    }
}
