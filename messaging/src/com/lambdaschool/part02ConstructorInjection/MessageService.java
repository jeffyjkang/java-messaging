package com.lambdaschool.part02ConstructorInjection;

public class MessageService
{
    public void sendMessage(String message, String address)
    {
        // sout
        System.out.println("For " + address + ": " + message);
    }
    public String readMessage()
    {
        return ("Not Implemented");
    };
}
