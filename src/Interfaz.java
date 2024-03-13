
import javax.swing.*; //km_80
//import javax.awt.event.*; // extra ;p
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener ;

public class Interfaz extends JFrame implements ActionListener{

    private JTextField textField ;
    private JLabel label1 ;
    private JButton button ;

    public Interfaz() {//km_80
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        label1 = new JLabel("Message") ;
        label1.setBounds(15, 10, 100, 30) ;
        add(label1) ;

        textField = new JTextField() ;
        textField.setBounds(80, 17, 190, 20) ;
        add(textField) ;

        button = new JButton("Display") ;
        button.setBounds(10, 60, 100, 30) ;
        add(button) ;
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {//km_80
        if(e.getSource()== button) {
            String chain = textField.getText() ;
            JOptionPane.showMessageDialog(null, chain) ;
        }
    }
    public static void main (String [] args) {
        Interfaz interfaz = new Interfaz() ;
        interfaz.setBounds(0,0, 300, 150 ) ;
        interfaz.setVisible(true) ;
        interfaz.setLocationRelativeTo(null) ;
    }
}