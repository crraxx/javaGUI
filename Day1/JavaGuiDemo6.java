package com.ff.javgui.Day1;

import javax.swing.*;
import java.awt.*;

public class JavaGuiDemo6 extends JFrame {
    public static void main(String[] args) {
        JavaGuiDemo6 jf = new JavaGuiDemo6();
        jf.setFrame();
        jf.setVisible(true);
    }

    public void setFrame() {
        this.setSize(500, 500);//设置窗口大小
        setTitle("GUI窗口");//设置窗口标题
        setLocationRelativeTo(null);//设置位置,窗口水平垂直居中
        setResizable(false);//窗口大小不能改变
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口,退出程序


        JPanel jp = new JPanel();
        jp.setBackground(Color.YELLOW);

        //多行文本
        JTextArea jta = new JTextArea(5, 40);
        jta.setLineWrap(true);//强制换行
        jta.setWrapStyleWord(true);//以单词为单位换行
        JScrollPane jScrollPane = new JScrollPane(jta);//创建一个可以添加滚动条用来封装文本域
        jp.add(jScrollPane);

        JButton jb = new JButton("按钮");
        jb.setEnabled(false);//禁用
        jp.add(jb);


        this.add(jp);

    }
}
