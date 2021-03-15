package com.ff.javgui.Day1;

import javax.swing.*;
import java.awt.*;

public class JavaGuiDemo2 extends JFrame {
    public static void main(String[] args) {
        JavaGuiDemo2 jf = new JavaGuiDemo2();
        jf.setFrame();
        jf.setVisible(true);
    }

    public void setFrame(){
        this.setSize(500,500);//设置窗口大小
        setTitle("GUI窗口");//设置窗口标题
        setLocationRelativeTo(null);//设置位置,窗口水平垂直居中
        setResizable(false);//窗口大小不能改变
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口,退出程序

        //创建面板组件,边界布局
        //将面板分为5各区域;上下左右中
        JPanel jp = new JPanel(new BorderLayout());

        JButton jb1 = new JButton("按钮1");
        JButton jb2 = new JButton("按钮2");
        JButton jb3 = new JButton("按钮3");
        JButton jb4 = new JButton("按钮4");
        JButton jb5 = new JButton("按钮5");
        jp.add(jb1,BorderLayout.NORTH);
        jp.add(jb2,BorderLayout.SOUTH);
        jp.add(jb3,BorderLayout.EAST);
        jp.add(jb4,BorderLayout.WEST);
        jp.add(jb5,BorderLayout.CENTER);

        this.add(jp);

    }
}
