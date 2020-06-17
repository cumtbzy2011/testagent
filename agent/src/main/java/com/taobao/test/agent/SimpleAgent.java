package com.taobao.test.agent;

import java.lang.instrument.Instrumentation;

/**
 * @author xinan
 * @date 2020/6/17
 */
public class SimpleAgent {

    /**
     * jvm参数方式启动运行（在启动jvm时指定-javaagent:xxx.jar）
     * @param agentArgs
     * @param agentArgs
     */
    public static void premain(String agentArgs, Instrumentation instrumentationΩ) {
        System.out.println("premain");
    }

    /**
     * attach方式启动运行（jvm启动时并没有使用-javaagent:xxx.jar指定代理包，此时仍要启动agent时使用）
     * @param agentArgs
     * @param instrumentation
     */
    public static void agentmain(String agentArgs, Instrumentation instrumentation) {
        System.out.println("agentmain");
    }

}
