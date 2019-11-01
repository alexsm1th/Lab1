package Menyalov;
import org.apache.camel.main.Main;
import java.awt.*;
import javax.swing.*;
public class MyWindowApp extends JFrame { //Наследуя от JFrame мы получаем всю функциональность окна{
    private JLabel label = new JLabel("kek");
    public MyWindowApp() {
        super("Lab1"); //Заголовок окна
        setBounds(100, 100, 200, 200);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}