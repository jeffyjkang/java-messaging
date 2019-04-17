package com.lambdaschool.part02ConstructorInjection;

public class MyApplication
{
    // constructor injections
    private MessageService msgSrv;

    public MyApplication(MessageService msgSrv)
    {
        this.msgSrv = msgSrv;
    }

    public void send(String msg, String receiveAddress)
    {
        // rules of messaging
        msg = msg + "\n *** FOR YOUR EYES ONLY ***";
        msgSrv.sendMessage(msg, receiveAddress);
    }
}
