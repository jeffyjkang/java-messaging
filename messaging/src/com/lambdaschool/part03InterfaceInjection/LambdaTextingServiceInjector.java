package com.lambdaschool.part03InterfaceInjection;

public class LambdaTextingServiceInjector implements MessageServiceInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new LambdaTextingImpl());
    }
}
