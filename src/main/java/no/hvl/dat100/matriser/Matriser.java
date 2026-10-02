package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
        int[][] matrise = new int[3][3];

        int[][] fyltMatrise = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
    }
		


	// b)
	public static String tilStreng(int[][] matrise) {

        String tekst = "";

        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                tekst += matrise[i][j];


                if (i < matrise.length - 1) {
                    tekst += ", ";
                }
            }
            if (i < matrise.length - 1) {
                tekst += ", ";
            }
        }

        return tekst;
    }


	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
        int[][] resultat = new int[matrise.length][];

        for (int i = 0; i < matrise.length; i++) {
            resultat[i] = new int[matrise[i].length];
            for (int j = 0; j < matrise[i].length; j++) {
                resultat[i][j] = matrise[i][j] * tall;
            }
        }

        return resultat;
		

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

        if (a == null || b == null || a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[i].length) {
                return false;
            }
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

	
	// e)
	public static int[][] speile(int[][] matrise) {

		if (matrise == null) {
            return null;
        }
        int antRader = matrise.length;
        int antKolonner = matrise[0].length;

        int[][] speilet = new int[antKolonner][antRader];

        for (int i = 0; i < antRader; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                speilet[j][i] = matrise[i][j];
            }
        }
        return speilet;
        }
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
        if (a == null || b == null || a[0].length != b.length) {
            throw new IllegalArgumentException("Ugyldige dimensjoner for matrisemultiplikasjon.");
        }

        int raderA = a.length;
        int kolonnerA = a[0].length;
        int kolonnerB = b[0].length;

        int[][] resultat = new int[raderA][kolonnerB];

        for (int i = 0; i < raderA; i++) {
            for (int j = 0; j < kolonnerB; j++) {
                for (int k = 0; k < kolonnerA; k++) {
                    resultat[i][j] += a[i][k] * b[k][j];

                }
            }
        }

        return resultat;
    }


