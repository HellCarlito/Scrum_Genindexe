package hci.CreateOrder;

import core.*;
import hci.AddSample.ControllerAddSample;
import hci.MainWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerCreateOrder {

    private ViewCreateOrder view;
    private ModelCreateOrder model;

    public ControllerCreateOrder() {
        this.model = new ModelCreateOrder(new CustomerBase(){{addCustomer(new Customer("Paul", "poitiers"));}});
        this.view = new ViewCreateOrder(model.getArrayListCustomer());

        this.view.getButtonsCustomer().forEach((c,b) -> {b.addActionListener(new HandlerSelectionCustomer());});
        this.view.getButtonsSample().forEach((s,b) -> {b.addActionListener(new HandlerRemoveSample());});
        this.view.getValidate().addActionListener((e -> {sendForm();}));
        this.view.getAddSample().addActionListener((e -> {addSample();}));
    }

    private void addSample() {
        ControllerAddSample controllerAddSample = new ControllerAddSample();
        Sample samp = controllerAddSample.creationSamplePopUp(model.getOrder());
        if(null != samp){
            view.addSampleToList(samp);
            this.view.getButtonsSample().forEach((s,b) -> {b.addActionListener(new HandlerRemoveSample());});
        }
    }

    private void sendForm() {
        Boolean isGood = true;
        if(view.getButtonsSample().size() < 1 || null == view.getCustomer()){
            JOptionPane.showMessageDialog(null, "Il faut ajouter au moins un échantillon");
            isGood = false;
        }

        if(isGood){

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
        MainWindow w = new MainWindow();
        ControllerCreateOrder controller = new ControllerCreateOrder();
        w.setContent(controller.getView());
    }

}
