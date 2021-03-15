package com.ff.javgui.Day1;

import javax.swing.*;
import java.awt.*;

public class JavaGuiDemo7 extends JFrame {
    public static void main(String[] args) {
        JavaGuiDemo7 jf = new JavaGuiDemo7();
        jf.setFrame();
        jf.setVisible(true);
    }

    public void setFrame() {
        this.setSize(500, 500);//设置窗口大小
        setTitle("GUI窗口");//设置窗口标题
        setLocationRelativeTo(null);//设置位置,窗口水平垂直居中
        setResizable(false);//窗口大小不能改变
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口,退出程序

        //菜单栏
        JMenuBar jb = new JMenuBar();

        //菜单
        JMenu jm1 = new JMenu("文件");
        JMenu jm2 = new JMenu("编辑");
        JMenu jm3 = new JMenu("搜索");

        //菜单项 实际可以操作的
        JMenuItem ji1 = new JMenuItem("新建");
        JMenuItem ji2 = new JMenuItem("保存");
        JMenuItem ji3 = new JMenuItem("关闭");
        JMenuItem ji4 = new JMenuItem("撤销");
        JMenuItem ji5 = new JMenuItem("重置");
        JMenuItem ji6 = new JMenuItem("关键字搜索");

        //将菜单与菜单项关联
        jm1.add(ji1);
        jm1.add(ji2);
        jm1.add(ji3);
        jm2.add(ji4);
        jm3.add(ji5);
        jm3.add(ji6);

        //将菜单添加到菜单栏
        jb.add(jm1);
        jb.add(jm2);
        jb.add(jm3);

        //将菜单栏添加到窗口上
        this.setJMenuBar(jb);
    }
}
