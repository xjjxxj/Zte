/**
 * Copyright (C), 2015-2018, Ztesoft有限公司
 * FileName: InnerClass
 * Author:   Xiao Jie
 * Date:     2018/7/17 21:26
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
 * Time: 21:26
 */
interface A {}

interface B {}

class X implements A, B {}

class Y implements A {
    B makeB() {
        // Anonymous inner class:
        return new B() {};
    }
}
public class InnerClass {
    static void takesA(A a) {}
    static void takesB(B b) {}

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takesA(x);
        takesA(y);
        takesB(x);
        takesB(y.makeB());
    }
}
