package StuGUI;

import MyMouserListener.MyMouserLitener;
import MyWindowLitener.MyWindowLitener;

import java.awt.*;


public class KeyMouseLishener {

    private Frame frame;
    private Button button ;

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public TextField getTextField() {
        return textField;
    }

    public void setTextField(TextField textField) {
        this.textField = textField;
    }

    private TextField textField;
    private KeyMouseLishener KeyMouseLishener;


    public KeyMouseLishener() {
        init();
    }

    private void init() {

        frame  = new Frame("鼠标键盘时间演示");
        button = new Button("button");
        textField = new TextField(35);
        frame.setBounds(400 ,350 , 655,500);
        frame.add(textField);
        frame.add(button);
        frame.setLayout( new FlowLayout());
        frame.setVisible(true);
        addLishener();
    }

    private void addLishener() {

        frame.addWindowListener(new MyWindowLitener(this));
        button.addMouseListener(new MyMouserLitener(this));
    }
}
