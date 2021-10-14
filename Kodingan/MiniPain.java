import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MiniPain extends MouseMotionAdapter {
    Frame f;

    MiniPain() { //constructor
        // creating the frame with the title
        f = new Frame("Mouse Motion Adapter");

        // adding Mouse Motion Listening to the Frame
        f.addMouseMotionListener(this);

        //setting the size, layput and visibility of the frame
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void mouseDragged(MouseEvent e){
        // creating the Graphic object and fetching then frame object using using getGraphic
        Graphics g = f.getGraphics();

        //setting the color of graphic object
        g.setColor(Color.CYAN);

        //setting the shape of graphics object
        g.fillOval (e.getX(), e.getY(), 20, 20);
    }

    public static void main(String[] args) {
        new MiniPain();
    }
}
