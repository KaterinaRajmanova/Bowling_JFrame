package cz.czechitas.bowling_JFrame;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import java.util.*;
import java.util.List;
import javax.imageio.*;
import javax.swing.*;
import javax.swing.border.*;
import net.miginfocom.swing.*;
import net.sevecek.util.*;

public class HlavniOkno extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    JLabel LabHrac1;
    JLabel LabHod1;
    JLabel LabHrac1_hod1_1;
    JLabel LabHrac1_hod2_1;
    JLabel LabHrac1_hod3_1;
    JLabel LagHrac1_hod4_1;
    JLabel LagHrac1_hod5_1;
    JLabel LagHrac1_hod6_1;
    JLabel LagHrac1_hod7_1;
    JLabel LagHrac1_hod8_1;
    JLabel LagHrac1_hod9_1;
    JLabel LagHrac1_hod10_1;
    JLabel LabHod2;
    JLabel LabHrac1_hod1_2;
    JLabel LabHrac1_hod2_2;
    JLabel LabHrac1_hod3_2;
    JLabel LagHrac1_hod4_2;
    JLabel LagHrac1_hod5_2;                           
    JLabel LagHrac1_hod6_2;
    JLabel LagHrac1_hod7_2;
    JLabel LagHrac1_hod8_2;
    JLabel LagHrac1_hod9_2;
    JLabel LagHrac1_hod10_2;
    JLabel LabSkore;
    JLabel LabHrac1_Skore_H1;
    JLabel LabHrac1_Skore_H2;
    JLabel LabHrac1_Skore_H3;
    JLabel LabHrac1_Skore_H4;
    JLabel LabHrac1_Skore_H5;
    JLabel LabHrac1_Skore_H6;
    JLabel LabHrac1_Skore_H7;
    JLabel LabHrac1_Skore_H8;
    JLabel LabHrac1_Skore_H9;
    JLabel LabHrac1_Skore_H10;
    JLabel LabHrac2;
    JLabel LabHod1Hrac2;
    JLabel LabHrac2_hod1_1;
    JLabel LabHrac2_hod2_1;
    JLabel LabHrac2_hod3_1;
    JLabel LabHrac2_hod4_1;
    JLabel LabHrac2_hod5_1;
    JLabel LabHrac2_hod6_1;
    JLabel LabHrac2_hod7_1;
    JLabel LabHrac2_hod8_1;
    JLabel LabHrac2_hod9_1;
    JLabel LabHrac2_hod10_1;
    JLabel LabHod2Hrac2;
    JLabel LabHrac2_hod1_2;
    JLabel LabHrac2_hod22;
    JLabel LabHrac2_hod3_2;
    JLabel LabHrac2_hod4_2;
    JLabel LabHrac2_hod5_2;
    JLabel LabHrac2_hod6_2;
    JLabel LabHrac2_hod7_2;
    JLabel LabHrac2_hod8_2;
    JLabel LabHrac2_hod9_2;
    JLabel LabHrac2_hod10_2;
    JLabel LabSkore2;
    JLabel LabHrac2_Skore_H1;
    JLabel LabHrac2_Skore_H2;
    JLabel LabHrac2_Skore_H3;
    JLabel LabHrac2_Skore_H4;
    JLabel LabHrac2_Skore_H5;
    JLabel LabHrac2_Skore_H6;
    JLabel LabHrac2_Skore_H7;
    JLabel LabHrac2_Skore_H8;
    JLabel LabHrac2_Skore_H9;
    JLabel LabHrac2_Skore_H10;
    JLabel labObrazek;
    JButton BtnPostavKuzelky;
    JLabel LabKuzelka10;
    JButton button1;
    JLabel LabKuzelka4;
    JLabel LabKuzelka2;
    JLabel LabKuzelka9;
    JLabel LabKuzelka1;
    JLabel LabKuzelka5;
    JLabel LabKuzelka3;
    JLabel LabKuzelka8;
    JLabel LabKuzelka6;
    JLabel LabKuzelka7;
    JLabel LabPrubezneSkore;
    JLabel LabPrubezneSkoreHrac1;
    JLabel LabDvojtecka;
    JLabel LabPrubezneSkoreHrac2;
    JLabel LabKdoHraje;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    JPanel contentPane;
    MigLayout migLayoutManager;
    Hrac hrac1 = new Hrac();
    Hrac hrac2 = new Hrac();
    int celkoveSkoreHrac1 = 0;
    int celkoveSkoreHrac2 = 0;
    BufferedImage obrazek;
    ArrayList<JLabel> kuzelkyList = new ArrayList<JLabel>();

    public HlavniOkno() {
        initComponents();
        nahrajVychoziObrazek();
        nahrajObrazekKuzelek();


        kuzelkyList.add(LabKuzelka1);
        kuzelkyList.add(LabKuzelka2);
        kuzelkyList.add(LabKuzelka3);
        kuzelkyList.add(LabKuzelka4);
        kuzelkyList.add(LabKuzelka5);
        kuzelkyList.add(LabKuzelka6);
        kuzelkyList.add(LabKuzelka7);
        kuzelkyList.add(LabKuzelka8);
        kuzelkyList.add(LabKuzelka9);
        kuzelkyList.add(LabKuzelka10);

        // pozadí bowlingu, upravit podmínku při shození 10 kuželek, zmenšit kouli

    }

    private void zhodKuzelkyHrac1Pokus1(){
        try {
            InputStream zdrojObrazku = getClass().getResourceAsStream("/cz/czechitas/bowling_JFrame/zhozenaKuzelka.jpg");
            obrazek = ImageIO.read(zdrojObrazku);

            for (int i = 0; i <hrac1.getHod1(); i++) {
                kuzelkyList.get(i).setIcon(new ImageIcon(obrazek));
                kuzelkyList.get(i).setMinimumSize(new Dimension(obrazek.getWidth(), obrazek.getHeight()));
            }

        } catch (IOException ex) {
            throw new ApplicationPublicException(ex, "Nepodařilo se nahrát zabudovaný obrázek mandaly:\n\n" + ex.getMessage());
        }


    }

    private void zhodKuzelkyHrac1Pokus2(){
        try {
            InputStream zdrojObrazku = getClass().getResourceAsStream("/cz/czechitas/bowling_JFrame/zhozenaKuzelka.jpg");
            obrazek = ImageIO.read(zdrojObrazku);

            for (int i = 0; i <hrac1.getHod2(); i++) {
                kuzelkyList.get(hrac1.getHod1()+i).setIcon(new ImageIcon(obrazek));
                kuzelkyList.get(hrac1.getHod1()+i).setMinimumSize(new Dimension(obrazek.getWidth(), obrazek.getHeight()));
            }

        } catch (IOException ex) {
            throw new ApplicationPublicException(ex, "Nepodařilo se nahrát zabudovaný obrázek mandaly:\n\n" + ex.getMessage());
        }


    }

    private void zhodKuzelkyHrac2Pokus1(){
        try {
            InputStream zdrojObrazku = getClass().getResourceAsStream("/cz/czechitas/bowling_JFrame/zhozenaKuzelka.jpg");
            obrazek = ImageIO.read(zdrojObrazku);

            for (int i = 0; i <hrac2.getHod1(); i++) {
                kuzelkyList.get(i).setIcon(new ImageIcon(obrazek));
                kuzelkyList.get(i).setMinimumSize(new Dimension(obrazek.getWidth(), obrazek.getHeight()));
            }

        } catch (IOException ex) {
            throw new ApplicationPublicException(ex, "Nepodařilo se nahrát zabudovaný obrázek mandaly:\n\n" + ex.getMessage());
        }


    }

    private void zhodKuzelkyHrac2Pokus2(){
        try {
            InputStream zdrojObrazku = getClass().getResourceAsStream("/cz/czechitas/bowling_JFrame/zhozenaKuzelka.jpg");
            obrazek = ImageIO.read(zdrojObrazku);

            for (int i = 0; i <hrac2.getHod2(); i++) {
                kuzelkyList.get(hrac2.getHod1()+i).setIcon(new ImageIcon(obrazek));
                kuzelkyList.get(hrac2.getHod1()+i).setMinimumSize(new Dimension(obrazek.getWidth(), obrazek.getHeight()));
            }

        } catch (IOException ex) {
            throw new ApplicationPublicException(ex, "Nepodařilo se nahrát zabudovaný obrázek mandaly:\n\n" + ex.getMessage());
        }


    }

    private void nahrajVychoziObrazek() {
        try {
            InputStream zdrojObrazku = getClass().getResourceAsStream("/cz/czechitas/bowling_JFrame/bowlingKoule.jpg");
            obrazek = ImageIO.read(zdrojObrazku);
            button1.setIcon(new ImageIcon(obrazek));
            button1.setMinimumSize(new Dimension(obrazek.getWidth(), obrazek.getHeight()));
        } catch (IOException ex) {
            throw new ApplicationPublicException(ex, "Nepodařilo se nahrát zabudovaný obrázek mandaly:\n\n" + ex.getMessage());
        }
    }

    private void nahrajObrazekKuzelek() {
        try {
            InputStream zdrojObrazku = getClass().getResourceAsStream("/cz/czechitas/bowling_JFrame/kuzelka.jpg");
            obrazek = ImageIO.read(zdrojObrazku);
            LabKuzelka1.setIcon(new ImageIcon(obrazek));
            LabKuzelka1.setMinimumSize(new Dimension(obrazek.getWidth(), obrazek.getHeight()));

            LabKuzelka2.setIcon(new ImageIcon(obrazek));
            LabKuzelka2.setMinimumSize(new Dimension(obrazek.getWidth(), obrazek.getHeight()));

            LabKuzelka3.setIcon(new ImageIcon(obrazek));
            LabKuzelka3.setMinimumSize(new Dimension(obrazek.getWidth(), obrazek.getHeight()));

            LabKuzelka4.setIcon(new ImageIcon(obrazek));
            LabKuzelka4.setMinimumSize(new Dimension(obrazek.getWidth(), obrazek.getHeight()));

            LabKuzelka5.setIcon(new ImageIcon(obrazek));
            LabKuzelka5.setMinimumSize(new Dimension(obrazek.getWidth(), obrazek.getHeight()));

            LabKuzelka6.setIcon(new ImageIcon(obrazek));
            LabKuzelka6.setMinimumSize(new Dimension(obrazek.getWidth(), obrazek.getHeight()));

            LabKuzelka7.setIcon(new ImageIcon(obrazek));
            LabKuzelka7.setMinimumSize(new Dimension(obrazek.getWidth(), obrazek.getHeight()));

            LabKuzelka8.setIcon(new ImageIcon(obrazek));
            LabKuzelka8.setMinimumSize(new Dimension(obrazek.getWidth(), obrazek.getHeight()));

            LabKuzelka9.setIcon(new ImageIcon(obrazek));
            LabKuzelka9.setMinimumSize(new Dimension(obrazek.getWidth(), obrazek.getHeight()));

            LabKuzelka10.setIcon(new ImageIcon(obrazek));
            LabKuzelka10.setMinimumSize(new Dimension(obrazek.getWidth(), obrazek.getHeight()));

            
        } catch (IOException ex) {
            throw new ApplicationPublicException(ex, "Nepodařilo se nahrát zabudovaný obrázek mandaly:\n\n" + ex.getMessage());
        }
    }
    
    private void btnHazejPriStisku(ActionEvent e) {
        JButton btnHazej = (JButton)e.getSource();

        //hod 1
        if (LabHrac1_hod1_1.getText().isEmpty()){
            hrac1.haziPrvniHod();

            zhodKuzelkyHrac1Pokus1();
            
            LabHrac1_hod1_1.setText(Integer.toString(hrac1.getHod1()));
            LabKdoHraje.setText("Házej znovu");

        }else if (LabHrac1_hod1_2.getText().isEmpty()){
            hrac1.haziDruhyHod();
            zhodKuzelkyHrac1Pokus2();
            LabHrac1_hod1_2.setText(Integer.toString(hrac1.getHod2()));
            hrac1.vypoctiSkorePoHodech();
            LabHrac1_Skore_H1.setText(Integer.toString(hrac1.getSkore()));
            celkoveSkoreHrac1 = celkoveSkoreHrac1 + hrac1.getSkore();
            LabPrubezneSkoreHrac1.setText(Integer.toString(celkoveSkoreHrac1));
            LabKdoHraje.setText("Hází druhý hráč");

        }else if (LabHrac2_hod1_1.getText().isEmpty()){
            hrac2.haziPrvniHod();
            zhodKuzelkyHrac2Pokus1();
            LabHrac2_hod1_1.setText(Integer.toString(hrac2.getHod1()));
            LabKdoHraje.setText("Házej znovu");

        }else if (LabHrac2_hod1_2.getText().isEmpty()){
            hrac2.haziDruhyHod();
            zhodKuzelkyHrac2Pokus2();
            LabHrac2_hod1_2.setText(Integer.toString(hrac2.getHod2()));
            hrac2.vypoctiSkorePoHodech();
            celkoveSkoreHrac2 = celkoveSkoreHrac2 + hrac2.getSkore();
            LabPrubezneSkoreHrac2.setText(Integer.toString(celkoveSkoreHrac2));
            LabHrac2_Skore_H1.setText(Integer.toString(hrac2.getSkore()));
            LabKdoHraje.setText("Hází první hráč");
        }
        //hod2
        else if (LabHrac1_hod2_1.getText().isEmpty()){
            hrac1.haziPrvniHod();
            zhodKuzelkyHrac1Pokus1();

            LabHrac1_hod2_1.setText(Integer.toString(hrac1.getHod1()));
            LabKdoHraje.setText("Házej znovu");

        }else if (LabHrac1_hod2_2.getText().isEmpty()){
            hrac1.haziDruhyHod();
            zhodKuzelkyHrac1Pokus2();
            LabHrac1_hod2_2.setText(Integer.toString(hrac1.getHod2()));
            hrac1.vypoctiSkorePoHodech();
            LabHrac1_Skore_H2.setText(Integer.toString(hrac1.getSkore()));
            celkoveSkoreHrac1 = celkoveSkoreHrac1 + hrac1.getSkore();
            LabPrubezneSkoreHrac1.setText(Integer.toString(celkoveSkoreHrac1));
            LabKdoHraje.setText("Hází druhý hráč");

        }else if (LabHrac2_hod2_1.getText().isEmpty()){
            hrac2.haziPrvniHod();
            zhodKuzelkyHrac2Pokus1();
            LabHrac2_hod2_1.setText(Integer.toString(hrac2.getHod1()));
            LabKdoHraje.setText("Házej znovu");

        }else if (LabHrac2_hod22.getText().isEmpty()){
            hrac2.haziDruhyHod();
            zhodKuzelkyHrac2Pokus2();
            LabHrac2_hod22.setText(Integer.toString(hrac2.getHod2()));
            hrac2.vypoctiSkorePoHodech();
            celkoveSkoreHrac2 = celkoveSkoreHrac2 + hrac2.getSkore();
            LabPrubezneSkoreHrac2.setText(Integer.toString(celkoveSkoreHrac2));
            LabHrac2_Skore_H2.setText(Integer.toString(hrac2.getSkore()));
            LabKdoHraje.setText("Hází první hráč");
        }
        //hod3
        else if (LabHrac1_hod3_1.getText().isEmpty()){
            hrac1.haziPrvniHod();
            zhodKuzelkyHrac1Pokus1();
            LabHrac1_hod3_1.setText(Integer.toString(hrac1.getHod1()));
            LabKdoHraje.setText("Házej znovu");

        }else if (LabHrac1_hod3_2.getText().isEmpty()){
            hrac1.haziDruhyHod();
            zhodKuzelkyHrac1Pokus2();
            LabHrac1_hod3_2.setText(Integer.toString(hrac1.getHod2()));
            hrac1.vypoctiSkorePoHodech();
            celkoveSkoreHrac1 = celkoveSkoreHrac1 + hrac1.getSkore();
            LabHrac1_Skore_H3.setText(Integer.toString(hrac1.getSkore()));
            LabPrubezneSkoreHrac1.setText(Integer.toString(celkoveSkoreHrac1));
            LabKdoHraje.setText("Hází druhý hráč");

        }else if (LabHrac2_hod3_1.getText().isEmpty()){
            hrac2.haziPrvniHod();
            zhodKuzelkyHrac2Pokus1();
            LabHrac2_hod3_1.setText(Integer.toString(hrac2.getHod1()));
            LabKdoHraje.setText("Házej znovu");

        }else if (LabHrac2_hod3_2.getText().isEmpty()){
            hrac2.haziDruhyHod();
            zhodKuzelkyHrac2Pokus2();
            LabHrac2_hod3_2.setText(Integer.toString(hrac2.getHod2()));
            hrac2.vypoctiSkorePoHodech();
            celkoveSkoreHrac2 = celkoveSkoreHrac2 + hrac2.getSkore();
            LabPrubezneSkoreHrac2.setText(Integer.toString(celkoveSkoreHrac2));
            LabHrac2_Skore_H3.setText(Integer.toString(hrac2.getSkore()));
            LabKdoHraje.setText("Hází první hráč");
        }
        //hod4
        else if (LagHrac1_hod4_1.getText().isEmpty()){
            hrac1.haziPrvniHod();
            zhodKuzelkyHrac1Pokus1();
            LagHrac1_hod4_1.setText(Integer.toString(hrac1.getHod1()));
            LabKdoHraje.setText("Házej znovu");

        }else if (LagHrac1_hod4_2.getText().isEmpty()){
            hrac1.haziDruhyHod();
            zhodKuzelkyHrac1Pokus2();
            LagHrac1_hod4_2.setText(Integer.toString(hrac1.getHod2()));
            hrac1.vypoctiSkorePoHodech();
            celkoveSkoreHrac1 = celkoveSkoreHrac1 + hrac1.getSkore();
            LabPrubezneSkoreHrac1.setText(Integer.toString(celkoveSkoreHrac1));
            LabHrac1_Skore_H4.setText(Integer.toString(hrac1.getSkore()));
            LabKdoHraje.setText("Hází druhý hráč");

        }else if (LabHrac2_hod4_1.getText().isEmpty()){
            hrac2.haziPrvniHod();
            zhodKuzelkyHrac2Pokus1();
            LabHrac2_hod4_1.setText(Integer.toString(hrac2.getHod1()));
            LabKdoHraje.setText("Házej znovu");

        }else if (LabHrac2_hod4_2.getText().isEmpty()){
            hrac2.haziDruhyHod();
            zhodKuzelkyHrac2Pokus2();
            LabHrac2_hod4_2.setText(Integer.toString(hrac2.getHod2()));
            hrac2.vypoctiSkorePoHodech();
            celkoveSkoreHrac2 = celkoveSkoreHrac2 + hrac2.getSkore();
            LabPrubezneSkoreHrac2.setText(Integer.toString(celkoveSkoreHrac2));
            LabHrac2_Skore_H4.setText(Integer.toString(hrac2.getSkore()));
            LabKdoHraje.setText("Hází první hráč");
        }
        //hod5
        else if (LagHrac1_hod5_1.getText().isEmpty()){
            hrac1.haziPrvniHod();
            zhodKuzelkyHrac1Pokus1();
            LagHrac1_hod5_1.setText(Integer.toString(hrac1.getHod1()));
            LabKdoHraje.setText("Házej znovu");

        }else if (LagHrac1_hod5_2.getText().isEmpty()){
            hrac1.haziDruhyHod();
            zhodKuzelkyHrac1Pokus2();
            LagHrac1_hod5_2.setText(Integer.toString(hrac1.getHod2()));
            hrac1.vypoctiSkorePoHodech();
            celkoveSkoreHrac1 = celkoveSkoreHrac1 + hrac1.getSkore();
            LabPrubezneSkoreHrac1.setText(Integer.toString(celkoveSkoreHrac1));
            LabHrac1_Skore_H5.setText(Integer.toString(hrac1.getSkore()));
            LabKdoHraje.setText("Hází druhý hráč");

        }else if (LabHrac2_hod5_1.getText().isEmpty()){
            hrac2.haziPrvniHod();
            zhodKuzelkyHrac2Pokus1();
            LabHrac2_hod5_1.setText(Integer.toString(hrac2.getHod1()));
            LabKdoHraje.setText("Házej znovu");

        }else if (LabHrac2_hod5_2.getText().isEmpty()){
            hrac2.haziDruhyHod();
            zhodKuzelkyHrac2Pokus2();
            LabHrac2_hod5_2.setText(Integer.toString(hrac2.getHod2()));
            hrac2.vypoctiSkorePoHodech();
            celkoveSkoreHrac2 = celkoveSkoreHrac2 + hrac2.getSkore();
            LabPrubezneSkoreHrac2.setText(Integer.toString(celkoveSkoreHrac2));
            LabHrac2_Skore_H5.setText(Integer.toString(hrac2.getSkore()));
            LabKdoHraje.setText("Hází první hráč");
        }
        //hod6
        else if (LagHrac1_hod6_1.getText().isEmpty()){
            hrac1.haziPrvniHod();
            zhodKuzelkyHrac1Pokus1();
            LagHrac1_hod6_1.setText(Integer.toString(hrac1.getHod1()));
            LabKdoHraje.setText("Házej znovu");

        }else if (LagHrac1_hod6_2.getText().isEmpty()){
            hrac1.haziDruhyHod();
            zhodKuzelkyHrac1Pokus2();
            LagHrac1_hod6_2.setText(Integer.toString(hrac1.getHod2()));
            hrac1.vypoctiSkorePoHodech();
            celkoveSkoreHrac1 = celkoveSkoreHrac1 + hrac1.getSkore();
            LabPrubezneSkoreHrac1.setText(Integer.toString(celkoveSkoreHrac1));
            LabHrac1_Skore_H6.setText(Integer.toString(hrac1.getSkore()));
            LabKdoHraje.setText("Hází druhý hráč");

        }else if (LabHrac2_hod6_1.getText().isEmpty()){
            hrac2.haziPrvniHod();
            zhodKuzelkyHrac2Pokus1();
            LabHrac2_hod6_1.setText(Integer.toString(hrac2.getHod1()));
            LabKdoHraje.setText("Házej znovu");

        }else if (LabHrac2_hod6_2.getText().isEmpty()){
            hrac2.haziDruhyHod();
            zhodKuzelkyHrac2Pokus2();
            LabHrac2_hod6_2.setText(Integer.toString(hrac2.getHod2()));
            hrac2.vypoctiSkorePoHodech();
            celkoveSkoreHrac2 = celkoveSkoreHrac2 + hrac2.getSkore();
            LabPrubezneSkoreHrac2.setText(Integer.toString(celkoveSkoreHrac2));
            LabHrac2_Skore_H6.setText(Integer.toString(hrac2.getSkore()));
            LabKdoHraje.setText("Hází první hráč");
        }
        //hod7
        else if (LagHrac1_hod7_1.getText().isEmpty()){
            hrac1.haziPrvniHod();
            zhodKuzelkyHrac1Pokus1();
            LagHrac1_hod7_1.setText(Integer.toString(hrac1.getHod1()));
            LabKdoHraje.setText("Házej znovu");

        }else if (LagHrac1_hod7_2.getText().isEmpty()){
            hrac1.haziDruhyHod();
            zhodKuzelkyHrac1Pokus2();
            LagHrac1_hod7_2.setText(Integer.toString(hrac1.getHod2()));
            hrac1.vypoctiSkorePoHodech();
            celkoveSkoreHrac1 = celkoveSkoreHrac1 + hrac1.getSkore();
            LabPrubezneSkoreHrac1.setText(Integer.toString(celkoveSkoreHrac1));
            LabHrac1_Skore_H7.setText(Integer.toString(hrac1.getSkore()));
            LabKdoHraje.setText("Hází druhý hráč");

        }else if (LabHrac2_hod7_1.getText().isEmpty()){
            hrac2.haziPrvniHod();
            zhodKuzelkyHrac2Pokus1();
            LabHrac2_hod7_1.setText(Integer.toString(hrac2.getHod1()));
            LabKdoHraje.setText("Házej znovu");

        }else if (LabHrac2_hod7_2.getText().isEmpty()){
            hrac2.haziDruhyHod();
            zhodKuzelkyHrac2Pokus2();
            LabHrac2_hod7_2.setText(Integer.toString(hrac2.getHod2()));
            hrac2.vypoctiSkorePoHodech();
            celkoveSkoreHrac2 = celkoveSkoreHrac2 + hrac2.getSkore();
            LabPrubezneSkoreHrac2.setText(Integer.toString(celkoveSkoreHrac2));
            LabHrac2_Skore_H7.setText(Integer.toString(hrac2.getSkore()));
            LabKdoHraje.setText("Hází první hráč");
        }
        //hod8
        else if (LagHrac1_hod8_1.getText().isEmpty()){
            hrac1.haziPrvniHod();
            zhodKuzelkyHrac1Pokus1();
            LagHrac1_hod8_1.setText(Integer.toString(hrac1.getHod1()));
            LabKdoHraje.setText("Házej znovu");

        }else if (LagHrac1_hod8_2.getText().isEmpty()){
            hrac1.haziDruhyHod();
            zhodKuzelkyHrac1Pokus2();
            LagHrac1_hod8_2.setText(Integer.toString(hrac1.getHod2()));
            hrac1.vypoctiSkorePoHodech();
            celkoveSkoreHrac1 = celkoveSkoreHrac1 + hrac1.getSkore();
            LabPrubezneSkoreHrac1.setText(Integer.toString(celkoveSkoreHrac1));
            LabHrac1_Skore_H8.setText(Integer.toString(hrac1.getSkore()));
            LabKdoHraje.setText("Hází druhý hráč");

        }else if (LabHrac2_hod8_1.getText().isEmpty()){
            hrac2.haziPrvniHod();
            zhodKuzelkyHrac2Pokus1();
            LabHrac2_hod8_1.setText(Integer.toString(hrac2.getHod1()));
            LabKdoHraje.setText("Házej znovu");

        }else if (LabHrac2_hod8_2.getText().isEmpty()){
            hrac2.haziDruhyHod();
            zhodKuzelkyHrac2Pokus2();
            LabHrac2_hod8_2.setText(Integer.toString(hrac2.getHod2()));
            hrac2.vypoctiSkorePoHodech();
            celkoveSkoreHrac2 = celkoveSkoreHrac2 + hrac2.getSkore();
            LabPrubezneSkoreHrac2.setText(Integer.toString(celkoveSkoreHrac2));
            LabHrac2_Skore_H8.setText(Integer.toString(hrac2.getSkore()));
            LabKdoHraje.setText("Hází první hráč");
        }
        //hod9
        else if (LagHrac1_hod9_1.getText().isEmpty()){
            hrac1.haziPrvniHod();
            zhodKuzelkyHrac1Pokus1();
            LagHrac1_hod9_1.setText(Integer.toString(hrac1.getHod1()));
            LabKdoHraje.setText("Házej znovu");

        }else if (LagHrac1_hod9_2.getText().isEmpty()){
            hrac1.haziDruhyHod();
            zhodKuzelkyHrac1Pokus2();
            LagHrac1_hod9_2.setText(Integer.toString(hrac1.getHod2()));
            hrac1.vypoctiSkorePoHodech();
            celkoveSkoreHrac1 = celkoveSkoreHrac1 + hrac1.getSkore();
            LabPrubezneSkoreHrac1.setText(Integer.toString(celkoveSkoreHrac1));
            LabHrac1_Skore_H9.setText(Integer.toString(hrac1.getSkore()));
            LabKdoHraje.setText("Hází druhý hráč");

        }else if (LabHrac2_hod9_1.getText().isEmpty()){
            hrac2.haziPrvniHod();
            zhodKuzelkyHrac2Pokus1();
            LabHrac2_hod9_1.setText(Integer.toString(hrac2.getHod1()));
            LabKdoHraje.setText("Házej znovu");

        }else if (LabHrac2_hod9_2.getText().isEmpty()){
            hrac2.haziDruhyHod();
            zhodKuzelkyHrac2Pokus2();
            LabHrac2_hod9_2.setText(Integer.toString(hrac2.getHod2()));
            hrac2.vypoctiSkorePoHodech();
            celkoveSkoreHrac2 = celkoveSkoreHrac2 + hrac2.getSkore();
            LabPrubezneSkoreHrac2.setText(Integer.toString(celkoveSkoreHrac2));
            LabHrac2_Skore_H9.setText(Integer.toString(hrac2.getSkore()));
            LabKdoHraje.setText("Hází první hráč");
        }
        //hod10
        else if (LagHrac1_hod10_1.getText().isEmpty()){
            hrac1.haziPrvniHod();
            zhodKuzelkyHrac1Pokus1();
            LagHrac1_hod10_1.setText(Integer.toString(hrac1.getHod1()));
            LabKdoHraje.setText("Házej znovu");

        }else if (LagHrac1_hod10_2.getText().isEmpty()){
            hrac1.haziDruhyHod();
            zhodKuzelkyHrac1Pokus2();
            LagHrac1_hod10_2.setText(Integer.toString(hrac1.getHod2()));
            hrac1.vypoctiSkorePoHodech();
            celkoveSkoreHrac1 = celkoveSkoreHrac1 + hrac1.getSkore();
            LabPrubezneSkoreHrac1.setText(Integer.toString(celkoveSkoreHrac1));
            LabHrac1_Skore_H10.setText(Integer.toString(hrac1.getSkore()));
            LabKdoHraje.setText("Hází druhý hráč");

        }else if (LabHrac2_hod10_1.getText().isEmpty()){
            hrac2.haziPrvniHod();
            zhodKuzelkyHrac2Pokus1();
            LabHrac2_hod10_1.setText(Integer.toString(hrac2.getHod1()));
            LabKdoHraje.setText("Házej znovu");

        }else if (LabHrac2_hod10_2.getText().isEmpty()){
            hrac2.haziDruhyHod();
            zhodKuzelkyHrac2Pokus2();
            LabHrac2_hod10_2.setText(Integer.toString(hrac2.getHod2()));
            hrac2.vypoctiSkorePoHodech();
            LabHrac2_Skore_H10.setText(Integer.toString(hrac2.getSkore()));
            celkoveSkoreHrac2 = celkoveSkoreHrac2 + hrac2.getSkore();
            LabPrubezneSkoreHrac2.setText(Integer.toString(celkoveSkoreHrac2));
            LabPrubezneSkore.setText("Konečné skóre:");

            LabKdoHraje.setText("Konec hry");
        }
        

    }

    private void priStiskuPostavKuzelky(MouseEvent e) {
        nahrajObrazekKuzelek();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        LabHrac1 = new JLabel();
        LabHod1 = new JLabel();
        LabHrac1_hod1_1 = new JLabel();
        LabHrac1_hod2_1 = new JLabel();
        LabHrac1_hod3_1 = new JLabel();
        LagHrac1_hod4_1 = new JLabel();
        LagHrac1_hod5_1 = new JLabel();
        LagHrac1_hod6_1 = new JLabel();
        LagHrac1_hod7_1 = new JLabel();
        LagHrac1_hod8_1 = new JLabel();
        LagHrac1_hod9_1 = new JLabel();
        LagHrac1_hod10_1 = new JLabel();
        LabHod2 = new JLabel();
        LabHrac1_hod1_2 = new JLabel();
        LabHrac1_hod2_2 = new JLabel();
        LabHrac1_hod3_2 = new JLabel();
        LagHrac1_hod4_2 = new JLabel();
        LagHrac1_hod5_2 = new JLabel();
        LagHrac1_hod6_2 = new JLabel();
        LagHrac1_hod7_2 = new JLabel();
        LagHrac1_hod8_2 = new JLabel();
        LagHrac1_hod9_2 = new JLabel();
        LagHrac1_hod10_2 = new JLabel();
        LabSkore = new JLabel();
        LabHrac1_Skore_H1 = new JLabel();
        LabHrac1_Skore_H2 = new JLabel();
        LabHrac1_Skore_H3 = new JLabel();
        LabHrac1_Skore_H4 = new JLabel();
        LabHrac1_Skore_H5 = new JLabel();
        LabHrac1_Skore_H6 = new JLabel();
        LabHrac1_Skore_H7 = new JLabel();
        LabHrac1_Skore_H8 = new JLabel();
        LabHrac1_Skore_H9 = new JLabel();
        LabHrac1_Skore_H10 = new JLabel();
        LabHrac2 = new JLabel();
        LabHod1Hrac2 = new JLabel();
        LabHrac2_hod1_1 = new JLabel();
        LabHrac2_hod2_1 = new JLabel();
        LabHrac2_hod3_1 = new JLabel();
        LabHrac2_hod4_1 = new JLabel();
        LabHrac2_hod5_1 = new JLabel();
        LabHrac2_hod6_1 = new JLabel();
        LabHrac2_hod7_1 = new JLabel();
        LabHrac2_hod8_1 = new JLabel();
        LabHrac2_hod9_1 = new JLabel();
        LabHrac2_hod10_1 = new JLabel();
        LabHod2Hrac2 = new JLabel();
        LabHrac2_hod1_2 = new JLabel();
        LabHrac2_hod22 = new JLabel();
        LabHrac2_hod3_2 = new JLabel();
        LabHrac2_hod4_2 = new JLabel();
        LabHrac2_hod5_2 = new JLabel();
        LabHrac2_hod6_2 = new JLabel();
        LabHrac2_hod7_2 = new JLabel();
        LabHrac2_hod8_2 = new JLabel();
        LabHrac2_hod9_2 = new JLabel();
        LabHrac2_hod10_2 = new JLabel();
        LabSkore2 = new JLabel();
        LabHrac2_Skore_H1 = new JLabel();
        LabHrac2_Skore_H2 = new JLabel();
        LabHrac2_Skore_H3 = new JLabel();
        LabHrac2_Skore_H4 = new JLabel();
        LabHrac2_Skore_H5 = new JLabel();
        LabHrac2_Skore_H6 = new JLabel();
        LabHrac2_Skore_H7 = new JLabel();
        LabHrac2_Skore_H8 = new JLabel();
        LabHrac2_Skore_H9 = new JLabel();
        LabHrac2_Skore_H10 = new JLabel();
        labObrazek = new JLabel();
        BtnPostavKuzelky = new JButton();
        LabKuzelka10 = new JLabel();
        button1 = new JButton();
        LabKuzelka4 = new JLabel();
        LabKuzelka2 = new JLabel();
        LabKuzelka9 = new JLabel();
        LabKuzelka1 = new JLabel();
        LabKuzelka5 = new JLabel();
        LabKuzelka3 = new JLabel();
        LabKuzelka8 = new JLabel();
        LabKuzelka6 = new JLabel();
        LabKuzelka7 = new JLabel();
        LabPrubezneSkore = new JLabel();
        LabPrubezneSkoreHrac1 = new JLabel();
        LabDvojtecka = new JLabel();
        LabPrubezneSkoreHrac2 = new JLabel();
        LabKdoHraje = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bowling_JFrame");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "insets rel,hidemode 3",
            // columns
            "[51,fill]" +
            "[48,fill]" +
            "[fill]" +
            "[fill]" +
            "[21,fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[fill]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));
        this.contentPane = (JPanel) this.getContentPane();
        this.contentPane.setBackground(this.getBackground());
        LayoutManager layout = this.contentPane.getLayout();
        if (layout instanceof MigLayout) {
            this.migLayoutManager = (MigLayout) layout;
        }

        //---- LabHrac1 ----
        LabHrac1.setText("Hr\u00e1\u010d 1");
        contentPane.add(LabHrac1, "cell 0 1");

        //---- LabHod1 ----
        LabHod1.setText("Hod 1");
        contentPane.add(LabHod1, "cell 1 1");
        contentPane.add(LabHrac1_hod1_1, "cell 2 1");
        contentPane.add(LabHrac1_hod2_1, "cell 4 1");
        contentPane.add(LabHrac1_hod3_1, "cell 5 1");
        contentPane.add(LagHrac1_hod4_1, "cell 6 1");
        contentPane.add(LagHrac1_hod5_1, "cell 7 1");
        contentPane.add(LagHrac1_hod6_1, "cell 8 1");
        contentPane.add(LagHrac1_hod7_1, "cell 9 1");
        contentPane.add(LagHrac1_hod8_1, "cell 10 1");
        contentPane.add(LagHrac1_hod9_1, "cell 11 1");
        contentPane.add(LagHrac1_hod10_1, "cell 12 1");

        //---- LabHod2 ----
        LabHod2.setText("Hod 2");
        contentPane.add(LabHod2, "cell 1 2");
        contentPane.add(LabHrac1_hod1_2, "cell 2 2");
        contentPane.add(LabHrac1_hod2_2, "cell 4 2");
        contentPane.add(LabHrac1_hod3_2, "cell 5 2");
        contentPane.add(LagHrac1_hod4_2, "cell 6 2");
        contentPane.add(LagHrac1_hod5_2, "cell 7 2");
        contentPane.add(LagHrac1_hod6_2, "cell 8 2");
        contentPane.add(LagHrac1_hod7_2, "cell 9 2");
        contentPane.add(LagHrac1_hod8_2, "cell 10 2");
        contentPane.add(LagHrac1_hod9_2, "cell 11 2");
        contentPane.add(LagHrac1_hod10_2, "cell 12 2");

        //---- LabSkore ----
        LabSkore.setText("Sk\u00f3re");
        contentPane.add(LabSkore, "cell 1 3");
        contentPane.add(LabHrac1_Skore_H1, "cell 2 3");
        contentPane.add(LabHrac1_Skore_H2, "cell 4 3");
        contentPane.add(LabHrac1_Skore_H3, "cell 5 3");
        contentPane.add(LabHrac1_Skore_H4, "cell 6 3");
        contentPane.add(LabHrac1_Skore_H5, "cell 7 3");
        contentPane.add(LabHrac1_Skore_H6, "cell 8 3");
        contentPane.add(LabHrac1_Skore_H7, "cell 9 3");
        contentPane.add(LabHrac1_Skore_H8, "cell 10 3");
        contentPane.add(LabHrac1_Skore_H9, "cell 11 3");
        contentPane.add(LabHrac1_Skore_H10, "cell 12 3");

        //---- LabHrac2 ----
        LabHrac2.setText("Hr\u00e1\u010d 2");
        contentPane.add(LabHrac2, "cell 0 5");

        //---- LabHod1Hrac2 ----
        LabHod1Hrac2.setText("Hod 1");
        contentPane.add(LabHod1Hrac2, "cell 1 5");
        contentPane.add(LabHrac2_hod1_1, "cell 2 5");
        contentPane.add(LabHrac2_hod2_1, "cell 4 5");
        contentPane.add(LabHrac2_hod3_1, "cell 5 5");
        contentPane.add(LabHrac2_hod4_1, "cell 6 5");
        contentPane.add(LabHrac2_hod5_1, "cell 7 5");
        contentPane.add(LabHrac2_hod6_1, "cell 8 5");
        contentPane.add(LabHrac2_hod7_1, "cell 9 5");
        contentPane.add(LabHrac2_hod8_1, "cell 10 5");
        contentPane.add(LabHrac2_hod9_1, "cell 11 5");
        contentPane.add(LabHrac2_hod10_1, "cell 12 5");

        //---- LabHod2Hrac2 ----
        LabHod2Hrac2.setText("Hod 2");
        contentPane.add(LabHod2Hrac2, "cell 1 6");
        contentPane.add(LabHrac2_hod1_2, "cell 2 6");
        contentPane.add(LabHrac2_hod22, "cell 4 6");
        contentPane.add(LabHrac2_hod3_2, "cell 5 6");
        contentPane.add(LabHrac2_hod4_2, "cell 6 6");
        contentPane.add(LabHrac2_hod5_2, "cell 7 6");
        contentPane.add(LabHrac2_hod6_2, "cell 8 6");
        contentPane.add(LabHrac2_hod7_2, "cell 9 6");
        contentPane.add(LabHrac2_hod8_2, "cell 10 6");
        contentPane.add(LabHrac2_hod9_2, "cell 11 6");
        contentPane.add(LabHrac2_hod10_2, "cell 12 6");

        //---- LabSkore2 ----
        LabSkore2.setText("Sk\u00f3re");
        contentPane.add(LabSkore2, "cell 1 7");
        contentPane.add(LabHrac2_Skore_H1, "cell 2 7");
        contentPane.add(LabHrac2_Skore_H2, "cell 4 7");
        contentPane.add(LabHrac2_Skore_H3, "cell 5 7");
        contentPane.add(LabHrac2_Skore_H4, "cell 6 7");
        contentPane.add(LabHrac2_Skore_H5, "cell 7 7");
        contentPane.add(LabHrac2_Skore_H6, "cell 8 7");
        contentPane.add(LabHrac2_Skore_H7, "cell 9 7");
        contentPane.add(LabHrac2_Skore_H8, "cell 10 7");
        contentPane.add(LabHrac2_Skore_H9, "cell 11 7");
        contentPane.add(LabHrac2_Skore_H10, "cell 12 7");
        contentPane.add(labObrazek, "cell 2 8");

        //---- BtnPostavKuzelky ----
        BtnPostavKuzelky.setText("Postav kuzelky");
        BtnPostavKuzelky.setBorder(new BevelBorder(BevelBorder.RAISED));
        BtnPostavKuzelky.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                priStiskuPostavKuzelky(e);
            }
        });
        contentPane.add(BtnPostavKuzelky, "cell 1 9");
        contentPane.add(LabKuzelka10, "cell 14 11");

        //---- button1 ----
        button1.setBackground(new Color(0, 51, 153));
        button1.addActionListener(e -> btnHazejPriStisku(e));
        contentPane.add(button1, "cell 1 12 4 5");
        contentPane.add(LabKuzelka4, "cell 12 12");
        contentPane.add(LabKuzelka2, "cell 9 13");
        contentPane.add(LabKuzelka9, "cell 14 13");
        contentPane.add(LabKuzelka1, "cell 7 14");
        contentPane.add(LabKuzelka5, "cell 12 14");
        contentPane.add(LabKuzelka3, "cell 9 15");
        contentPane.add(LabKuzelka8, "cell 14 15");
        contentPane.add(LabKuzelka6, "cell 12 16");
        contentPane.add(LabKuzelka7, "cell 14 17");

        //---- LabPrubezneSkore ----
        LabPrubezneSkore.setText("Pr\u016fb\u011b\u017en\u00e9 sk\u00f3re");
        contentPane.add(LabPrubezneSkore, "cell 1 18");
        contentPane.add(LabPrubezneSkoreHrac1, "cell 2 18");

        //---- LabDvojtecka ----
        LabDvojtecka.setText(":");
        contentPane.add(LabDvojtecka, "cell 3 18");
        contentPane.add(LabPrubezneSkoreHrac2, "cell 4 18");

        //---- LabKdoHraje ----
        LabKdoHraje.setText("H\u00e1z\u00ed prvn\u00ed hr\u00e1\u010d");
        contentPane.add(LabKdoHraje, "cell 1 20 5 1");
        setSize(820, 895);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}
