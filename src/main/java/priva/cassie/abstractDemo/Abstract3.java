package priva.cassie.abstractDemo;


public abstract class Abstract3 extends Abstract2{
    public void display(){
        System.out.println("抽象类不允许多继承,只能单继承；抽象类没有实现的说法，只有接口才能被实现");
    }

    @Override
    public void tell(){
        System.out.println("在抽象类的子类中重载tell()");
    }
}
