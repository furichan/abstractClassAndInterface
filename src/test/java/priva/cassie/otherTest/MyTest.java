package priva.cassie.otherTest;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.Parameterized;


public class MyTest {

    @Test(timeout = 0)
    public void test_01(){
//        ==：运算符，用于比较基础类型变量和引用类型变量。
        short s1 = 1;
        long l1 = 1;
        // 对于基础类型变量，比较的变量保存的值是否相同，类型不一定要相同。
        // 结果：true。类型不同，但是值相同
        System.out.println(s1 == l1);

        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        // 对于引用类型变量，比较的是两个对象的地址是否相同
        // 结果：false。通过new创建，在内存中指向两个不同的对象
        System.out.println(i1 == i2);
    }

    @Ignore
    @Test
    public void test_02(){
//        equals：Object 类中定义的方法，通常用于比较两个对象的值是否相等。
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        // 结果：true。两个不同的对象，但是具有相同的值
        System.out.println(i1.equals(i2));
    }




}
