package hci.MainTest;

import javax.swing.*;

/**
 * Created by ambie on 18/05/2017.
 */
public class ViewMainTest extends JPanel{

    private JButton btAddCat;
    private JButton btAddSpe;
    private JButton btVieSpe;

    private JButton btAddCus;
    private JButton btAddOrd;
    private JButton btConCul;

    public ViewMainTest() {
        btAddCat = new JButton("Add specie category");
        btAddSpe = new JButton("Add specie");
        btVieSpe = new JButton("View specie");

        btAddCus = new JButton("Add customer");
        btAddOrd = new JButton("Add order");
        btConCul = new JButton("Consult customer");
    }

    public JButton getBtAddCat() {
        return btAddCat;
    }

    public JButton getBtAddSpe() {
        return btAddSpe;
    }

    public JButton getBtVieSpe() {
        return btVieSpe;
    }

    public JButton getBtAddCus() {
        return btAddCus;
    }

    public JButton getBtAddOrd() {
        return btAddOrd;
    }

    public JButton getBtConCul() {
        return btConCul;
    }
}


