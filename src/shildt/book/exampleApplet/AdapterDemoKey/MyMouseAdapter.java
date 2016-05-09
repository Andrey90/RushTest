package shildt.book.exampleApplet.AdapterDemoKey;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by luchk on 10.04.2016.
 */
public class MyMouseAdapter extends MouseAdapter {
    AdapterDemo adapterDemo;
    public MyMouseAdapter(AdapterDemo adapterDemo){
        this.adapterDemo = adapterDemo;
    }

    //Обработка счелчка мыши
    public void mouseClicked(MouseEvent me){
        adapterDemo.showStatus("Mouse clicked");
    }
}
