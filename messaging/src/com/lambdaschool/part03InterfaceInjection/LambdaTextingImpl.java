package com.lambdaschool.part03InterfaceInjection;

public class LambdaTextingImpl implements MessageService
{
    @Override
    public void sendMessage(String msg, String receiveAddress)
    {
        // push to stack?
        System.out.println(msg + ":" + receiveAddress.toUpperCase());
    }

    @Override
    public String readMessage()
    {
        // pop from stack
        return "Not Implemented";
    }
}
