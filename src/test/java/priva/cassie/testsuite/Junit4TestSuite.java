package priva.cassie.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import priva.cassie.abstractTest.JunitTest;
import priva.cassie.otherTest.MyTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({

        JunitTest.class,
        MyTest.class

})
public class Junit4TestSuite {
}
