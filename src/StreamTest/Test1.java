package StreamTest;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Test1 {
    @Test
    public void test2(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer sum1 = list.stream().reduce(0,Integer::sum);
        System.out.println(sum1);
    }

}
