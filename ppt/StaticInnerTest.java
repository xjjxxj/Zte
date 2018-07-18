/**
 * Copyright (C), 2015-2018, Ztesoft有限公司
 * FileName: StaticInnerTest
 * Author:   Xiao Jie
 * Date:     2018/7/17 22:07
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package ppt;

/**
 * Created with IntelliJ IDEA.
 * Description: 
 * User: Xiao Jie
 * Date: 2018-07-17
 * Time: 22:07
 */
class StaticOuter {
    private int a = 100;
    private static int b = 150;

    public static void test() {
        System.out.println("Outer static test ...");
    }

    public void test2() {
        System.out.println("Outer instabce test ...");
    }

    static class StaticInner {
        public int a = 200;
        static int b = 300;

        public static void test() {
            System.out.println("Inner static test ...");
        }

        public void test2() {
            System.out.println("Inner instance test ...");
            StaticOuter.test();
            new StaticOuter().test2();
            System.out.println("StaticOuter.b  = " + StaticOuter.b);
        }
    }

}
public class StaticInnerTest {
    public static void main(String[] args) {

        StaticOuter.StaticInner si = new StaticOuter.StaticInner();
        si.test2();
        //StaticOuter.StaticInner.test();
        System.out.println("si.b = "+si.b);
        System.out.println("si.a = "+si.a);
        //	System.out.println("StaticOuter.b  = "+StaticOuter.b);  这里报错
    }

}
