package hci.ConsultCustomer;

import core.Customer;
import core.IntegrationTest;
import core.Order;
import core.Sample;
import hci.MainWindow;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 * Created by ambie on 17/05/2017.
 */
public class ControllerConsultCustomer {

    private ModelConsultCustomer modelConsultCustomer;
    private ViewConsultCustomer viewConsultCustomer;

    public ControllerConsultCustomer(IntegrationTest integrationT) {
        modelConsultCustomer = new ModelConsultCustomer(integrationT);
        viewConsultCustomer = new ViewConsultCustomer(integrationT.theCustomers);

        viewConsultCustomer.getTreeView().addTreeSelectionListener(new HandlerJTreeSelection());
    }


    public ModelConsultCustomer getModelConsultCustomer() {
        return modelConsultCustomer;
    }

    public ViewConsultCustomer getViewConsultCustomer() {
        return viewConsultCustomer;
    }

    private class HandlerJTreeSelection implements TreeSelectionListener{
        @Override
        public void valueChanged(TreeSelectionEvent e) {
            if(null != e.getNewLeadSelectionPath()){
                if(null != e.getNewLeadSelectionPath().getLastPathComponent()){
                    Object selected = e.getNewLeadSelectionPath().getLastPathComponent();
                    selected = ((DefaultMutableTreeNode) selected).getUserObject();
                    if(selected instanceof Customer){
                        focusCustomer((Customer) selected);
                    }else if(selected instanceof Order){
                        focusOrder((Order) selected);
                    }else if(selected instanceof Sample){
                        focusSample((Sample) selected);
                    }else if(selected.equals("Exit")){
                        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you really want to quit?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                        if(dialogResult == 0) {
                            //TODO: leave the module
                        }
                    }
                }
            }
        }
    }

    private void focusCustomer(Customer customer) {
        viewConsultCustomer.focus(customer);
    }

    private void focusOrder(Order order) {
        viewConsultCustomer.focus(order);
    }

    private void focusSample(Sample sample) {
        viewConsultCustomer.focus(sample);
    }


    public static void main(String[] args){
        MainWindow w = new MainWindow();
        IntegrationTest i = new IntegrationTest();
        ControllerConsultCustomer c = new ControllerConsultCustomer(i);
        w.setContent(c.getViewConsultCustomer());
        w.setSize(500,570);
    }

}
