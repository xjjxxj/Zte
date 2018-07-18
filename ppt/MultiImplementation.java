/**
 * Copyright (C), 2015-2018, Ztesoft有限公司
 * FileName: MultiImplementation
 * Author:   Xiao Jie
 * Date:     2018/7/17 21:37
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
 * Time: 21:37
 */
class D {}

abstract class E {}

class Z extends D {
    E makeE() {
        return new E() {};
    }
}
public class MultiImplementation {
    static void takesD(D d) {}
    static void takesE(E e) {}

    public static void main(String[] args) {
        Z z = new Z();
        takesD(z);
        takesE(z.makeE());
    }
}
