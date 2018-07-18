/**
 * Copyright (C), 2015-2018, Ztesoft有限公司
 * FileName: LocalInnerTest
 * Author:   Xiao Jie
 * Date:     2018/7/18 13:44
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
 * Date: 2018-07-18
 * Time: 13:44
 */
public class LocalInnerTest {
    private int a = 1;
    private static int b = 2;

    public void test() {
        final int c = 3;
        class LocalInner {
            public void add1() {
                System.out.println("a= " + a);
                System.out.println("b= " + b);
                System.out.println("c= " + c);
            }
        }
        new LocalInner().add1();
    }

    public void test2() {
        final int d = 5;
        class LocalInner2 {
            public void add1() {
                // System.out.println("a= " + a);
                System.out.println("b= " + b);
                System.out.println("c= " + d);
            }
        }
        new LocalInner2().add1();
    }

    public static void main(String args[]) {

        // LocalInnerTest() lc = new LocalInnerTest();
        new LocalInnerTest().test2();
        new LocalInnerTest().test();
    }

}
