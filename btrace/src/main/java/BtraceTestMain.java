import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.*;

import java.util.Map;

import static com.sun.btrace.BTraceUtils.*;

/**
 * @author xinan
 * @date 2020/6/18
 */
@BTrace
public class BtraceTestMain {

    /**
     * @param @Self object	调用对象
     * @param id	参数
     * @param @Return map	返回值
     * @param @Duration time	响应时间
     */
    @OnMethod(clazz = "com.taobao.test.demo.SimpleMain", method = "print", location = @Location(Kind.RETURN))
    public static void traceExecute(@Self Object object, String id, @Return Map<String, String> map , @Duration long time) {
        println("调用堆栈！！");
        BTraceUtils.println("parameter  object = "+ object );
        BTraceUtils.println("parameter  id = "+ id );
        BTraceUtils.println("result  map = "+ map );
        BTraceUtils.println("cost  time = "+ time );
        jstack();
    }


}
