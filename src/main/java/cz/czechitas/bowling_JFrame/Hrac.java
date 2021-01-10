package cz.czechitas.bowling_JFrame;

import java.util.*;

public class Hrac {
    int pocetKuzelek;
    int hod1;
    int hod2;
    int skore;

    public void haziPrvniHod() {
        setPocetKuzelek();
        Random random = new Random();
        hod1 = random.nextInt(11);
        pocetKuzelek = pocetKuzelek - hod1;
    }

    public void haziDruhyHod() {
        Random random = new Random();

        if (pocetKuzelek==0) {
            this.setPocetKuzelek();
            hod2 =hod2 = random.nextInt(pocetKuzelek+1);
            pocetKuzelek = pocetKuzelek - hod2;
        } else {

            hod2 = random.nextInt(pocetKuzelek+1);
            pocetKuzelek = pocetKuzelek - hod2;
        }
    }

    public int getPocetKuzelek() {
        return pocetKuzelek;
    }

    public int getHod1() {
        return hod1;
    }

    public int getHod2() {
        return hod2;
    }

    public void vypoctiSkorePoHodech() {
        skore = hod1 + hod2;
        if(skore>=10){
            skore = skore*2;
        }
    }

    public int getSkore() {
        return skore;
    }

    public int setPocetKuzelek(){
        return pocetKuzelek=10;
    }
}



