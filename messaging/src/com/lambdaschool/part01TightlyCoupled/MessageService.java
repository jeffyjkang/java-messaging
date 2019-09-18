package com.lambdaschool.part01TightlyCoupled;

public class MessageService
{
    public void sendMessage(String message, String address)
    {
        // sout
        //format: For address : message
        System.out.println("For " + address + ": " + message);
    }

    public String readMessage()
    {
        return ("Not Implemented");
    };

}
