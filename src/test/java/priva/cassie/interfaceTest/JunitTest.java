package priva.cassie.interfaceTest;

import org.junit.Test;
import priva.cassie.implementation.ImplementInterface2;
import priva.cassie.implementation.ImplementInterface1;
import priva.cassie.interfaceDemo.Interface3;
import priva.cassie.interfaceDemo.Interface4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JunitTest {
    @Test
    public void test_01(){
        ImplementInterface1 implementInterface1 = new ImplementInterface1();
        implementInterface1.display();
        implementInterface1.login();
        implementInterface1.sleep();
        implementInterface1.show();
        implementInterface1.song();
        implementInterface1.walk();
        implementInterface1.fighting("Knife");
        implementInterface1.logout();
    }

    @Test
    public void test_02(){
        System.out.println("抽象类和接口都不能被实例化,但是可以new后加“{ };”，然后在里面重写抽象方法，会自动生成一个代理对象");
        Interface4 interface4 = new Interface4() {
            @Override
            public void login() {
                System.out.println("在对象中重写接口Interface4的方法login()");
            }

            @Override
            public void logout() {
                System.out.println("在对象中重写接口Interface4的方法logout()");
            }
        };

        interface4.login();
        interface4.logout();
    }

    @Test
    public void test_03(){
        Interface3 interface3 = new Interface3() {
            @Override
            public void show() {
                System.out.println("在对象中重写接口Interface3的方法show()");
            }

            @Override
            public void sleep() {

            }

            @Override
            public void fighting(String tool) {

            }

            @Override
            public void walk() {

            }

            @Override
            public void song() {

            }
        };
        interface3.show();

        System.out.println("接口中的静态常量COLOUR值："+Interface3.COLOUR);
    }

    @Test
    public void test_04(){
        ImplementInterface2 implementInterface2 = new ImplementInterface2();
        implementInterface2.login();
    }

    @Test
    public void test_05(){
        HashMap<String,String> map=new HashMap<>();
        map.put("years","9");
        map.put("sex","female");
        ArrayList arrayList = new ArrayList();
        arrayList.add("cassie");
        arrayList.add("jenny");
        arrayList.add(33);
        arrayList.add(map);
        System.out.println(arrayList);

    }
}
