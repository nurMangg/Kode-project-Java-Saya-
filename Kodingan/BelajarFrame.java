import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class BelajarFrame {
    public static void main(String[] args) {
        // Membuat objek JFrame
        JFrame f = new JFrame();

        // Menentukan title bar di Frame
        f.setTitle("Belajar JFrame");

        // Menentukan ukuran Fram
        f.setSize(400, 200);

        // Membuat letak Frame berada di tengah ketika Program di jalankan
        f.setLocationRelativeTo(null);

        // mengaktifkan Event Agar ketika Frame di close maka, Program akan berhenti
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Aktifkan Visible Frame
        f.setVisible(true);

        // membuat Object JLabel
        JLabel l = new JLabel("Masukkan NIM");

        // menentukan layout Frame
        f.setLayout(null);

        // Memasukkan Label ke dalam Frame
        f.add(l);

        // menentukan posisi label di dalam Frame menetukan weight dan height
        l.setBounds(20,20,150, 30);

        // Membuat Object TextField
        JTextField t = new JTextField();

        // Memasukkan TextField ke dalam Frame
        f.add(t);

        // Menentukan posisi textField di dalam Frame
        t.setBounds(150, 20, 230, 30);

        // Membuat Object Button
        JButton b = new JButton("Start");

        // Memasukkan Button Ke dalam Frame
        f.add(b);

        // menentukan posisi Frame Button di dalam Frame
        b.setBounds(120, 60,89,20);
    }
}
