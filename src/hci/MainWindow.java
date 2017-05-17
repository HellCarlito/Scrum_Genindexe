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

}
