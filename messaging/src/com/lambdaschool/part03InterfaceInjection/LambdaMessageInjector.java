package com.lambdaschool.part03InterfaceInjection;

public class LambdaMessageInjector implements MessageServiceInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new LambdaMessagingImpl());
    }
}
