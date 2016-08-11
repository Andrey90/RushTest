package shildt.book.exampleApplet;

import java.applet.*;
import java.awt.*;

/**
 * Created by luchk on 22.05.2016.
 */
/*
<applet code="ParamDemo" width=300 height=80>
<param name=fontName value=Courier>
<param name=fontSize value=14>
<param name=leading value=2>
<param name=accountEnabled value=true>
</applet>
*/
public class ParamDemo extends Applet{
    String fontName;
    int fontSize;
    float leading;
    boolean active;

    //Инициализация строки для отображения
    public void start(){
        String param;
        fontName = getParameter("fontName");
        if (fontName == null){
            fontName = "Not Found";
        }

        param = getParameter("fontSize");
        try{
            if (param != null){
                fontSize = Integer.parseInt(param);
            }
            else {
                fontSize = 0;
            }
        }
        catch (NumberFormatException e){
            fontSize = -1;
        }

        param = getParameter("leading");
        try{
            if (param != null){
                leading = Float.valueOf(param).floatValue();
            }
            else {
                leading = 0;
            }
        }
        catch (NumberFormatException e){
            leading = -1;
        }

        param = getParameter("accountEnabled");
        if (param != null){
            active = Boolean.valueOf(param).booleanValue();
        }
    }
    //Отобразить параметры
    public void paint(Graphics gp){
        gp.drawString("Font name: " + fontName, 0, 10);
        gp.drawString("Font size: " + fontSize, 0, 26);
        gp.drawString("Leading: " + leading, 0, 42);
        gp.drawString("Account active: " + active, 0, 58);
    }
}
