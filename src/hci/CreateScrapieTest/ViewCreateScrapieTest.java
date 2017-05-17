package hci.CreateScrapieTest;

import core.IntegrationTest;
import core.Specie;
import core.SpecieCategory;
import hci.MainWindow;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by carlito on 17/05/17.
 */
public class ViewCreateScrapieTest extends JPanel {

    private JLabel labelNewScrapieTest = new JLabel("Create a new scrapie test : ");
    private ArrayList<Specie> species;
    private JComboBox comboBoxSpecieChoice;
    private JButton buttonSubmitTest = new JButton("Create the test");
    private JTextField fieldFirstValue, fieldSecondValue;
    private JPanel scrapieTestPanel;


    public ViewCreateScrapieTest(IntegrationTest integrationTest) {

        species = new ArrayList<>();
        for (SpecieCategory specieCategory : integrationTest.theCategories) {
            for (Specie s : specieCategory.getSpecies()) {
                species.add(s);
            }
        }

        comboBoxSpecieChoice = new JComboBox(species.toArray());

        // Definition of Fonts - Foreground and Background
        labelNewScrapieTest.setFont(new Font("Lucida Fax", Font.BOLD, 20));
        labelNewScrapieTest.setForeground(new Color(89, 148, 60));

        fieldFirstValue = new JTextField(20);
        fieldSecondValue = new JTextField(20);

        buttonSubmitTest.setFont(new Font("Lucida Fax", Font.BOLD, 18));
        buttonSubmitTest.setForeground(new Color(255, 255, 255));
        buttonSubmitTest.setBackground(new Color(89, 148, 60));

        scrapieTestPanel = new JPanel();
        scrapieTestPanel.add(labelNewScrapieTest);
        scrapieTestPanel.add(comboBoxSpecieChoice);
        scrapieTestPanel.add(fieldFirstValue);
        scrapieTestPanel.add(fieldSecondValue);
        scrapieTestPanel.add(buttonSubmitTest);

        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        // Provide a space between each of 10
        c.insets = new Insets(0, 0, 10, 0);
        c.weightx = 1;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;

        c.anchor = GridBagConstraints.CENTER;
        this.add(labelNewScrapieTest, c);

        c.gridy = 1;
        this.add(comboBoxSpecieChoice, c);

        c.gridy = 2;
        this.add(fieldFirstValue, c);

        c.gridy = 3;
        this.add(fieldSecondValue, c);

        c.gridy = 4;
        this.add(buttonSubmitTest, c);

    }

    public static void main(String[] args) {
        IntegrationTest intest = new IntegrationTest();
        new MainWindow() {{
            setContent(new ViewCreateScrapieTest(intest
            ));
        }};
    }
}
