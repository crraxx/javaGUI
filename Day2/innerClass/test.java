package com.ff.javgui.Day2.innerClass;

public class test {
    public static void main(String[] args) {
        //如何创建内部类对象,并访问内部类成员
        Outer.Inner  oi = new Outer().new Inner();
        oi.show();

        //匿名内部类
        //java为接口,抽象类提供了一个没有名字得类,让这个类实现接口或继承抽象类
        new Animal(){
            @Override
            public void eat() {

            }
        };

        //内部类的意义
        /*
        1.封装线
        我们将一些实现细节,封装到内部类中,不能随便访问,内部类可以直接访问外部类的成员
        2.实现多继承
        java语言不能直接多继承,支持继承的传递性
         */
    }
}
