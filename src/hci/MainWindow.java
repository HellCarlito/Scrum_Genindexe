package hci;

import javax.swing.*;
import java.awt.*;

/**
 * This class take in charge the creation of the context for any new panel
 */
public class MainWindow extends JFrame {

    private JScrollPane jScrollPane;
    JScrollPane scrollpane;

    public MainWindow(){
        super("Genindexe");
        jScrollPane = new JScrollPane();
        getContentPane().add(jScrollPane);
        getContentPane().setLayout(new BorderLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void setContent(JPanel jp){
        getContentPane().removeAll();
        jScrollPane.removeAll();
        scrollpane = new JScrollPane(jp);
        getContentPane().add(scrollpane, BorderLayout.CENTER);
        jScrollPane.updateUI();

    }

}
