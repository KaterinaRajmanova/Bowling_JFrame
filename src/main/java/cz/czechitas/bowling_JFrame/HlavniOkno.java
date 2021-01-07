package cz.czechitas.bowling_JFrame;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import net.miginfocom.swing.*;

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
    JLabel LabHrac2_hod2_2;
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
    JLabel LabKdoHraje;
    JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    JPanel contentPane;
    MigLayout migLayoutManager;
    Hrac hrac1 = new Hrac();
    Hrac hrac2 = new Hrac();

    public HlavniOkno() {
        initComponents();

     





    }


    private void btnHazejPriStisku(ActionEvent e) {
        JButton btnHazej = (JButton)e.getSource();
        if (LabHrac1_hod1_1.getText().isEmpty()){
            hrac1.haziPrvniHod();
            LabHrac1_hod1_1.setText(Integer.toString(hrac1.getHod1()));
            LabKdoHraje.setText("Házej znovu");

        }else if (LabHrac1_hod1_2.getText().isEmpty()){
            hrac1.haziDruhyHod();
            LabHrac1_hod1_2.setText(Integer.toString(hrac1.getHod2()));
            hrac1.vypoctiSkorePoHodech();
            LabHrac1_Skore_H1.setText(Integer.toString(hrac1.getSkore()));
            LabKdoHraje.setText("Hází druhý hráč");

        }else if (LabHrac2_hod1_1.getText().isEmpty()){
            hrac2.haziPrvniHod();
            LabHrac2_hod1_1.setText(Integer.toString(hrac2.getHod1()));
            LabKdoHraje.setText("Házej znovu");

        }else if (LabHrac2_hod1_2.getText().isEmpty()){
            hrac2.haziDruhyHod();
            LabHrac2_hod1_2.setText(Integer.toString(hrac2.getHod2()));
            hrac2.vypoctiSkorePoHodech();
            LabHrac2_Skore_H1.setText(Integer.toString(hrac2.getSkore()));
            LabKdoHraje.setText("Hází první hráč");
        }
        
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
        LabHrac2_hod2_2 = new JLabel();
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
        LabKdoHraje = new JLabel();
        button1 = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bowling_JFrame");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "insets rel,hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
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
        contentPane.add(LabHrac1_hod2_1, "cell 3 1");
        contentPane.add(LabHrac1_hod3_1, "cell 4 1");
        contentPane.add(LagHrac1_hod4_1, "cell 5 1");
        contentPane.add(LagHrac1_hod5_1, "cell 6 1");
        contentPane.add(LagHrac1_hod6_1, "cell 7 1");
        contentPane.add(LagHrac1_hod7_1, "cell 8 1");
        contentPane.add(LagHrac1_hod8_1, "cell 9 1");
        contentPane.add(LagHrac1_hod9_1, "cell 10 1");
        contentPane.add(LagHrac1_hod10_1, "cell 11 1");

        //---- LabHod2 ----
        LabHod2.setText("Hod 2");
        contentPane.add(LabHod2, "cell 1 2");
        contentPane.add(LabHrac1_hod1_2, "cell 2 2");
        contentPane.add(LabHrac2_hod2_2, "cell 3 2");
        contentPane.add(LabHrac1_hod3_2, "cell 4 2");
        contentPane.add(LagHrac1_hod4_2, "cell 5 2");
        contentPane.add(LagHrac1_hod5_2, "cell 6 2");
        contentPane.add(LagHrac1_hod6_2, "cell 7 2");
        contentPane.add(LagHrac1_hod7_2, "cell 8 2");
        contentPane.add(LagHrac1_hod8_2, "cell 9 2");
        contentPane.add(LagHrac1_hod9_2, "cell 10 2");
        contentPane.add(LagHrac1_hod10_2, "cell 11 2");

        //---- LabSkore ----
        LabSkore.setText("Sk\u00f3re");
        contentPane.add(LabSkore, "cell 1 3");
        contentPane.add(LabHrac1_Skore_H1, "cell 2 3");
        contentPane.add(LabHrac1_Skore_H2, "cell 3 3");
        contentPane.add(LabHrac1_Skore_H3, "cell 4 3");
        contentPane.add(LabHrac1_Skore_H4, "cell 5 3");
        contentPane.add(LabHrac1_Skore_H5, "cell 6 3");
        contentPane.add(LabHrac1_Skore_H6, "cell 7 3");
        contentPane.add(LabHrac1_Skore_H7, "cell 8 3");
        contentPane.add(LabHrac1_Skore_H8, "cell 9 3");
        contentPane.add(LabHrac1_Skore_H9, "cell 10 3");
        contentPane.add(LabHrac1_Skore_H10, "cell 11 3");

        //---- LabHrac2 ----
        LabHrac2.setText("Hr\u00e1\u010d 2");
        contentPane.add(LabHrac2, "cell 0 5");

        //---- LabHod1Hrac2 ----
        LabHod1Hrac2.setText("Hod 1");
        contentPane.add(LabHod1Hrac2, "cell 1 5");
        contentPane.add(LabHrac2_hod1_1, "cell 2 5");
        contentPane.add(LabHrac2_hod2_1, "cell 3 5");
        contentPane.add(LabHrac2_hod3_1, "cell 4 5");
        contentPane.add(LabHrac2_hod4_1, "cell 5 5");
        contentPane.add(LabHrac2_hod5_1, "cell 6 5");
        contentPane.add(LabHrac2_hod6_1, "cell 7 5");
        contentPane.add(LabHrac2_hod7_1, "cell 8 5");
        contentPane.add(LabHrac2_hod8_1, "cell 9 5");
        contentPane.add(LabHrac2_hod9_1, "cell 10 5");
        contentPane.add(LabHrac2_hod10_1, "cell 11 5");

        //---- LabHod2Hrac2 ----
        LabHod2Hrac2.setText("Hod 2");
        contentPane.add(LabHod2Hrac2, "cell 1 6");
        contentPane.add(LabHrac2_hod1_2, "cell 2 6");
        contentPane.add(LabHrac2_hod22, "cell 3 6");
        contentPane.add(LabHrac2_hod3_2, "cell 4 6");
        contentPane.add(LabHrac2_hod4_2, "cell 5 6");
        contentPane.add(LabHrac2_hod5_2, "cell 6 6");
        contentPane.add(LabHrac2_hod6_2, "cell 7 6");
        contentPane.add(LabHrac2_hod7_2, "cell 8 6");
        contentPane.add(LabHrac2_hod8_2, "cell 9 6");
        contentPane.add(LabHrac2_hod9_2, "cell 10 6");
        contentPane.add(LabHrac2_hod10_2, "cell 11 6");

        //---- LabSkore2 ----
        LabSkore2.setText("Sk\u00f3re");
        contentPane.add(LabSkore2, "cell 1 7");
        contentPane.add(LabHrac2_Skore_H1, "cell 2 7");
        contentPane.add(LabHrac2_Skore_H2, "cell 3 7");
        contentPane.add(LabHrac2_Skore_H3, "cell 4 7");
        contentPane.add(LabHrac2_Skore_H4, "cell 5 7");
        contentPane.add(LabHrac2_Skore_H5, "cell 6 7");
        contentPane.add(LabHrac2_Skore_H6, "cell 7 7");
        contentPane.add(LabHrac2_Skore_H7, "cell 8 7");
        contentPane.add(LabHrac2_Skore_H8, "cell 9 7");
        contentPane.add(LabHrac2_Skore_H9, "cell 10 7");
        contentPane.add(LabHrac2_Skore_H10, "cell 11 7");

        //---- LabKdoHraje ----
        LabKdoHraje.setText("H\u00e1z\u00ed prvn\u00ed hr\u00e1\u010d");
        contentPane.add(LabKdoHraje, "cell 1 20");

        //---- button1 ----
        button1.setText("H\u00e1zej");
        button1.addActionListener(e -> btnHazejPriStisku(e));
        contentPane.add(button1, "cell 4 21");
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}
