package com.lambdaschool.part03InterfaceInjection;

public interface MessageService
{
    void sendMessage(String msg, String receiveAddress);
    String readMessage();
}
