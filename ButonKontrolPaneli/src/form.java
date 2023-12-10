// Gerekli kütüphaneler import edilir.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class form {

    // UI designer üzerinde oluşturulan nesneler
    private JButton button1;
    protected JPanel panel1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;

    // Butonları dinamik olarak güncelleyebilmek için ArrayList ve HashMap kullanılır.
    private ArrayList<JButton> buttons = new ArrayList<>();
    private Map<JButton, String> buttonGraphQLMap = new HashMap<>();
    // Butonların aktif ve pasif özellikleri tanımlanır.
    private final ImageIcon activeIcon = new ImageIcon(form.class.getResource("check.png"));
    private final ImageIcon passiveIcon = new ImageIcon(form.class.getResource("unchecked.png"));
    private final Color activeColor = new Color(54, 214, 107);
    private final Color passiveColor = new Color(122, 196, 255, 255);


    public form() {

        // Butonlar ArrayList'e eklenir.
        buttons.add(button1);
        buttons.add(button2);
        buttons.add(button3);
        buttons.add(button4);
        buttons.add(button5);
        buttons.add(button6);
        buttons.add(button7);
        buttons.add(button8);
        buttons.add(button9);
        buttons.add(button10);
        buttons.add(button11);
        buttons.add(button12);
        buttons.add(button13);
        buttons.add(button14);
        buttons.add(button15);
        buttons.add(button16);

        // Butonların nesneleri HashMap'e anahtar olarak GraphQL adresleri ise değer olarak atanır.
        buttonGraphQLMap.put(button1, "GraphQL_adress_1");
        buttonGraphQLMap.put(button2, "GraphQL_adress_2");
        buttonGraphQLMap.put(button3, "GraphQL_adress_3");
        buttonGraphQLMap.put(button4, "GraphQL_adress_4");
        buttonGraphQLMap.put(button5, "GraphQL_adress_5");
        buttonGraphQLMap.put(button6, "GraphQL_adress_6");
        buttonGraphQLMap.put(button7, "GraphQL_adress_7");
        buttonGraphQLMap.put(button8, "GraphQL_adress_8");
        buttonGraphQLMap.put(button9, "GraphQL_adress_9");
        buttonGraphQLMap.put(button10, "GraphQL_adress_10");
        buttonGraphQLMap.put(button11, "GraphQL_adress_11");
        buttonGraphQLMap.put(button12, "GraphQL_adress_12");
        buttonGraphQLMap.put(button13, "GraphQL_adress_13");
        buttonGraphQLMap.put(button14, "GraphQL_adress_14");
        buttonGraphQLMap.put(button15, "GraphQL_adress_15");
        buttonGraphQLMap.put(button16, "GraphQL_adress_16");

        // Butonların hepsine tıklama özelliği ve pasif özellikler atanır.
        for (JButton button : buttons) {
            button.addActionListener(new ButtonClickListener());
            button.setIcon(passiveIcon);
            button.setBackground(passiveColor);
        }
    }

    // Tıklandığı anda çalışacak metodlar bu sınıfta tanımlanır.
    private class ButtonClickListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // Tıklanan butonun nesnesinin referansı yeni bir nesne ile eşitlenir.
            JButton clickedButton = (JButton) e.getSource();

            // Buton sorgusu yapılarak butonlar pasif ve aktif olarak güncellenir.
            if (!clickedButton.isSelected()) {
                clickedButton.setBackground(activeColor);
                clickedButton.setIcon(activeIcon);

                // GraphQL mutation çağrısı yapılır ve aktif olan butonların adresi metoda gönderilir.
                String graphQLAddress = buttonGraphQLMap.get(clickedButton);
                String yazilacakBilgi = clickedButton.getText() + " aktif edildi.";
                runGraphQLMutation(graphQLAddress, yazilacakBilgi);

                clickedButton.setSelected(true);
            } else {
                clickedButton.setSelected(false);

                for (JButton button : buttons) {
                    if (button.isSelected()) {
                        button.setBackground(passiveColor);
                        button.setIcon(passiveIcon);

                        // GraphQL mutation çağrısı yapılır ve pasif olan butonların adresi metoda gönderilir.
                        String graphQlAddress = buttonGraphQLMap.get(button);
                        String yazilacakBilgi = button.getText() + " pasif edildi.";
                        runGraphQLMutation(graphQlAddress, yazilacakBilgi);
                    }
                    button.setSelected(false);
                }
                clickedButton.setSelected(true);
            }
        }
    }

    // Hayali GraphQL şemasının mutation metodu.
    private void runGraphQLMutation(String graphQLAddress, String yazilacakBilgi) {
        System.out.println("GraphQL Adresi: " + graphQLAddress + ", Yazılacak Bilgi: " + yazilacakBilgi);
    }
}
