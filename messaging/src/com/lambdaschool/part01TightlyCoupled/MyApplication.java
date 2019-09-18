package com.lambdaschool.part01TightlyCoupled;

public class MyApplication
{
    private MessageService msgSrv = new MessageService();

    public void send(String msg, String receiveAddress)
    {
        // rules of messaging
        msg = msg + "\n *** FOR YOUR EYES ONLY ***";
        msgSrv.sendMessage(msg, receiveAddress);
    }
}
