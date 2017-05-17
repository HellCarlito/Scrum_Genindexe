package hci;

import javax.swing.*;
import java.awt.*;

/**
 * This class take in charge the creation of the context for any new panel
 */
public class MainWindow extends JFrame {

    private JScrollPane scrollpane;

    public MainWindow(){
        super("Genindexe");
        getContentPane().setLayout(new BorderLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void setContent(JPanel jp){
        getContentPane().removeAll();
        scrollpane = new JScrollPane(jp);
        getContentPane().add(scrollpane, BorderLayout.CENTER);
        pack();
    }

    public static void main(String[] args){
        //"The real main" that will launch the app
        //TODO: All the MVC modules should be able to run them self using a this way as FOLLOWING
        //TODO: new ControllerMonModule(MainWindow app, IntegrationTest integrationTest)
        //TODO:         create its view on the app.setContent and getting data from integrationTest
    }

}
