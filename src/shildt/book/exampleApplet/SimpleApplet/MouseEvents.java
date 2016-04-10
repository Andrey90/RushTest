package shildt.book.exampleApplet.SimpleApplet;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Created by luchk on 23.03.2016.
 */
/*
<applet code = "MouseEvents" width = 300 height = 100>
</applet>
 */
public class MouseEvents extends Applet implements MouseListener, MouseMotionListener{

    String msg = " ";
    int mouseX = 0, mouseY = 0; //координаты курсора мыши

    public void init(){
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    //Обработка щелчка мыши
    public void mouseClicked(MouseEvent me){
        //сохранить координаты
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse clicked.";
        repaint();
    }

    //Обработка входа курсора мыши
    public void mouseEntered(MouseEvent me){
        //сохранить координаты
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse entered.";
        repaint();
    }

    //Обработка выхода курсора мыши
    public void mouseExited(MouseEvent me){
        //сохранить координаты
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse exited.";
        repaint();
    }

    //Обработка нажатия кнопки
    public void mousePressed(MouseEvent me){
        //сохранить координаты
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Down";
        repaint();
    }

    //Обработка отпуска кнопки
    public void mouseReleased(MouseEvent me){
        //сохранить координаты
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Up";
        repaint();
    }

    //Обработка перетаскивания мышью
    public void mouseDragged(MouseEvent me){
        //сохранить координаты
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "*";
        showStatus("Dragging mouse at " + mouseX + " " + mouseY);
        repaint();
    }

    //Обработка движения мыши
    public void mouseMoved(MouseEvent me){
        //Показать состояние
        showStatus("Moving mouse at " + me.getX() + " " + me.getY());
    }

    //Отобразить msg в окне апплета в текущей позиции X, Y
    public void paint(Graphics gr){
        gr.drawString(msg, mouseX, mouseY);
    }
}
