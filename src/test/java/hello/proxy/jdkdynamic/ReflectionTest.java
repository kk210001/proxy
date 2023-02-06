package hello.proxy.jdkdynamic;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;


@Slf4j
public class ReflectionTest {

    @Test
    void reflection0(){

        Hello target = new Hello();

        log.info("start");
        String result1 = target.callA();
        log.info("result={}",result1);

        log.info("start");
        String result2 = target.callB();
        log.info("result={}",result2);
    }

    @Slf4j
    static class Hello {

        public String callA() {
            log.info("callA");
            return "A";
        }
        public String callB() {
            log.info("callB");
            return "B";
        }
    }

}
