import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Form uygulamasının çalışması için Frame oluşturulur ve Panel içine dahil edilir.
        JFrame frame = new JFrame("Buton Kontrol Paneli");
        frame.add(new form().panel1);
        frame.setSize(1280, 1024);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}