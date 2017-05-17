package hci.ConsultCustomer;


import com.sun.org.apache.xpath.internal.operations.Or;
import core.*;
import hci.AddSample.ViewAddSample;
import hci.MainWindow;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;

public class ViewConsultCustomer extends JPanel{

    private JPanel left;
    private JPanel right;
    private JSplitPane horizontalSplitPane;

    private JScrollPane jScrollPaneTree;

    private JTree treeView;

    private ArrayList<Customer> customers;

    public ViewConsultCustomer(ArrayList<Customer> customers) {
        jScrollPaneTree = new JScrollPane();
        this.customers = customers;
        left = new JPanel();
        right = new JPanel();
        horizontalSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, left, right);
        this.setLayout(new BorderLayout());
        this.add(horizontalSplitPane, BorderLayout.CENTER);

        treeView = new JTree();

        left.setLayout(new BorderLayout());

        initTreeContent();
    }

    private void initTreeContent(){
        DefaultMutableTreeNode root = new DefaultMutableTreeNode();

        for (Customer c:customers) {
            DefaultMutableTreeNode tempCusto = new DefaultMutableTreeNode(c);
            root.add(tempCusto);
            for (Order o: c.getOrders()){
                DefaultMutableTreeNode tempOrder = new DefaultMutableTreeNode(o);
                tempCusto.add(tempOrder);
                for (Sample s: o.getSamples()){
                    DefaultMutableTreeNode tempSample = new DefaultMutableTreeNode(s);
                    tempOrder.add(tempSample);
                }
            }
        }
        treeView = new JTree(root);
        treeView.setRootVisible(false);
        treeView.setCellRenderer(new PersonalizedCellRenderer());
        jScrollPaneTree = new JScrollPane(treeView);
        left.removeAll();
        left.setBackground(Color.WHITE);
        left.add(jScrollPaneTree, BorderLayout.CENTER);
        left.setMinimumSize(new Dimension(150,300));
        right.setMinimumSize(new Dimension(300,300));
    }

    public JTree getTreeView() {
        return treeView;
    }

    private class PersonalizedCellRenderer implements TreeCellRenderer{

        ImageIcon user;
        ImageIcon sample0;
        ImageIcon sample1;
        ImageIcon sample2;
        ImageIcon sample3;
        ImageIcon order1;
        ImageIcon order2;
        ImageIcon order3;
        ImageIcon order4;
        Font font1;
        Font font2;

        boolean icon = true;

        public PersonalizedCellRenderer(){
            URL pathUser = getClass().getResource("/customer.png");
            URL pathSample0 = getClass().getResource("/chem0.png");
            URL pathSample1 = getClass().getResource("/chem1.png");
            URL pathSample2 = getClass().getResource("/chem2.png");
            URL pathSample3 = getClass().getResource("/chem3.png");
            URL pathOrder1 = getClass().getResource("/order1.png");
            URL pathOrder2 = getClass().getResource("/order2.png");
            URL pathOrder3 = getClass().getResource("/order3.png");
            URL pathOrder4 = getClass().getResource("/order4.png");
            if (null ==pathUser || null == pathOrder1 || null == pathOrder2 || null == pathOrder3 || null == pathOrder4
                    || null == pathSample0 || null == pathSample1 || null == pathSample2 || null == pathSample3){
                icon = false;
            }else {
                user = new ImageIcon(pathUser);
                sample0 = new ImageIcon(pathSample0);
                sample1 = new ImageIcon(pathSample1);
                sample2 = new ImageIcon(pathSample2);
                sample3 = new ImageIcon(pathSample3);
                order1 = new ImageIcon(pathOrder1);
                order2 = new ImageIcon(pathOrder2);
                order3 = new ImageIcon(pathOrder3);
                order4 = new ImageIcon(pathOrder4);
            }
            font1 = new Font("sans serif", Font.ITALIC | Font.BOLD, 12);
            font2 = new Font("sans serif", Font.PLAIN, 12);
        }


        @Override
        public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {

            Object val = ((DefaultMutableTreeNode)value).getUserObject();

            JLabel label = new JLabel();
            label.setIconTextGap(3);
            label.setHorizontalTextPosition(SwingConstants.RIGHT);
            JPanel component = new JPanel();
            component.add(label);

            if(val instanceof core.Customer){
                label.setText(((Customer) val).getName());
                if (icon)label.setIcon(user);
                component.add(new JLabel(" "+((Customer) val).getOrders().size()){{setFont(font1);setForeground(Color.LIGHT_GRAY);}});
            }else if(val instanceof Order){
                label.setText(String.valueOf(((Order) val).getTimestamp()));
                if (icon)switch (((Order) val).getStatus()){
                    case inProgress:label.setIcon(order1);break;
                    case toAnalyze:label.setIcon(order2);break;
                    case inAnalysis:label.setIcon(order3);break;
                    case completed:label.setIcon(order4);break;
                }
            }else if(val instanceof Sample){
                label.setText(((Sample) val).getSpecie().getName()+" "+((Sample) val).getAnalysis().getName());
                if (icon)label.setIcon(sample2);
                component.add(new JLabel(" "+((Sample) val).getIdSample()){{setFont(font1);setForeground(Color.LIGHT_GRAY);}});
                if (icon)if (!((Sample) val).getResult().isEmpty()){
                    Result currentResult = ((Sample) val).getResults().get(((Sample) val).getResults().size() - 1);
                    ResultStatus status = currentResult.getStatus();
                    if(null != status)switch (status){
                        case VALIDATED:
                            label.setIcon(sample1);
                            break;
                        case UNREADABLE:
                            label.setIcon(sample3);
                            break;
                    }else
                        label.setIcon(sample2);
                }else {
                    label.setIcon(sample0);
                }
            }
            if (selected){
                component.setBorder(new EtchedBorder());
            }
            component.setBackground(Color.WHITE);
            return component;
        }
    }

//    public static void main(String[] args){
//        MainWindow w = new MainWindow();
//        IntegrationTest i = new IntegrationTest();
//        ControllerConsultCustomer c = new ControllerConsultCustomer(i);
//        w.setContent(c.getViewConsultCustomer());
//    }

}
