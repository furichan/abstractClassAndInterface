package priva.cassie.implementation;

import priva.cassie.interfaceDemo.Interface3;
import priva.cassie.interfaceDemo.Interface4;

public class ImplementInterface1 implements Interface3, Interface4 {
    public void display(){
        System.out.println("Interface 可以被多继承，多实现，先继承再实现");
    }

    @Override
    public void show(){
        System.out.println("Now override show() in Implement1 class");
    }

    @Override
    public void sleep(){
        System.out.println("Now override sleep() in Implement1 class");
    }

    @Override
    public void fighting(String tool) {
        System.out.println("Now override fighting() in Implement1 class");
    }

    @Override
    public void walk() {
        System.out.println("Now override walk() in Implement1 class");
    }

    @Override
    public void song() {
        System.out.println("Now override song() in Implement1 class");
    }

    @Override
    public void login(){
        System.out.println("Now override song() in Implement1 class");
    }

    @Override
    public void logout() {
        System.out.println("Now override logout() in Implement1 class");
    }
}
