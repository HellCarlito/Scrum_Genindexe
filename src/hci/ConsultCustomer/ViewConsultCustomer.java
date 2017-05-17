package hci.ConsultCustomer;


import com.sun.org.apache.xpath.internal.operations.Or;
import core.*;
import hci.AddSample.ViewAddSample;
import hci.MainWindow;
import sun.awt.image.GifImageDecoder;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import java.awt.*;
import java.net.URL;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ViewConsultCustomer extends JPanel{

    private Font title;

    private JPanel left;
    private JPanel right;
    private JSplitPane horizontalSplitPane;

    private JScrollPane jScrollPaneTree;

    private JTree treeView;

    private ArrayList<Customer> customers;

    public ViewConsultCustomer(ArrayList<Customer> customers) {
        title = new Font("sans serif", Font.PLAIN, 22);

        jScrollPaneTree = new JScrollPane();
        this.customers = customers;
        left = new JPanel();
        right = new JPanel();
        horizontalSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, left, right);
        this.setLayout(new BorderLayout());
        this.add(horizontalSplitPane, BorderLayout.CENTER);

        treeView = new JTree();

        left.setLayout(new BorderLayout());
        right.setLayout(new BorderLayout());
        left.setMinimumSize(new Dimension(150,0));
        right.setMinimumSize(new Dimension(300,0));

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

    }


    public void focus(Customer c){
        right.removeAll();
        URL pathOrder1 = getClass().getResource("/order1.png");
        URL pathOrder2 = getClass().getResource("/order2.png");
        URL pathOrder3 = getClass().getResource("/order3.png");
        URL pathOrder4 = getClass().getResource("/order4.png");
        ImageIcon order1 = new ImageIcon(pathOrder1);
        ImageIcon order2 = new ImageIcon(pathOrder2);
        ImageIcon order3 = new ImageIcon(pathOrder3);
        ImageIcon order4 = new ImageIcon(pathOrder4);

        JLabel information_section = new JLabel("Information");
        information_section.setFont(title);

        JLabel name = new JLabel(c.getName());
        JLabel town = new JLabel(c.getTown());
        JLabel corporation = new JLabel(c.getCorporateName());
        JLabel professional = new JLabel(c.getProfessional()?"Professional":"Individual");

        JLabel contact_section = new JLabel("Contact");
        contact_section.setFont(title);

        JLabel email = new JLabel(c.getEmail());
        JLabel phone = new JLabel(c.getPhoneNumber());
        JLabel cell = new JLabel(c.getCellNumber());
        JLabel fax = new JLabel(c.getFax());
        JLabel location = new JLabel(c.getAddress()+", "+c.getTown());

        JLabel stats_section = new JLabel("Statistics");
        stats_section.setFont(title);

        JLabel nb_orders = new JLabel(""+c.getOrders().size());
        int s1=0,s2=0,s3=0,s4=0;
        if (c.getOrders().size() > 0){
            for (Order o: c.getOrders()) {
                switch (o.getStatus()){
                    case inProgress:s1++;break;
                    case toAnalyze:s2++;break;
                    case inAnalysis:s3++;break;
                    case completed:s4++;break;
                }
            }
        }

        JLabel inProgress = new JLabel(""+s1);
        inProgress.setIcon(order1);
        inProgress.setHorizontalTextPosition(SwingConstants.RIGHT);
        JLabel toAnalyze = new JLabel(""+s2);
        toAnalyze.setIcon(order2);
        toAnalyze.setHorizontalTextPosition(SwingConstants.RIGHT);
        JLabel inAnalysis = new JLabel(""+s3);
        inAnalysis.setIcon(order3);
        inAnalysis.setHorizontalTextPosition(SwingConstants.RIGHT);
        JLabel completed = new JLabel(""+s4);
        completed.setIcon(order4);
        completed.setHorizontalTextPosition(SwingConstants.RIGHT);

        JPanel content = new JPanel();
        right.add(content, BorderLayout.NORTH);
        content.setLayout(new GridBagLayout());
        GridBagConstraints gb = new GridBagConstraints();
        gb.weightx = 1;
        gb.weighty = 1;
        gb.gridx = 0;
        gb.insets = new Insets(5,10,0,5);
        gb.gridy = 0;
        gb.gridwidth = 2;
        gb.anchor = GridBagConstraints.WEST;

        content.add(information_section, gb);

        gb.anchor = GridBagConstraints.EAST;
        gb.gridy = 1;
        gb.gridx = 0;
        gb.gridwidth = 1;
        content.add(new JLabel("Name: "), gb);

        gb.gridx = 1;
        gb.anchor = GridBagConstraints.WEST;
        content.add(name, gb);

        gb.gridy = 2;
        gb.anchor = GridBagConstraints.EAST;
        gb.gridx = 0;
        gb.gridwidth = 1;
        content.add(new JLabel("City: "), gb);

        gb.anchor = GridBagConstraints.WEST;
        gb.gridx = 1;
        content.add(town, gb);

        gb.gridy = 3;
        gb.gridx = 0;
        if(c.getProfessional()){
            gb.gridwidth = 1;
            gb.anchor = GridBagConstraints.EAST;
            content.add(professional, gb);
            gb.gridx = 1;
            gb.anchor = GridBagConstraints.WEST;
            content.add(corporation, gb);
        }else {
            gb.anchor = GridBagConstraints.CENTER;
            gb.gridwidth = 2;
            content.add(professional, gb);
            gb.gridwidth = 1;
        }

        gb.gridwidth = 2;
        gb.gridy = 4;
        gb.anchor = GridBagConstraints.WEST;

        gb.fill = GridBagConstraints.HORIZONTAL;
        gb.gridy = 5;
        content.add(new JSeparator(), gb);
        gb.fill = 0;


        gb.gridy = 6;
        content.add(contact_section, gb);

        gb.gridwidth = 1;
        gb.gridy = 7;
        gb.anchor = GridBagConstraints.EAST;
        content.add(new JLabel("Email: "), gb);

        gb.anchor = GridBagConstraints.WEST;
        gb.gridx = 1;
        content.add(email, gb);

        gb.anchor = GridBagConstraints.EAST;
        gb.gridx = 0;
        gb.gridy = 8;
        content.add(new JLabel("Phone: "), gb);

        gb.gridx = 1;
        gb.anchor = GridBagConstraints.WEST;
        content.add(phone, gb);

        gb.anchor = GridBagConstraints.EAST;
        gb.gridx = 0;
        gb.gridy = 9;
        content.add(new JLabel("Cell: "), gb);

        gb.gridx = 1;
        gb.anchor = GridBagConstraints.WEST;
        content.add(cell, gb);

        gb.gridy = 10;
        gb.gridx = 0;
        gb.anchor = GridBagConstraints.EAST;
        content.add(new JLabel("Fax: "), gb);

        gb.gridx = 1;
        gb.anchor = GridBagConstraints.WEST;
        content.add(fax, gb);

        gb.gridy = 11;
        gb.gridx = 0;
        gb.anchor = GridBagConstraints.EAST;
        content.add(new JLabel("Address: "), gb);

        gb.gridx = 1;
        gb.anchor = GridBagConstraints.WEST;
        content.add(location, gb);

        gb.fill = GridBagConstraints.HORIZONTAL;
        gb.gridy = 12;
        gb.gridx = 0;
        gb.gridwidth = 2;
        content.add(new JSeparator(), gb);
        gb.fill = 0;

        gb.gridy = 13;
        gb.anchor = GridBagConstraints.WEST;
        content.add(stats_section, gb);

        gb.anchor = GridBagConstraints.CENTER;

        gb.insets = new Insets(10,60,10,10);
        gb.gridy = 14;
        content.add(inProgress, gb);

        gb.gridy = 15;
        content.add(toAnalyze, gb);

        gb.gridy = 16;
        content.add(inAnalysis, gb);

        gb.gridy = 17;
        content.add(completed, gb);

        right.updateUI();
    }


    public void focus(Order o){

    }

    public void focus(Sample s){

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
                Date d=new Date(((Order) val).getTimestamp().getTime());
                label.setText(DateFormat.getDateInstance().format(d));
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
}
