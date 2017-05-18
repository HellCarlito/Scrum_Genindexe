package hci.MainTest;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ambie on 18/05/2017.
 */
public class ViewMainTest extends JPanel{

    private JButton btAddCat;
    private JButton btAddSpe;
    private JButton btAddCus;

    private JButton btAddOrd;
    private JButton btConCul;

    private JButton btAddPla;

    public ViewMainTest() {
        btAddCat = new JButton("Add specie category");
        btAddSpe = new JButton("Add specie");

        btAddCus = new JButton("Add customer");
        btAddOrd = new JButton("Add order");
        btConCul = new JButton("Consult customer");

        btAddPla = new JButton("Create micro-plate");

        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.BOTH;

        c.weightx = 1;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(5,5,5,5);

        c.gridwidth = 3;
        add(new JLabel("Species/Specie categories"));
        c.weighty = 1;

        c.gridy++;

        c.gridx=0;
        add(btAddCat, c);
        c.gridx=3;
        add(btAddSpe, c);

        c.gridx = 0;
        c.gridy++;
        c.gridwidth = 9;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weighty = 0;
        add(new JSeparator(SwingConstants.HORIZONTAL), c);

        c.gridy++;
        c.gridx = 0;
        c.gridwidth = 5;
        add(new JLabel("Customers/Orders"), c);
        c.weighty = 1;

        c.fill = GridBagConstraints.BOTH;

        c.gridwidth = 2;
        c.gridy++;
        c.gridy++;

        add(btAddCus, c);
        c.gridx++;
        c.gridx++;
        add(btAddOrd, c);
        c.gridx++;
        c.gridx++;
        add(btConCul, c);


        c.gridx = 0;
        c.gridy++;
        c.gridwidth = 9;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weighty = 0;
        add(new JSeparator(SwingConstants.HORIZONTAL), c);

        c.gridy++;
        c.gridx = 0;
        c.gridwidth = 5;
        add(new JLabel("Analysis"), c);
        c.weighty = 1;

        c.fill = GridBagConstraints.BOTH;
        c.gridy++;
        c.gridx = 0;
        c.gridwidth = 2;
        add(btAddPla, c );

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

    public JButton getBtAddPla() {
        return btAddPla;
    }


}


