package org.javacore.base.String;
/**
 *  常见面试题：String作为方法参数传递,另外一个例子 ${@link StringT2}
 *  这就叫做“值传递”，即方法操作的是参数变量（也就是原型变量的一个值的拷贝）
 *  改变的也只是原型变量的一个拷贝而已，而非变量本身
 *  不指是string，当变量作为方法参数传递，传递都是一个值的拷贝，方法对变量的修改，
 *  并不改变变量本身
 */
public class StringT {
    public static void main(String[] args) {
        String str = "123";
        change(str);
        System.out.println(str);
        int interger = 1;
        changeInt(interger);
        System.out.println(interger);
    }

    public static void change(String str) {
        str = "456";
    }
    public static void changeInt(int interger) {
        interger = 2;
    }
}
