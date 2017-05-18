package hci;

import javax.swing.*;
import core.Customer;
import core.CustomerBase;
import hci.ConnectCustomer.ControlerConnectCustomer;
import hci.ConnectCustomer.ViewConnectCustomer;

import java.awt.*;

/**
 * This class take in charge the creation of the context for any new panel
 */
public class MainWindow extends JFrame
{
    private JScrollPane scrollpane;
    private JPanel header;
    private JLabel title = new JLabel("Genindexe",JLabel.CENTER);
    private JButton back;
    private JButton signIn;
    private Customer logCustomer;
    private CustomerBase base;
    private ControlerMainWindow evt;

    public MainWindow(){
        super("Genindexe");
        logCustomer=null;
        base = new CustomerBase();
        getContentPane().setLayout(new BorderLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void setContent(JPanel jp){
    	getContentPane().removeAll();
    	getContentPane().add(getHeader(), BorderLayout.NORTH);
        scrollpane = new JScrollPane(jp);
        getContentPane().add(scrollpane, BorderLayout.CENTER);
        pack();
    }
     
    public JPanel getHeader()
    {
    	header = new JPanel(new BorderLayout());
        back = new JButton("Back");
        signIn = new JButton("Sign in");
        
        //Definition of font, foreground and background 
        back.setFont(new Font("Lucida Fax", Font.BOLD, 20));
        back.setForeground(new Color(255,255,255));
        back.setBackground(new Color(89,148,60));
        signIn.setFont(new Font("Lucida Fax", Font.BOLD, 20));
        signIn.setForeground(new Color(255,255,255));
        signIn.setBackground(new Color(89,148,60));
        
        //Definition of fonts and colors
        title.setFont(new Font("Lucida Fax", Font.BOLD, 24));
      	title.setForeground(new Color(89,148,60));
      	
      	//Listeners for buttons action
        evt = new ControlerMainWindow(this);
        back.addMouseListener(evt);
        signIn.addMouseListener(evt);
        
        header.add(back, BorderLayout.WEST);
        header.add(title, BorderLayout.CENTER);
        header.add(signIn, BorderLayout.EAST);
        
        return header;
    }
    
    public JButton getBack()
    {
    	return back;
    }
    
    public JButton getSignIn()
    {
    	return signIn;
    }
    
    public CustomerBase getBase()
    {
    	return base;
    }
    
    public Customer getLogCustomer()
    {
    	return logCustomer;
    }
    
    public void setLogCustomer(Customer c)
    {
    	logCustomer=c;
    }
    
    public static void main(String[] args){
        //"The real main" that will launch the app
        //TODO: All the MVC modules should be able to run them self using a this way as FOLLOWING
        //TODO: new ControllerMonModule(MainWindow app, IntegrationTest integrationTest)
        //TODO:         create its view on the app.setContent and getting data from integrationTest
    }

}
