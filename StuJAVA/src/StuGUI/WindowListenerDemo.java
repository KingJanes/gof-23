package StuGUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowListenerDemo {

    public void listenre() {

        Frame f = new Frame("Frame 窗口");
        Button b = new Button("Exit");
             b.setName("按钮");
             f.setSize(700,600);
             f.setLocation(400 ,100);


            // 添加一个窗口事件
            f.addWindowListener(new WindowAdapter() {
                // WindowAdapter 是一个是适配器它实现了WindowListener接口并覆写了接口内的所有函数 但函数主体什么都没有 我们需要用到那几个就覆写那几个
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });

            //给按钮添加一个事件
            b.addActionListener(new ActionListener() {
                // 点击按钮时退出
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });


            f.add(b);
            f.setLayout( new FlowLayout());
            f.setVisible(true);

    }
}
