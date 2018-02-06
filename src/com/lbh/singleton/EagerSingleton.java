package com.lbh.singleton;

/**
 * 单例模式  确保某个类只有一个实例，而且实例向整个提供这个实例
 *  有三个特点： 单例模式只能有一个实例
 *              单例类必须要自行创建这个实例
 *              单例类需要向整个系统提供这个实例
 *  两种设计模式： 饿汉式单例模式
 *               懒汉式单例模式
 */


/**
 * 饿汉式单例模式：
 *          这种模式下线程是安全的，不会出现延迟加载而产生不同的实例对象。
 * Created by Advancer on 2018/2/6 11:14.
 * auth: lbh
 */
public class EagerSingleton {

    //采用静态常量的形式
   // private static final EagerSingleton EAGER_SINGLETON = new EagerSingleton();

    //采用静态代码块的形式
    private static final EagerSingleton EAGER_SINGLETON2;

    static {
        EAGER_SINGLETON2 = new EagerSingleton();
    }

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return EAGER_SINGLETON2;
    }

    public static void main(String[] args) {
        EagerSingleton e1 = EagerSingleton.getInstance();
        EagerSingleton e2 = EagerSingleton.getInstance();
        System.out.println(e1==e2);  //true
    }

}
