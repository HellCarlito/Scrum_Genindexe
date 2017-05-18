package hci.MainTest;

import core.IntegrationTest;
import hci.CreateCategory.ControlerCreateCategory;
import hci.CreateCategory.ViewCreateCategory;
import hci.CreateSpecie.ViewCreateSpecie;
import hci.MainWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ambie on 18/05/2017.
 */
public class ControllerMainTest {

    private ViewMainTest v;
    private MainWindow w;
    private IntegrationTest i;

    public ControllerMainTest(MainWindow win, IntegrationTest integrationTest) {
        i = new IntegrationTest();
        w = win;
        v = new ViewMainTest();
        w.setContent(v);


    }

    private class BtListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == v.getBtAddCat()){

            }else if(e.getSource() == v.getBtAddSpe()){
                new ViewCreateSpecie(i, w);
            }else if(e.getSource() == v.getBtVieSpe()){

            }else if(e.getSource() == v.getBtAddCus()){

            }else if(e.getSource() == v.getBtAddOrd()){

            }else if(e.getSource() == v.getBtConCul()){

            }
        }
    }
}
