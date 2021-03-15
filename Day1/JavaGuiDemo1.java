package com.ff.javgui.Day1;

import javax.swing.*;
import java.awt.*;

public class JavaGuiDemo1 extends JFrame {
    public static void main(String[] args) {
        JavaGuiDemo1 jf = new JavaGuiDemo1();
        jf.setFrame();
        jf.setVisible(true);
    }

    public void setFrame(){
        this.setSize(500,500);//设置窗口大小
        setTitle("GUI窗口");//设置窗口标题
        setLocationRelativeTo(null);//设置位置,窗口水平垂直居中
        setResizable(false);//窗口大小不能改变
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口,退出程序

        //创建面板组件,默认布局为流式布局
        JPanel jp = new JPanel(new FlowLayout(FlowLayout.LEFT,10,20));//流失布局,设置为左对齐,按钮左右间距10,上下间距20
        jp.setBackground(Color.BLACK);

        JButton jb1 = new JButton("按钮1");
        JButton jb2 = new JButton("按钮2");
        JButton jb3 = new JButton("按钮3");
        JButton jb4 = new JButton("按钮4");
        JButton jb5 = new JButton("按钮5");
        JButton jb6 = new JButton("按钮6");
        jp.add(jb1);
        jp.add(jb2);
        jp.add(jb3);
        jp.add(jb4);
        jp.add(jb5);
        jp.add(jb6);
        //jp.remove(jb1);//移除组件
        //jp.removeAll();//移除所有组件


        this.add(jp);

    }
}
