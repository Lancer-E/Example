package com.lizhanxu.netty.DynamicProxy;

public class HelloWorldImpl implements HelloWorld {
    @Override
    public void sayHelloWorld() {
        System.out.println("Hello World.");
    }
}
