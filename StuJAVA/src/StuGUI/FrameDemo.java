package StuGUI;

import java.awt.*;

public class FrameDemo {

    public void frameDome() {
        // 创建一个窗口
        Frame f = new Frame("Frame 窗口");

        // 添加组件  设置其属性
//        f.setSize(600 ,500);
//        f.setLocation(400 , 200);
        // 设置窗口出现的X，Y轴 以及长宽
        f.setBounds(500,300 ,600 ,500);

        Button button = new Button("按钮");
            button.setSize(200, 150);
        f.add(button);

        // 设置流式布局
       f.setLayout(new FlowLayout());

        // 让窗口显示
        f.setVisible(true);
    }

}
