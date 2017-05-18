package hci.MainTest;

import core.IntegrationTest;
import core.Specie;
import core.SpecieCategory;
import hci.CreateCategory.ControlerCreateCategory;
import hci.CreateCategory.ViewCreateCategory;
import hci.CreateSpecie.ViewCreateSpecie;
import hci.MainWindow;

import javax.swing.*;
import java.awt.*;
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

        v.getBtConCul().addActionListener(new BtListener());
        v.getBtAddOrd().addActionListener(new BtListener());
        v.getBtAddCus().addActionListener(new BtListener());
        v.getBtAddSpe().addActionListener(new BtListener());
        v.getBtAddCat().addActionListener(new BtListener());
        v.getBtVieSpe().addActionListener(new BtListener());
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

    private class ViewSpecieData extends JPanel{

        private IntegrationTest t;
        private MainWindow w;

        public ViewSpecieData(IntegrationTest tt, MainWindow ww) {
            t=tt;
            w=ww;
            this.setLayout(new BorderLayout());
            JTextArea t = new JTextArea();
            this.add(t, BorderLayout.CENTER);

            t.setText(textInit());

            w.setContent(this);
        }

        private String textInit(){
            String s = "";
            for (SpecieCategory c :t.theCategories) {
                s += c.getName()+"\n";
                for (Specie p:c.getSpecies()) {
                    s += "    "+p.getName()+"\n";
                }
            }
            return s;
        }

    }



    public static void main(String[] args){
        MainWindow m = new MainWindow();
        new ControllerMainTest(m, new IntegrationTest());
    }
}




