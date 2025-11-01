package com.my.hello;

public class assignment5_Hello {
    String toWhom = "world";
    public assignment5_Hello() {
    }
    public assignment5_Hello(String toWhom) {
        this.toWhom = toWhom;
    }
    public void sayHello() {
        System.out.printf("hello %s!", toWhom);
    }
}
