package hci;

import core.Customer;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 */
public class ViewCreateOrder extends JPanel{

    private JLabel title;
    private JLabel selectedCustomer;
    private JScrollPane selectionCustomerSP;
    private JPanel selectionCustomer;

    private JPanel areaSample;
    private JButton addSample;
    private JButton validate;

    private Customer selectedC;

    private HashMap<Customer, JButton> buttonsCustomer;

    public ViewCreateOrder(ArrayList<Customer> customers) {
        buttonsCustomer = new HashMap<>();

        for (Customer c:customers) {
            buttonsCustomer.put(c, new JButton(c.getName()+", "+c.getTown()){{
                setBackground(Color.WHITE);
                setAlignmentX(Component.CENTER_ALIGNMENT);
                setEnabled(selectedC!=c);}});
        }

        title = new JLabel("Création d'un ordre d'analyses");
        title.setFont(new Font("sans serif", Font.PLAIN, 24));

        selectedCustomer = new JLabel("Veuillez sélectionner un client");
        selectedCustomer.setForeground(Color.LIGHT_GRAY);

        selectionCustomer = new JPanel();
        selectionCustomer.setLayout(new GridBagLayout());

        selectionCustomerSP = new JScrollPane(selectionCustomer);
        selectionCustomerSP.setPreferredSize(new Dimension(240,120));

        GridBagConstraints gb = new GridBagConstraints();
        gb.gridy = 0;
        gb.fill = GridBagConstraints.HORIZONTAL;
        buttonsCustomer.forEach( (c,b) -> {
            selectionCustomer.add(b, gb);
            gb.gridy++;
        } );

        areaSample = new JPanel();
        areaSample.setLayout(new BoxLayout(areaSample, BoxLayout.PAGE_AXIS));

        addSample = new JButton("Ajout échantillon");

        validate = new JButton("Valider");

        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;

        c.anchor = GridBagConstraints.CENTER;
        this.add(title, c);

        c.ipadx = 20;
        c.gridy = 1;
        c.gridwidth = 1;
        c.anchor = GridBagConstraints.EAST;
        this.add(selectedCustomer,c);

        c.gridx = 1;
        c.anchor = GridBagConstraints.WEST;
        this.add(selectionCustomerSP,c);

        c.insets = new Insets(0,0,10,0);
        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 0;
        c.gridwidth = 2;
        c.gridy = 2;
        this.add(areaSample, c);

        c.gridy = 3;
        this.add(addSample, c);

        c.gridy = 4;
        this.add(validate, c);

    }

    public JPanel getSelectionCustomer() {
        return selectionCustomer;
    }

    public JPanel getAreaSample() {
        return areaSample;
    }

    public static void main(String[] args){
        new MainWindow(){{setContent(new ViewCreateOrder(
                new ArrayList<Customer>(){{
                    add(new Customer("PG", "Poitiers"));
                    add(new Customer("Allan", "bureau"));
                    add(new Customer("Annie", "adaland"));
                    add(new Customer("Annie", "adaland"));
                    add(new Customer("Annie", "adaland"));
                    add(new Customer("Annie", "adaland"));
                    add(new Customer("Annie", "adaland"));
                    add(new Customer("Annie", "adaland"));
                    add(new Customer("Annie", "adaland"));
                    add(new Customer("Annie", "adaland"));
                    add(new Customer("Annie", "adaland"));
                    add(new Customer("Annie", "adaland"));
                }}
        ));}};
    }
}











