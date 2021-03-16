package com.ff.javgui.Day2.innerClass;

/*
外部类
 */
public class Outer {

    //外部类成员
    private int age = 20;

    //成员内部类
    //private class Inner{私有内部类,外部不能访问
    //static class Inner{ 静态内部类,只能访问外部类中的静态成员
    class Inner {
        int numm = 10;

        public void show() {
            System.out.println(age);//在内部类中可以直接使用外部类中成员变量方法,私有的成员也可以
            System.out.println(numm);

        }
    }
}
