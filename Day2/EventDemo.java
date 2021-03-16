package com.ff.javgui.Day2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventDemo extends JFrame {
    public static void main(String[] args) {
        EventDemo jf = new EventDemo();
        jf.setFrame();
        jf.setVisible(true);
    }

    public void setFrame() {
        setSize(460, 300);//设置窗口大小
        setTitle("聊天窗口");//设置窗口标题
        setLocationRelativeTo(null);//设置位置,窗口水平垂直居中
        setResizable(false);//窗口大小不能改变
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口,退出程序

        JPanel jp = new JPanel(new GridLayout(4, 1));
        JButton loginBtn  = new JButton("登录");
        jp.add(loginBtn);
        this.add(jp);

        //鼠标事件
       /* loginBtn.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("鼠标点击");//按下释放两个动作完成后算一次点击
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("鼠标按下");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("鼠标释放");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("鼠标移入悬浮");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("鼠标移出");
            }
        });*/

        //鼠标事件适配器,重写了抽象方法
        loginBtn.addMouseListener(new MouseAdapter() {
            //根据我们的需要重写
            @Override
            public void mouseClicked(MouseEvent e) {
                //消息框,弹出提示信息,点击确认后关闭对话框
                //JOptionPane.showMessageDialog(null,"请输出账号");点击后出现对话框提醒
                //JOptionPane.showMessageDialog(null,"请输入账号","来自系统的提醒",JOptionPane.WARNING_MESSAGE);
                //JOptionPane.showMessageDialog(null,"请输入账号","来自系统的提醒",JOptionPane.ERROR_MESSAGE);

            //确认框
                //是-0  1-否  2-取消
                //int res = JOptionPane.showConfirmDialog(null,"是否同意");
                //int res = JOptionPane.showConfirmDialog(null,"是否同意","来自系统的消息",JOptionPane.YES_NO_OPTION);//只有是否两个选项
                //0-确定  2-取消
                int res = JOptionPane.showConfirmDialog(null,"是否同意","来自系统的消息",JOptionPane.OK_CANCEL_OPTION);
                System.out.println(res);//
            }
        });
    }
}
