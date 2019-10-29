package MyMouserListener;

import StuGUI.KeyMouseLishener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouserLitener implements MouseListener {
    private KeyMouseLishener keyMouseLishener ;

    public MyMouserLitener(KeyMouseLishener keyMouseLishener) {
        super ();
        this.keyMouseLishener = keyMouseLishener;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        keyMouseLishener.getTextField().setText("鼠标释放 ...");
    }

    @Override
    public void mousePressed(MouseEvent e) {

        keyMouseLishener.getTextField().setText("鼠标按下 ...");
    }

    @Override
    public void mouseReleased(MouseEvent e) {

        keyMouseLishener.getTextField().setText("按下即离开...");

    }

    @Override
    public void mouseEntered(MouseEvent e) {

            keyMouseLishener.getTextField().setText("鼠标进入 ...");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        keyMouseLishener.getTextField().setText("鼠标移出 ...");
    }
}
