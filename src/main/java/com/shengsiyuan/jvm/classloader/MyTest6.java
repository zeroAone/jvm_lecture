package com.shengsiyuan.jvm.classloader;
/**
*初始化：为类的静态变量赋予正确的初始值  

*
/
public class MyTest6 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        System.out.println("counter1:" + Singleton.counter1);
        System.out.println("counter2:" + Singleton.counter2);
    }
}

class Singleton {
    public static int counter1 = 1;

    private static Singleton singleton = new Singleton();

    private Singleton(){
     counter1++;//这一步使用的是初始化之后的值
     counter2++;//这一步使用的是准备阶段之后的值，还没初始化，准备阶段的重要意义
    }

    public static int counter2 = 0;

    public static Singleton getInstance(){ //*主动使用：调用类的静态方法
        return singleton;
    }


}
