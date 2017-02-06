package shildt.book.exampleApplet.AppWindowDemo;


import java.awt.*;

/**
 * Created by luchk on 12.07.2016.
 */
public class AppWindow extends Frame{
    String keymsg = "This is a test";
    String mousemsg = "";
    int mouseX = 30, mouseY = 30;

    public AppWindow(){
        addKeyListener(new MyKeyAdapter1(this));
        addMouseListener(new MyMouseAdapter1(this));
        addWindowListener(new MyWindowAdapter1());
    }

    public void paint(Graphics g){
        g.drawString(keymsg, 10, 40);
        g.drawString(mousemsg, mouseX, mouseY);
    }

    //Create window
    public static void main(String[] args) {
        AppWindow appWindow = new AppWindow();

        appWindow.setSize(new Dimension(300, 200));
        appWindow.setTitle("An AWT-Based Application");
        appWindow.setVisible(true);
    }
}
