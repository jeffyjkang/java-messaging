package com.lambdaschool.part03InterfaceInjection;

public class LambdaMessagingImpl implements MessageService
{
    @Override
    public void sendMessage(String message, String Address)
    {
        // could be replaced with putting message on a stack
        System.out.println("For " + Address + ": " + message);
    }

    @Override
    public String readMessage()
    {
        // could pop the message from the stack
        return "Not Implemented";
    }
}
