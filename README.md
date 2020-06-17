1. 先打包agent:进入agent目录  mvn clean package
2. 再打包demo:进入demo目录 mvn clean package
3. 启动demo:进入testagent目录 java -javaagent:agent/target/agent-1.0.0-SNAPSHOT-jar-with-dependencies.jar -jar demo/target/demo-jar-with-dependencies.jar
4. 启动attachMain