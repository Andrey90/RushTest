package shildt.book.exampleApplet.AdapterDemo;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/**
 * Created by luchk on 10.04.2016.
 */
public class MyMouseMotionAdapter extends MouseMotionAdapter {
    AdapterDemo adapterDemo;
    public MyMouseMotionAdapter(AdapterDemo adapterDemo) {
        this.adapterDemo = adapterDemo;
    }

    //Обработка перетаскивания мыши
    public void mouseDragged(MouseEvent me){
        adapterDemo.showStatus("Mouse dragged");
    }
}
