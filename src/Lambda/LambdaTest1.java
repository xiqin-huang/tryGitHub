package Lambda;

import org.junit.Test;

import java.io.PrintStream;
import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.function.Consumer;

import static java.lang.Integer.compare;

public class LambdaTest1 {
    @Test
    //1.无参，无返回值
    public void test1(){
        Runnable r2 = () -> System.out.println("hello,world");
        r2.run();
    }

    @Test
    public void test2(){
        Consumer<String> con1 = (s) -> {
            System.out.println(s);
        };
        con1.accept("hello,world");
        System.out.println("===========");
        PrintStream ps = System.out;
        Consumer<String> con2 = ps::println;
        con2.accept("hello,beijing");
    }

    @Test
    public void test3(){
        Comparator<Integer> com = (o1,o2) -> o1.compareTo(o2);
        System.out.println(com.compare(11,12));

        Comparator<String> com2 = String :: compareTo;
        System.out.println(com2.compare("abd","dsada"));
    }
}
