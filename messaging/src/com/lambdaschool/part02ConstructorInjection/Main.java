package com.lambdaschool.part02ConstructorInjection;

public class Main
{

    public static void main(String[] args)
    {
        // Constructor dependency injection
        MyApplication messaging = new MyApplication(new MessageService());
        messaging.send("Hello", "JRMMBA8314");
    }
}
