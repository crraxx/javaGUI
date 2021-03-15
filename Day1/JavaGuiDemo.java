package com.ff.javgui.Day1;

import javax.swing.*;

public class JavaGuiDemo extends JFrame {
    public static void main(String[] args) {
        JavaGuiDemo jf = new JavaGuiDemo();
        jf.setFrame();
        jf.setVisible(true);
        //jf.dispose();//释放窗口
    }

    public void setFrame(){
        this.setSize(500,500);//设置窗口大小
        setTitle("GUI窗口");//设置窗口标题
        //setLocation(300,200);//以左上角为坐标轴0点,设置初始位置
        setLocationRelativeTo(null);//设置位置,窗口水平垂直居中
        setResizable(false);//窗口大小不能改变
        //setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//关闭窗口,什么都不错
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口,退出程序
    }
}
