package View;

import Controller.Controller;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LihatDataSemuaJurusan {
    //Deklarasi
    JFrame frame = new JFrame("MyITHB");

    public LihatDataSemuaJurusan(){
        frame.setSize(900,600);
        String[][] arrJurusan = Controller.getAllJurusan().toArray();

    }

}
