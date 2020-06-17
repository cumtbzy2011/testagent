package com.taobao.test.demo;

/**
 * @author xinan
 * @date 2020/6/17
 */
public class SimpleMain {
    public int print(int i) {
        System.out.println("i: " + i);
        return i + 2;
    }

    public void run() {
        int i = 1;
        while (true) {
            i = print(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     *  java -javaagent:agent/target/agent-1.0.0-SNAPSHOT-jar-with-dependencies.jar -jar
     *  demo/target/demo-jar-with-dependencies.jar
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        SimpleMain main = new SimpleMain();
        main.run();
        Thread.sleep(1000 * 60 * 60);
    }
}
