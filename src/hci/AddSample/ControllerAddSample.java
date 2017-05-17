package hci.AddSample;

import core.*;

import javax.swing.*;

public class ControllerAddSample {

    private ModelAddSample modelAddSample;

    public ControllerAddSample(IntegrationTest integrationTest) {
        modelAddSample = new ModelAddSample(integrationTest);
        integrationTest.theCategories.size();
    }

    public Sample creationSamplePopUp(Order order){
        ViewAddSample viewAddSample = new ViewAddSample(modelAddSample.getIntegrationTest());
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

    public Sample creationSamplePopUp(Order order, Analysis analysis, Specie specie){
        ViewAddSample viewAddSample = new ViewAddSample(modelAddSample.getIntegrationTest(), specie, analysis);
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
