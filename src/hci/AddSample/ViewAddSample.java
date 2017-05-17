package hci.AddSample;

import core.*;
import hci.MainWindow;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ViewAddSample extends JPanel {

    private JLabel title, customerReminder;
    private JPanel samplePanel;
    private JComboBox analysisComboBox, speciesComboBox;
    private JButton validateAddSample;

    private Customer customer;
    private ArrayList<Specie> species;
    private ArrayList<Analysis> analysis;

    public ViewAddSample(IntegrationTest integrationTest) {
        species = new ArrayList<>();
        for (SpecieCategory specieCategory: integrationTest.theCategories) {
            for (Specie s:specieCategory.getSpecies()) {
                species.add(s);
            }
        }

        analysis = new ArrayList<>();
        for (Analysis a:integrationTest.theAnalyses) {
            analysis.add(a);
        }

        title = new JLabel("Add a sample");
        title.setFont(new Font("sans serif", Font.PLAIN, 24));

        analysisComboBox = new JComboBox(analysis.toArray());
        speciesComboBox = new JComboBox(species.toArray());

        validateAddSample = new JButton("Validate");

        // Add Title, Customer reminder and combo boxes to JPanel
        samplePanel = new JPanel();
        samplePanel.add(title);
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
        this.add(analysisComboBox, c);

        c.gridy = 2;
        this.add(speciesComboBox, c);
    }

    public ViewAddSample(IntegrationTest integrationTest, Specie specie, Analysis anal) {
        species = new ArrayList<>();
        species.add(specie);

        analysis = new ArrayList<>();
        analysis.add(anal);

        title = new JLabel("Add a sample");
        title.setFont(new Font("sans serif", Font.PLAIN, 24));

        analysisComboBox = new JComboBox(analysis.toArray());
        speciesComboBox = new JComboBox(species.toArray());

        validateAddSample = new JButton("Validate");

        // Add Title, Customer reminder and combo boxes to JPanel
        samplePanel = new JPanel();
        samplePanel.add(title);
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

        analysisComboBox.setEnabled(false);
        speciesComboBox.setEnabled(false);

        c.anchor = GridBagConstraints.CENTER;
        this.add(title, c);

        c.gridy = 1;
        this.add(new JLabel("You have choose these parameters earlier!"),c);

        c.gridy = 2;
        this.add(analysisComboBox, c);

        c.gridy = 3;
        this.add(speciesComboBox, c);
    }

    public JComboBox getAnalysisComboBox() {
        return analysisComboBox;
    }

    public JComboBox getSpeciesComboBox() {
        return speciesComboBox;
    }

}
