package com.lambdaschool.part02ConstructorInjection;

public class Main
{
    // psvm <tab>
    public static void main(String[] args)
    {
        MyApplication ourmessaging = new MyApplication(new OurMessageService());
        ourmessaging.send("Hello", "JRMMBA8314");

        MyApplication yourmessaging = new MyApplication(new YourMessageService());
        yourmessaging.send("Good Bye", "JRMMBA@OUTLOOK.COM");
    }
}
