package hci.AddSample;

import core.*;

import javax.swing.*;

public class ControllerAddSample {
    public ControllerAddSample() {

    }

    public Sample creationSamplePopUp(Order order){
        ViewAddSample viewAddSample = new ViewAddSample(new IntegrationTest());
        int result = JOptionPane.showConfirmDialog(null,
                viewAddSample,
                "Add Sample",
                JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION){
            return new Sample(
                    (Analysis) viewAddSample.getAnalysisComboBox().getSelectedItem(),
                    (Specie) viewAddSample.getSpeciesComboBox().getSelectedItem(),
                    order);
        }
        return null;
    }
}
