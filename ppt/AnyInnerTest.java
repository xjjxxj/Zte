/**
 * Copyright (C), 2015-2018, Ztesoft有限公司
 * FileName: AnyInnerTest
 * Author:   Xiao Jie
 * Date:     2018/7/18 13:46
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
 * Time: 13:46
 */
interface Pen {
    public void write();
}

class  Pencil implements Pen {
    @Override
    public void write() {
        //铅笔 的工厂
    }
}

class Person {
    public void user(Pen pen) {
        pen.write();
    }
}

public class AnyInnerTest {
    public static void main(String args[]) {
        Person guo = new Person();

        guo.user(new Pen() {
            @Override
            public void write() {
                System.out.println("写字");
            }
        });
    }

}
