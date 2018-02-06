package com.lbh.singleton;

import org.junit.Test;

/**
 * 懒汉式单例模式
 *   线程不安全的，如果在多线程下，一个线程进入了 if(lazySingleton == null) 判断语句块，还未来得及往下执行，
 *   另一个线程也通过了这个判断语句，这时会产生多个实例。所有在多线程环境下 不可使用这种方式。
 *   可以在方法上 加锁 synchronized, 但是这种方式效率很低
 * Created by Advancer on 2018/2/6 14:51.
 * auth: lbh
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if (lazySingleton == null){
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

   /* public static void main(String[] args) {
        LazySingleton l1 = LazySingleton.getInstance();
        LazySingleton l2 = LazySingleton.getInstance();
        System.out.println(l1==l2);
    }*/

    class LazySingletonThread implements Runnable {

        /**
         * When an object implementing interface <code>Runnable</code> is used
         * to create a thread, starting the thread causes the object's
         * <code>run</code> method to be called in that separately executing
         * thread.
         * <p>
         * The general contract of the method <code>run</code> is that it may
         * take any action whatsoever.
         *
         * @see Thread#run()
         */
        @Override
        public void run() {
            System.out.println(LazySingleton.getInstance());
        }

        @Test
        public void test1(){
            LazySingletonThread ls1 = new LazySingletonThread();
            LazySingletonThread ls2 = new LazySingletonThread();
            Thread t1 = new Thread(ls1);
            Thread t2 = new Thread(ls2);
            t1.start();
            t2.start();
        }
    }

}
