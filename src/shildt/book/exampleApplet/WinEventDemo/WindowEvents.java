package shildt.book.exampleApplet.WinEventDemo;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Created by luchk on 11.07.2016.
 */
public class WindowEvents extends Applet implements MouseListener, MouseMotionListener{
    SampleFrame f;
    String msg = "";
    int mouseX = 0, mouseY = 10;
    int movX = 0, movY = 0;

    //Создание рамочного окна
    public void init(){
        f = new SampleFrame("Handle mouse events");
        f.setSize(300, 200);
        f.setVisible(true);
        //зарегистрировать обьект для получения его собственных событий мыши
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    //Удаление рамочного окна при остановке апплета
    public void stop(){
        f.setVisible(false);
    }

    //Показать рамочное окно при запуске апплета
    public void start(){
        f.setVisible(true);
    }

    //Обрабботка щелчка мыши
    public void mouseClicked(MouseEvent me){
    }

    //Обработка входа курсора мыши
    public void mouseEntered(MouseEvent me){
        //сохранить координаты
        mouseX = 0;
        mouseY = 24;
        msg = "Mouse just entered child applet window";
        repaint();
    }

    //Обработка выхода курсора мыши
    public void mouseExited(MouseEvent me){
        //сохранить координаты
        mouseX = 0;
        mouseY = 24;
        msg = "Mouse just left child window applet window";
        repaint();
    }

    //Обработка нажатия кнопки мыши
    public void mousePressed(MouseEvent me){
        //сохранить координаты
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Down";
        repaint();
    }

    //Обработка отпускания кнопки мыши
    public void mouseReleased(MouseEvent me){
        //сохранить координаты
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Up";
        repaint();
    }

    //Обработка перетаскивания кнопки мыши
    public void mouseDragged(MouseEvent me){
        //сохранить координаты
        mouseX = me.getX();
        mouseY = me.getY();
        movX = me.getX();
        movY = me.getY();
        msg = "*";
        repaint();
    }

    //Обработка перемещения мыши
    public void mouseMoved(MouseEvent me){
        //сохранить координаты
        mouseX = me.getX();
        mouseY = me.getY();
        repaint(0, 0, 100, 20);
    }

    //Отображение сообщения в окне апплета
    public void paint(Graphics g){
        g.drawString(msg, mouseX, mouseY);
        g.drawString("Mouse at " + movX + ", " + movY, 0, 10);
    }
}
