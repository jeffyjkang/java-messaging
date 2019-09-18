package com.lambdaschool.part03InterfaceInjection;

public class LambdaTeletypeServiceInjector implements MessageServiceInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new LambdaTeletypeImpl());
    }
}

