package no.hvl.dat100.tabeller;
import java.util.*;

public class Tabeller {

    // a)public static void main(String[] args){

    public static void skrivUt(int[] tabell) {

        int[] antallTab = {23, 17, 58};
        double[] prisTab = {220.5, 199.00, 170.00};
        String[] navnTab = {"Spade", "Hakke", "Spett"};


        System.out.println(tabell);
    }
}



	// b)
    public static String toString(int[] tabell) {
        String tekst = "";

        for (int i = 0; i < tabell.length; i++) {
            tekst += tabell[i];

            if (i < tabell.length - 1) {
                tekst += ", ";
            }
        }

        return tekst;
    }

}

	// c)
	public static int summer(int[] tabell) {
        int sum = 0;

        for (int i = 0; i < tabell.length; i++) {
            sum += tabell[i];
        }
        return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return true;
            }
        }
        return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return i;
            }
        }
        return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

        int[] resultat = new int[tabell.length];

        for (int i = 0; i < tabell.length; i++) {
            resultat[i] = tabell[tabell.length - 1 - i];
        }
        return resultat;
    }
	// g)
	public static boolean erSortert(int[] tabell) {

        int[] lottoTall = {34, 2, 7, 16, 21, 29, 1};
        int[] minKupong = {12, 1, 34, 16, 2, 25, 26};

        Arrays.sort(lottoTall);
        Arrays.sort(minKupong);

        if (Arrays.equals(lottoTall, minKupong))
            System.out.println("Du har vunnet 1. premie!");
    }


	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

        int[] resultat = new int[tabell1.length+tabell2.length];
        for (int i = 0; i < tabell1.length; i++) {
            resultat[i] = tabell1[i];
        }

        for (int j = 0; j < tabell2.length; j++) {
            resultat[tabell1.length + j] = tabell2[j];
        }

        return resultat;
	}
