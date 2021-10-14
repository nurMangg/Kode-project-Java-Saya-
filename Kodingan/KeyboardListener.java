import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListener extends Frame implements KeyListener {
    Label l;
    TextArea area;

    KeyboardListener() {
        l = new Label();

        l.setBounds(20, 50, 200, 20);

        area = new TextArea();

        area.setBounds(20, 80, 300, 300);

        area.addKeyListener(this);

        add(l);
        add(area);

        setTitle("KeyBoardListener");
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }
        public void keyTyped (KeyEvent e) {
        }

        public void keyPressed(KeyEvent e) {

        }
         public void keyReleased(KeyEvent e) {
             String text = area.getText();
             String[] words = text.split("\\s");
             l.setText("Words: " + words.length + " Characters:" + text.length());
         }

    public static void main(String[] args) {
        new KeyboardListener();
    }


}
