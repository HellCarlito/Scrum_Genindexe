package hci;

import core.Customer;
import core.IntegrationTest;

import javax.swing.*;
import java.awt.*;

/**
 * This class take in charge the creation of the context for any new panel
 */
public class MainWindow extends JFrame
{
    private JScrollPane scrollpane;
    private JPanel header;
    private JLabel title = new JLabel("Genindexe",JLabel.CENTER);
    private JButton back,signIn,signOut;
    private Customer logCustomer;
    private ControlerMainWindow evt;
    private IntegrationTest integrationTest;

    public MainWindow(IntegrationTest integrationTest){
        super("Genindexe");
        this.integrationTest = integrationTest;
        logCustomer=null;
        getContentPane().setLayout(new BorderLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void setContent(JPanel jp){
    	getContentPane().removeAll();
    	getContentPane().add(getHeader(), BorderLayout.NORTH);
        scrollpane = new JScrollPane(jp);
        scrollpane.getVerticalScrollBar().setUnitIncrement(16);
        getContentPane().add(scrollpane, BorderLayout.CENTER);
        setSize(900,650);
        getBack().updateUI();
    }

    public JPanel getHeader()
    {
    	header = new JPanel(new BorderLayout());
        back = new JButton("Back");
        signIn = new JButton("Sign in");
        signOut = new JButton("Sign out");
        
        //Definition of font, foreground and background 
        back.setFont(new Font("Lucida Fax", Font.BOLD, 20));
        back.setForeground(new Color(255,255,255));
        back.setBackground(new Color(89,148,60));
        signIn.setFont(new Font("Lucida Fax", Font.BOLD, 20));
        signIn.setForeground(new Color(255,255,255));
        signIn.setBackground(new Color(89,148,60));
        signOut.setFont(new Font("Lucida Fax", Font.BOLD, 20));
        signOut.setForeground(new Color(255,255,255));
        signOut.setBackground(new Color(89,148,60));
        
        //Definition of fonts and colors
        title.setFont(new Font("Lucida Fax", Font.BOLD, 24));
      	title.setForeground(new Color(89,148,60));
      	
      	//Listeners for buttons action
        evt = new ControlerMainWindow(this, integrationTest);
        back.addMouseListener(evt);
        signIn.addMouseListener(evt);
        signOut.addMouseListener(evt);
        
        header.add(back, BorderLayout.WEST);
        header.add(title, BorderLayout.CENTER);
        if (getLogCustomer()!=null)
        {
        	title.setText("Genindexe   -   "+getLogCustomer().getName()+" ("+getLogCustomer().getTown()+")");
        	header.add(signOut, BorderLayout.EAST);
        }
        else
        {
        	title.setText("Genindexe");
        	header.add(signIn, BorderLayout.EAST);
        }
        

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
    
    public JButton getSignOut()
    {
    	return signOut;
    }

    public Customer getLogCustomer()
    {
    	return logCustomer;
    }
    
    public void setLogCustomer(Customer c)
    {
    	logCustomer=c;
    }
    
    public void setLogOut()
    {
    	logCustomer=null;
    }


}
