package com.lambdaschool.part03InterfaceInjection;

public interface Processor
{
    void sendMessage(String mgs, String address);
    String readMessage();
}
