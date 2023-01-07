package priva.cassie.abstractTest;

import org.junit.Test;
import priva.cassie.abstractDemo.Abstract1;
import priva.cassie.inhert.InheritAbstract1;
import priva.cassie.inhert.InheritAbstract3;
import priva.cassie.inhert.InheritAbstractImplementInterface1;


public class JunitTest {
    @Test
    public void test_01(){
        System.out.println("抽象类和接口都不能被实例化,但是可以new后加“{ };”，然后在里面重写抽象方法，会自动生成一个代理对象");
        Abstract1 abstractDemo = new Abstract1() {
            @Override
            public void show() {
                System.out.println("在对象中重写抽象类对象");
            }
        };
        abstractDemo.show();
        System.out.println(abstractDemo.getAge());
        System.out.println("抽象类的静态常量COLOUR值："+Abstract1.COLOUR);

    }

    @Test
    public void test_02(){
        InheritAbstract1 demo=new InheritAbstract1();
        demo.show();
        System.out.println(demo.getSex());
    }

    @Test
    public void test_03(){
        InheritAbstractImplementInterface1 inheritAbstractImplementInterface1 = new InheritAbstractImplementInterface1();
        inheritAbstractImplementInterface1.sleep();
        inheritAbstractImplementInterface1.fighting("");
        inheritAbstractImplementInterface1.showTime();
    }

    @Test
    public void test_04(){
        InheritAbstract3 inheritAbstract3 = new InheritAbstract3();
        inheritAbstract3.tell();
        inheritAbstract3.display();
    }
}
