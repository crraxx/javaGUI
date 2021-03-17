package Practice;

import javax.swing.*;
import java.awt.*;

public class HM2 extends JFrame {
    public static void main(String[] args) {
        HM2 jf = new HM2();
        jf.setFrame();
        jf.setVisible(true);
    }

    public void setFrame() {
        setSize(500, 520);//设置窗口大小
        setTitle("聊天室");//设置窗口标题
        setLocationRelativeTo(null);//设置位置,窗口水平垂直居中
        setResizable(false);//窗口大小不能改变
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口,退出程序

        JPanel jp = new JPanel();

        JTextArea jta = new JTextArea("文本域 显示聊天记录",26, 44);
        jta.setEditable(false);//设置文本域不可编辑
        jta.setLineWrap(true);//强制换行
        JScrollPane jScrollPane = new JScrollPane(jta);
        jp.add(jScrollPane);

        JPanel bottomPanel = new JPanel();
        JTextField jt = new JTextField("文本框",36);
        JButton jb = new JButton("发送");
        bottomPanel.add(jt);
        bottomPanel.add(jb);

        jp.add(bottomPanel,BorderLayout.SOUTH);
        this.add(jp);
    }
}
