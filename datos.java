import javax.management.ValueExp;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class datos extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JButton limpiarButton;
    private JButton sumarButton;
    private JButton CerrarButton;
    private JPanel pantalla;
    private JTextField resultado;
    private JButton holaButton;
    private JTextField Saluda;
    private JButton unionButton;
    private JTextField frase;

    public datos(){
        super("Operaciones");
        setContentPane(pantalla);
        CerrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                resultado.setText("");
                Saluda.setText("");
                frase.setText("");
            }
        });
        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    double valor1 = Double.parseDouble(textField1.getText());
                    double valor2 = Double.parseDouble(textField2.getText());
                    double recibe_resultado = valor1 + valor2;
                    resultado.setText(Double.toString(recibe_resultado));
                }catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(null, "Error ingresar numeros validos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        holaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Saluda.setText("Hola " + Saluda.getText());
            }
        });
        unionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frase.setText(textField1.getText() + textField2.getText());
            }
        });
    }

    public static void main(String[] ARGS){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new datos();
                frame.setSize(400,300);
                frame.setVisible(true);
            }
        });
    }
}
