package hci.ConsultCustomer;

import core.IntegrationTest;
import hci.MainWindow;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

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
            Object selected = e.getNewLeadSelectionPath().getLastPathComponent();

        }
    }


    public static void main(String[] args){
        MainWindow w = new MainWindow();
        IntegrationTest i = new IntegrationTest();
        ControllerConsultCustomer c = new ControllerConsultCustomer(i);
        w.setContent(c.getViewConsultCustomer());
    }

}
