import com.gpower.Hello;
import org.junit.Test;

public class Test01 {
    @Test
    public void testHello(){
        Hello hello = new Hello();
        System.out.println(hello.sayHello());
    }
}
