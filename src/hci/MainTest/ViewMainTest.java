package hci.MainTest;

import javax.swing.*;
import java.awt.*;

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
        btVieSpe = new JButton("View species");

        btAddCus = new JButton("Add customer");
        btAddOrd = new JButton("Add order");
        btConCul = new JButton("Consult customer");

        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.BOTH;

        c.weightx = 1;
        c.weighty = 1;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(5,5,5,5);

        add(btAddCat, c);
        c.gridx++;
        add(btAddSpe, c);
        c.gridx++;
//        add(btVieSpe, c);

        c.gridx = 0;
        c.gridy++;
        c.gridwidth = 3;
        c.fill = GridBagConstraints.HORIZONTAL;

        add(new JSeparator(SwingConstants.HORIZONTAL));

        c.fill = GridBagConstraints.BOTH;

        c.gridwidth = 1;
        c.gridy++;

        add(btAddCus, c);
        c.gridx++;
        add(btAddOrd, c);
        c.gridx++;
        add(btConCul, c);

    }

    public JButton getBtAddCat() {
        return btAddCat;
    }

    public JButton getBtAddSpe() {
        return btAddSpe;
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


