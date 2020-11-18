package View;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.*;

public class InsertDataJurusanBaru implements ActionListener {
    //Deklarasi
    JFrame frame = new JFrame("MyITHB");
    JPanel panelTop = new JPanel();
    JPanel panelLeft = new JPanel(new GridLayout(9,1,0,10));
    JPanel panelRight = new JPanel();
    JPanel panelBottom = new JPanel();
    JPanel panelCenter = new JPanel(new GridLayout(9,1,0,10));

    //Title
    JLabel labelTitle = new JLabel("Insert Data Jurusan Baru");

    //Deklarasi Data-Data Form
    JLabel labelKodeJurusan;
    JTextField kodeJurusan;

    JLabel labelNamaJurusan;
    JTextField namaJurusan;

    //Button Back To Main Menu
    JButton backToMainMenuButton = new JButton("Back To Main Menu");

    //Button Insert Data
    JButton insertDataJurusanBaruButton = new JButton("Insert Data");

    public InsertDataJurusanBaru(){
        frame.setSize(700,500);
        frame.setLayout(new BorderLayout());

        // Set Panel Size
        panelTop.setPreferredSize(new Dimension(700,80));
        panelLeft.setPreferredSize(new Dimension(150, 370));
        panelCenter.setPreferredSize(new Dimension(500, 370));
        panelRight.setPreferredSize(new Dimension(50, 370));
        panelBottom.setPreferredSize(new Dimension(700, 50));

        //Title
        labelTitle.setFont(new Font("Arial", Font.BOLD, 30));
        labelTitle.setForeground(new Color(0,0,0));
        labelTitle.setHorizontalAlignment(JLabel.CENTER);
        panelTop.add(labelTitle);

        panelCenter.setBorder(new EmptyBorder(50, 20, 0, 0));
        panelLeft.setBorder(new EmptyBorder(50, 0, 0, 0));

        //Form Insert Data
        //Kode Jurusan
        labelKodeJurusan = new JLabel("Kode Jurusan");
        labelKodeJurusan.setFont(new Font("Arial", Font.BOLD, 15));
        labelKodeJurusan.setHorizontalAlignment(JLabel.RIGHT);
        panelLeft.add(labelKodeJurusan);
        kodeJurusan = new JTextField("");
        panelCenter.add(kodeJurusan);

        //Nama Jurusan
        labelNamaJurusan = new JLabel("Nama Jurusan");
        labelNamaJurusan.setFont(new Font("Arial", Font.BOLD, 15));
        labelNamaJurusan.setHorizontalAlignment(JLabel.RIGHT);
        panelLeft.add(labelNamaJurusan);
        namaJurusan = new JTextField("");
        panelCenter.add(namaJurusan);

        //Insert Data Jurusan Baru
        insertDataJurusanBaruButton.setFont(new Font("Arial", Font.BOLD, 20));
        insertDataJurusanBaruButton.setActionCommand("insert data jurusan baru");
        insertDataJurusanBaruButton.addActionListener(this);
        panelBottom.add(insertDataJurusanBaruButton);

        //Back To Main Menu Button
        backToMainMenuButton.setFont(new Font("Arial", Font.BOLD, 20));
        backToMainMenuButton.setActionCommand("back to main menu");
        backToMainMenuButton.addActionListener(this);
        panelBottom.add(backToMainMenuButton);

        frame.add(panelTop,BorderLayout.NORTH);
        frame.add(panelLeft,BorderLayout.WEST);
        frame.add(panelCenter,BorderLayout.CENTER);
        frame.add(panelRight,BorderLayout.EAST);
        frame.add(panelBottom,BorderLayout.SOUTH);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "insert data jurusan baru":
                Jurusan jurusan = new Jurusan(kodeJurusan.getText(), namaJurusan.getText());
                Controller.Controller.insertJurusanbaru(jurusan);
                frame.dispose();
                break;
            case "back to main menu":
                new MainMenu();
                frame.dispose();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + command);
        }
    }

}
