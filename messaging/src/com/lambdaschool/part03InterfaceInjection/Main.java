package com.lambdaschool.part03InterfaceInjection;

public class Main
{

    public static void main(String[] args)
    {
        String myMsg = "Come Here--I want to see you.";
        String myAddress = "Mr. Watson";
        String myText = "Watson";

        MessageServiceInjector injector;
        Processor app;

        System.out.println();
        System.out.println();
        System.out.println();

        // send Lambda Message
        injector = new LambdaMessageInjector();
        app = injector.getProcess();
        app.sendMessage(myMsg, myAddress);

        System.out.println();
        System.out.println();
        System.out.println();

        // send Lambda Texting
        injector = new LambdaTextingServiceInjector();
        app = injector.getProcess();
        app.sendMessage(myMsg, myText);

        System.out.println();
        System.out.println();
        System.out.println();

        // send Lambda Teletype
        injector = new LambdaTeletypeServiceInjector();
        app = injector.getProcess();
        app.sendMessage(myMsg, myAddress);
    }
}
