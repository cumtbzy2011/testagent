1. 先打包agent:进入agent目录  mvn clean package
2. 再打包demo:进入demo目录 mvn clean package
3. 启动demo:进入testagent目录 java -javaagent:agent/target/agent-1.0.0-SNAPSHOT-jar-with-dependencies.jar -jar demo/target/demo-jar-with-dependencies.jar
4. 启动attachMain


1. 在服务器安装btrace(MAC环境下安装):
    a. mac的全局环境变量配置文件为(全局：/etc/paths， 用户：~/.bash_profile)
    b. 下载btrace脚本运行器https://github.com/btraceio/btrace并解压
    c. 添加btrace命令的环境变量
        i. vim ~/.bash_profile
        ii. 追加 export BTRACE_HOME="/Users/bianzhaoyu/Desktop/program/btrace"
                export PATH=$BTRACE_HOME/bin:$PATH
    d. 保存，使环境变量生效：source ~/.bash_profile
    f. 检查是否生效：echo $PATH   
    g. 运行检查：btrace --version               
2. 如果提示没有JAVA_HOME，那么还要设置JAVA_HOME环境变量
    a. 首先看jdk是否有安装 java -version
    b. 查看java指令所在目录 which java (/usr/bin/java)
    c. 查询jdk实际安装路径 ls -l /usr/bin/java（这是一个链接文件，找出其实际指向）
    d. cd进入jdk的实际安装路径，执行./java_home命令获得JDK的实际JAVA_HOME
    f. 修改~/.bash_profile添加JAVA_HOME环境变量 
    g. echo $JAVA_HOME
3. 执行btrace脚本
    a. 将btrace上传到服务器
    b.  btrace -cp build -p 2020 26217 /Users/bianzhaoyu/IdeaProjects/testagent/btrace/src/main/java/BtraceTestMain.java
    //但是会报错，编译不通过。换了个版本后编译通过了但是运行时报找不到Message类，应该是jdk或者版本有问题。
    
    
生产上实际使用arthas
1. 下载并安装arthas:
    curl -O https://alibaba.github.io/arthas/arthas-boot.jar
2. 启动并选择java进程（第几个）
    java -jar arthas-boot.jar
    2
3. 执行arthas命令