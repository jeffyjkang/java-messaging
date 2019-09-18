package com.lambdaschool.part02ConstructorInjection;

public class YourMessageService extends MessageService
{
    @Override
    public void sendMessage(String message, String address)
    {
        System.out.println(address + ":" + message);
    }

    @Override
    public String readMessage()
    {
        return "Not Implemented";
    }
}
