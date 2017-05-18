package hci.CreateOrder;

import core.*;
import hci.AddSample.ControllerAddSample;
import hci.MainWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ControllerCreateOrder {

    private ViewCreateOrder view;
    private ModelCreateOrder model;

    public ControllerCreateOrder(IntegrationTest integrationTest) {
        this.model = new ModelCreateOrder(integrationTest);
        this.view = new ViewCreateOrder(model.getCustomers());

        this.view.getButtonsCustomer().forEach((c,b) -> {b.addActionListener(new HandlerSelectionCustomer());});
        this.view.getButtonsSample().forEach((s,b) -> {b.addActionListener(new HandlerRemoveSample());});
        this.view.getValidate().addActionListener((e -> {sendForm();}));
        this.view.getAddSample().addActionListener((e -> {addSample();}));
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
            model.getOrder().setSamples((List<Sample>) view.getButtonsSample().keySet());
            model.getOrder().setTimestamp();
            //Link to another panel
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

    public static void main(String[] args){
        IntegrationTest i = new IntegrationTest();
        MainWindow w = new MainWindow(i);
        ControllerCreateOrder controller = new ControllerCreateOrder(i);
        w.setContent(controller.getView());
    }

}
