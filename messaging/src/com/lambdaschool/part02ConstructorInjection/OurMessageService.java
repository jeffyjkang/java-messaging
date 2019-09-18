package com.lambdaschool.part02ConstructorInjection;

public class OurMessageService extends MessageService
{
    @Override
    public void sendMessage(String message, String address)
    {
        System.out.println("FOR " + address + ": " + message);
    }

    @Override
    public String readMessage()
    {
        return "Not Implemented";
    }
}
