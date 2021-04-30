import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountAlgorithmTest extends CountAlgorithm {
    private  static CountAlgorithm c=null;
    @BeforeEach
    void setUp() {
        int flag=50;
        c =new CountAlgorithm();
    }

    @AfterEach
    void tearDown() {
        c=null;
    }

    @Test
    void countAlgorithm() {
        int flag=50;
        if(CountAlgorithm.CountAlgorithm("1+2+3=")<=flag && -CountAlgorithm.CountAlgorithm("1+2+3=")<=flag)
        {
            System.out.println("测试成功");
        }
        if(CountAlgorithm.CountAlgorithm("1*2*6=")<=flag && -CountAlgorithm.CountAlgorithm("1*2*6")<=flag)
        {
            System.out.println("测试成功");
        }
        if(CountAlgorithm.CountAlgorithm("100/20+5=")<=flag && -CountAlgorithm.CountAlgorithm("100/20+5")<=flag)
        {
            System.out.println("测试成功");
        }
        if(CountAlgorithm.CountAlgorithm("(1+7)*28=")>=flag && CountAlgorithm.CountAlgorithm("(1+7)*28=")>=flag)
        {
            System.out.println("测试成功");
        }
        if(CountAlgorithm.CountAlgorithm("100*20-20*63-50=")>=flag && CountAlgorithm.CountAlgorithm("100*20-20*63-50=")>=flag)
        {
            System.out.println("测试成功");
        }
    }
}