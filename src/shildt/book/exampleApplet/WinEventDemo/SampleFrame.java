package shildt.book.exampleApplet.WinEventDemo;

import shildt.book.exampleApplet.Sample;

import java.awt.*;
import java.awt.event.*;

/**
 * Created by luchk on 11.07.2016.
 */
/*
<applet code = "ЦштвщцУмутеы" width = "300" height = "50">
</applet>
*/

//Создание подкласа Frame
class SampleFrame extends Frame implements MouseListener, MouseMotionListener{
    String msg = "";
    int mouseX = 10, mouseY = 40;
    int movX = 0, movY = 0;

    SampleFrame(String title){
        super(title);
        //Зарегистрировать обьект для получения его собственных событий мыши
        addMouseListener(this);
        //создать обьект для обработки событий окна
        MyWindowAdapter adapter = new MyWindowAdapter(this);
        //Зарегистрироваться для получения этих событий
        addWindowListener(adapter);
    }

    //Обработка щелчка мыши
    public void mouseClicked(MouseEvent me){
    }
    //Обработка входа курсора мыши
    public void mouseEntered(MouseEvent evtObj){
        //сохранить координаты
        mouseX = 10;
        mouseY = 54;
        msg = "Mouse just entered child.";
        repaint();
    }

    //Обработка выхода курсора мыши
    public void mouseExited(MouseEvent evtObj){
        //сохранить координаты
        mouseX = 10;
        mouseY = 54;
        msg = "Mouse just left child window";
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
        repaint(0, 0, 100, 60);
    }

    public void paint(Graphics g){
        g.drawString(msg, mouseX, mouseY);
        g.drawString("Mouse at " + movX + ", " + movY, 10, 40);
    }
}
