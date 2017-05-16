package hci;

import javax.swing.*;

/**
 * This class take in charge the creation of the context for any new panel
 */
public class MainWindow extends JFrame {

    public MainWindow(){
        super("Genindexe");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void setContent(JPanel jp){
        getContentPane().removeAll();
        getContentPane().add(jp);
        jp.updateUI();
        pack();
    }

}
