package priva.cassie.implementation;

import priva.cassie.interfaceDemo.Interface4;

public class ImplementInterface2 implements Interface4 {
    @Override
    public void login(){
        System.out.println("Override login() of Implement2 that implements Interface4 in other package");
    }

    @Override
    public void logout() {

    }
}
