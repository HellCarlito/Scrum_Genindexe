package hci;

import core.Customer;

import javax.swing.*;
import java.awt.*;

public class ViewAddSample extends JPanel {

    private JLabel title, customerReminder;
    private JPanel samplePanel;
    private JComboBox analysisComboBox, speciesComboBox;
    private JButton validateAddSample;

    private Customer customer;
    // TODO remplacer les espèces et analyses rentrées en dur ici !
    private String[] specie = {"Radis", "Pti Wrap", "Kebab", "Entrecôte", "Saucisse", "Mojito"};
    private String[] analysis = {"ScrapieTest", "SexingTest"};


    public ViewAddSample() {
        title = new JLabel("Add a sample");
        title.setFont(new Font("sans serif", Font.PLAIN, 24));

        // TODO remplacer ici aussi le nom du customer ?
        customer = new Customer("John", "Poitiers");
        customerReminder = new JLabel("Name of customer : " + customer.getName());

        analysisComboBox = new JComboBox(analysis);
        speciesComboBox = new JComboBox(specie);

        validateAddSample = new JButton("Validate");

        // Add Title, Customer reminder and combo boxes to JPanel
        samplePanel = new JPanel();
        samplePanel.add(title);
        samplePanel.add(customerReminder);
        samplePanel.add(analysisComboBox);
        samplePanel.add(speciesComboBox);
        samplePanel.add(validateAddSample);

        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        // Provide a space between each of 10
        c.insets = new Insets(0, 0, 10, 0);
        c.weightx = 1;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;

        c.anchor = GridBagConstraints.CENTER;
        this.add(title, c);

        c.gridy = 1;
        this.add(customerReminder, c);

        c.gridy = 2;
        this.add(analysisComboBox, c);

        c.gridy = 3;
        this.add(speciesComboBox, c);

        c.gridy = 4;
        this.add(validateAddSample, c);
    }

    public static void main(String[] args) {
        new MainWindow() {{
            setContent(new ViewAddSample(
            ));
        }};
    }

}
