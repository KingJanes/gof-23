package MyWindowLitener;

import StuGUI.KeyMouseLishener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindowLitener implements WindowListener {

    private KeyMouseLishener keyMouseLishener ;

    public MyWindowLitener(KeyMouseLishener keyMouseLishener) {
        super ();
        this.keyMouseLishener = keyMouseLishener;
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
