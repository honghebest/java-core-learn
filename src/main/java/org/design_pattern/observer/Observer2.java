package org.design_pattern.observer;

/**
 * @Author: HaoBin
 * @Date 2018/2/2 23:43
 */
public class Observer2 implements Observer {

    private Subject subject;

    public Observer2(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("observer2 得到 3D 号码 -->" + msg + "我要告诉舍友们。");
    }
}
