package com.taobao.test.agent;

import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;
import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;

import java.io.IOException;

/**
 * @author xinan
 * @date 2020/6/17
 */
public class AttachMain {
    public static void main(String[] args)
        throws IOException, AgentLoadException, AgentInitializationException, AttachNotSupportedException {
        // attach方法参数为目标应用程序的进程号
        VirtualMachine vm = VirtualMachine.attach("20993");
        // 请用你自己的agent绝对地址，替换这个
        vm.loadAgent("/Users/bianzhaoyu/IdeaProjects/testagent/agent/target/agent-1.0.0-SNAPSHOT-jar-with-dependencies.jar");
    }
}
