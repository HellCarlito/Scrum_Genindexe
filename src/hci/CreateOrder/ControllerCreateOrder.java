package hci.CreateOrder;

import core.*;
import hci.AddSample.ControllerAddSample;
import hci.MainTest.ControllerMainTest;
import hci.MainWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ControllerCreateOrder {

    private ViewCreateOrder view;
    private ModelCreateOrder model;
    private IntegrationTest integrationTest;
    private MainWindow main;

    public ControllerCreateOrder(IntegrationTest integrationTest, MainWindow m) {
        this.model = new ModelCreateOrder(integrationTest);
        this.view = new ViewCreateOrder(model.getCustomers());

        this.view.getButtonsCustomer().forEach((c,b) -> {b.addActionListener(new HandlerSelectionCustomer());});
        this.view.getButtonsSample().forEach((s,b) -> {b.addActionListener(new HandlerRemoveSample());});
        this.view.getValidate().addActionListener((e -> {sendForm();}));
        this.view.getAddSample().addActionListener((e -> {addSample();}));

        m.setContent(this.view);
    }

    private void addSample() {
        ControllerAddSample controllerAddSample = new ControllerAddSample(model.getIntegrationTest());

        Sample samp;
        if (view.getButtonsSample().size() < 1)
            samp = controllerAddSample.creationSamplePopUp(model.getOrder());
        else{
            Specie s = view.getButtonsSample().entrySet().iterator().next().getKey().getSpecie();
            Analysis a = view.getButtonsSample().entrySet().iterator().next().getKey().getAnalysis();
            samp = controllerAddSample.creationSamplePopUp(model.getOrder(), a, s);
        }

        if(null != samp){
            view.addSampleToList(samp);
            this.view.getButtonsSample().forEach((s,b) -> {b.addActionListener(new HandlerRemoveSample());});
        }
    }

    private void sendForm() {
        Boolean isGood = true;
        if(view.getButtonsSample().size() < 1 || null == view.getCustomer()){
            JOptionPane.showMessageDialog(null, "At least one sample is required");
            isGood = false;
        }

        if(isGood){
            view.getCustomer().addOrder(model.getOrder());
            model.getOrder().setCustomer(view.getCustomer());
            List<Sample> samples = new ArrayList<>();
            view.getButtonsSample().forEach((s,b)->{samples.add(s);});
            model.getOrder().setSamples(samples);
            model.getOrder().setTimestamp();
            //Link to another panel
            JOptionPane.showMessageDialog(null, "Your order has been saved.", "Saved!", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private class HandlerSelectionCustomer implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            view.getButtonsCustomer().forEach((c,b)->{
                if (e.getSource() == b){
                    view.setCustomer(c);
                }
            });
        }
    }

    private class HandlerRemoveSample implements ActionListener{
        private Sample sampleToRemove;
        private Boolean remove = false;
        @Override
        public void actionPerformed(ActionEvent e) {
            view.getButtonsSample().forEach((s,b) ->{
                if (e.getSource() == b){
                    setSampleToRemove(s);
                }
            });
            if (remove)
                view.removeSampleToList(sampleToRemove);
            remove =false;
        }
        private void setSampleToRemove(Sample s){
            sampleToRemove = s;
            remove = true;
        }
    }

    public ViewCreateOrder getView() {
        return view;
    }

}
