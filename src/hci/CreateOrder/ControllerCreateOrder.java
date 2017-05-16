package hci.CreateOrder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerCreateOrder {

    private JPanel view;
    private ModelCreateOrder model;

    public ControllerCreateOrder() {
        this.model = new ModelCreateOrder();

        this.view = new ViewCreateOrder(model.getArrayListCustomer());


    }

    private class HandlerSelectionCustomer implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
