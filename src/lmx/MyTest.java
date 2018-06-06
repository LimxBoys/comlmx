import java.util.HashMap;
import java.util.Map;

public class MyTest {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        StringBuffer buffer=new StringBuffer();
        buffer.append("select * from fc_costbill ");
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("asdf","asdf");
        System.out.println(buffer.toString()+map.get("asdf"));
    }
}
