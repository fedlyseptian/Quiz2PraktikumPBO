package View;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu implements ActionListener {
    //Deklarasi
    JFrame frame = new JFrame("MyITHB");
    JPanel panelTop = new JPanel();
    JPanel panelLeft = new JPanel();
    JPanel panelRight = new JPanel();
    JPanel panelBottom = new JPanel();
    JPanel panelCenter = new JPanel(new GridLayout(4, 1));

    //Title
    JLabel labelTitle = new JLabel("MyITHB");

    //Button
    JButton insertDataJurusanBaruButton = new JButton("Insert Data Jurusan Baru");
    JButton lihatDataSemuaJurusanButton = new JButton("Lihat Data Semua Jurusan");
    JButton insertDataMahasiswaBaruButton = new JButton("Insert Data Mahasiswa Baru");
    JButton lihatDataMahasiswaPerJurusanButton = new JButton("Lihat Data Mahasiswa Per Jurusan");

    public MainMenu(){
        frame.setSize(900,600);
        frame.setLayout(new BorderLayout());

        // Set Panel Size
        panelTop.setPreferredSize(new Dimension(900,80));
        panelLeft.setPreferredSize(new Dimension(50, 470));
        panelCenter.setPreferredSize(new Dimension(800, 470));
        panelRight.setPreferredSize(new Dimension(50, 470));
        panelBottom.setPreferredSize(new Dimension(900, 50));

        //Title
        labelTitle.setFont(new Font("Arial", Font.BOLD, 60));
        labelTitle.setForeground(new Color(0,0,255));
        labelTitle.setHorizontalAlignment(JLabel.CENTER);
        panelTop.add(labelTitle);

        panelCenter.setBorder(new EmptyBorder(80, 0, 0, 0));

        //Insert Data Jurusan Baru Button
        insertDataJurusanBaruButton.setFont(new Font("Arial", Font.BOLD, 20));
        insertDataJurusanBaruButton.setActionCommand("insert data jurusan baru");
        insertDataJurusanBaruButton.addActionListener(this);

        //Lihat Data Semua Jurusan Button
        lihatDataSemuaJurusanButton.setFont(new Font("Arial", Font.BOLD, 20));
        lihatDataSemuaJurusanButton.setActionCommand("lihat data semua jurusan");
        lihatDataSemuaJurusanButton.addActionListener(this);

        //Insert Data Mahasiswa Baru Button
        insertDataMahasiswaBaruButton.setFont(new Font("Arial", Font.BOLD, 20));
        insertDataMahasiswaBaruButton.setActionCommand("insert data mahasiswa baru");
        insertDataMahasiswaBaruButton.addActionListener(this);

        //Lihat Data Mahasiswa Per Jurusan Button
        lihatDataMahasiswaPerJurusanButton.setFont(new Font("Arial", Font.BOLD, 20));
        lihatDataMahasiswaPerJurusanButton.setActionCommand("lihat data mahasiswa per jurusan");
        lihatDataMahasiswaPerJurusanButton.addActionListener(this);

        panelCenter.add(insertDataJurusanBaruButton);
        panelCenter.add(lihatDataSemuaJurusanButton);
        panelCenter.add(insertDataMahasiswaBaruButton);
        panelCenter.add(lihatDataMahasiswaPerJurusanButton);

        frame.add(panelTop,BorderLayout.NORTH);
        frame.add(panelLeft,BorderLayout.WEST);
        frame.add(panelCenter,BorderLayout.CENTER);
        frame.add(panelRight,BorderLayout.EAST);
        frame.add(panelBottom,BorderLayout.SOUTH);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MainMenu();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "insert data jurusan baru":
                new InsertDataJurusanBaru();
                frame.dispose();
                break;
            case "lihat data semua jurusan":
                frame.dispose();
                break;
            case "insert data mahasiswa baru":
                frame.dispose();
                break;
            case "lihat data mahasiswa per jurusan":
                frame.dispose();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + command);
        }
    }
}
