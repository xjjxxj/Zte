/**
 * Copyright (C), 2015-2018, Ztesoft有限公司
 * FileName: OuterClass
 * Author:   Xiao Jie
 * Date:     2018/7/17 21:45
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
 * Time: 21:45
 */
public class OuterClass {
    private String name ;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public void display(){
        System.out.println("OuterClass...");
    }

    public class InnerClass{
        public InnerClass(){
            name = "小杰";
            age = 23;
        }

        public OuterClass getOuterClass(){
            System.out.println("name：" + getName() +"   ;age：" + getAge());
            return OuterClass.this;
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.getOuterClass().display();
    }
}
