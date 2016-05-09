package shildt.book.exampleApplet.AdapterDemoMouse;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by luchk on 09.05.2016.
 */
public class MyKeyListener implements KeyListener {
    AdapterDemoKey adapterDemoKey;
    public MyKeyListener(AdapterDemoKey adapterDemoKey){
        this.adapterDemoKey = adapterDemoKey;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        adapterDemoKey.msg += e.getKeyChar();
        adapterDemoKey.repaint();
    }
    @Override
    public void keyPressed(KeyEvent e) {
        adapterDemoKey.showStatus("key pressed");
        int key = e.getKeyCode();
        switch (key){
            case KeyEvent.VK_F1:
                adapterDemoKey.msg += "<F1>";
                break;
            case KeyEvent.VK_F2:
                adapterDemoKey.msg += "<F2>";
                break;
            case KeyEvent.VK_PAGE_DOWN:
                adapterDemoKey.msg += "<PAGE_DOWN>";
                break;
            case KeyEvent.VK_PAGE_UP:
                adapterDemoKey.msg += "<PAGE_UP>";
                break;
        }
        adapterDemoKey.repaint();
    }
    @Override
    public void keyReleased(KeyEvent e) {
        adapterDemoKey.showStatus("Key up");
    }
}
