package hci.CreateMicroplate;

import core.IntegrationTest;
import hci.MainWindow;

import javax.swing.*;
import java.awt.*;

public class ViewCreateMicroplate extends JPanel {

    //Form for category information
    private JLabel labelNewMicroplate, labelSpinner;
    private JButton buttonSubmit;
    private JSpinner numberSpinner;
    private SpinnerNumberModel numberSpinnerModel;
    //private ControlerCreateMicroplate evt;

    /**
     * Constructor
     */
    public ViewCreateMicroplate(IntegrationTest base) {

        //Definition of fonts and colors
        labelNewMicroplate = new JLabel("Create a new microplate : ");
        labelNewMicroplate.setFont(new Font("Lucida Fax", Font.BOLD, 20));
        labelNewMicroplate.setForeground(new Color(89, 148, 60));

        //Definition of font, foreground and background
        labelSpinner = new JLabel("Choose a value between 0 and 8");
        labelSpinner.setFont(new Font("Lucida Fax", Font.BOLD, 14));
        labelSpinner.setForeground(new Color(134, 134, 134));

        //Definition of font, foreground and background
        buttonSubmit = new JButton("Submit");
        buttonSubmit.setFont(new Font("Lucida Fax", Font.BOLD, 18));
        buttonSubmit.setForeground(new Color(255, 255, 255));
        buttonSubmit.setBackground(new Color(89, 148, 60));

        Double current = new Double(4);
        Double min = new Double(0);
        Double max = new Double(8);
        Double step = new Double(1);
        numberSpinnerModel = new SpinnerNumberModel(current, min, max, step);
        numberSpinner = new JSpinner(numberSpinnerModel);

        //Listeners for buttons action
        //evt = new ControlerCreateMicroplate(this,base);
        //buttonSubmit.addActionListener(evt);

        //Creation of a gridbaglayout
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        //Position of labels
        c.gridx = 2;
        c.gridy = 1;
        c.insets = new Insets(0, 0, 10, 0);
        this.add(labelNewMicroplate, c);

        // Position of Spinner
        c.gridy = 2;
        c.insets = new Insets(0, 0, 10, 0);
        this.add(labelSpinner, c);

        // Position of Spinner
        c.gridy = 3;
        c.insets = new Insets(0, 0, 10, 0);
        this.add(numberSpinner, c);

        //Position of button
        c.gridy = 4;
        c.insets = new Insets(0, 0, 10, 0);
        this.add(buttonSubmit, c);


    }

    public static void main(String[] args) {
        IntegrationTest aBase = new IntegrationTest();
        MainWindow w = new MainWindow();
        w.setContent(new ViewCreateMicroplate(aBase));
    }

    public JButton getButtonSubmit() {

        return buttonSubmit;
    }

}
