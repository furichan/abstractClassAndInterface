package priva.cassie.implementation;

import priva.cassie.interfaceDemo.Interface1;

public abstract class AbstractImplementInterface1 implements Interface1 {
    @Override
    public void sleep(){
        System.out.println("abstract class can implement Interface and override sleep() in Interface1");
    }

    @Override
    public void fighting(String tool){
        System.out.println("abstract class can implement Interface and override fighting() in Interface1");
    }

    public void showTime(){
        System.out.println("This is show time");
    }
}
