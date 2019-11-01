package Menyalov;

import org.apache.camel.main.Main;
import javax.swing.JFrame;

public class MainApp {
    public static void main(String... args) throws Exception {
        //эта функция может быть и в другом классе
        MyWindowApp app = new MyWindowApp(); //Создаем экземпляр нашего приложения
        app.setVisible(true); //С этого момента приложение запущено!
    }
}