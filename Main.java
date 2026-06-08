package praktikum11;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Player> timA = new ArrayList<>();
        ArrayList<Player> timB = new ArrayList<>();

        timA.add(new Player(168,50));
        timA.add(new Player(170,60));
        timA.add(new Player(165,56));
        timA.add(new Player(168,55));
        timA.add(new Player(172,60));
        timA.add(new Player(170,70));
        timA.add(new Player(169,66));
        timA.add(new Player(165,56));
        timA.add(new Player(171,72));
        timA.add(new Player(166,56));

        timB.add(new Player(170,66));
        timB.add(new Player(167,60));
        timB.add(new Player(165,59));
        timB.add(new Player(166,58));
        timB.add(new Player(168,58));
        timB.add(new Player(175,71));
        timB.add(new Player(172,68));
        timB.add(new Player(171,68));
        timB.add(new Player(168,65));
        timB.add(new Player(169,60));

        System.out.println("===== SORT TINGGI ASC TIM A =====");
        Tim.sortTinggiAsc(timA);
        Tim.tampilkan(timA);

        System.out.println("\n===== SORT BERAT DESC TIM B =====");
        Tim.sortBeratDesc(timB);
        Tim.tampilkan(timB);

        System.out.println("\n===== MIN MAX TIM A =====");
        Tim.minMaxTinggi(timA);
        Tim.minMaxBerat(timA);

        System.out.println("\n===== MIN MAX TIM B =====");
        Tim.minMaxTinggi(timB);
        Tim.minMaxBerat(timB);


        ArrayList<Player> timC = new ArrayList<>();
        timC.addAll(timB);

        System.out.println("\n===== TIM C =====");
        Tim.tampilkan(timC);

        
        System.out.println("\nJumlah tinggi 168 di Tim B : "
                + Tim.hitungTinggi(timB, 168));

        System.out.println("Jumlah tinggi 160 di Tim B : "
                + Tim.hitungTinggi(timB, 160));

        System.out.println("Jumlah berat 56 di Tim A : "
                + Tim.hitungBerat(timA, 56));

        System.out.println("Jumlah berat 53 di Tim A : "
                + Tim.hitungBerat(timA, 53));

        boolean sama = false;

        for (Player a : timA) {
            for (Player b : timB) {

                if (a.getTinggi() == b.getTinggi()
                        || a.getBerat() == b.getBerat()) {

                    sama = true;
                    break;
                }
            }
        }

        if (sama)
            System.out.println("\nAda pemain yang memiliki tinggi atau berat yang sama.");
        else
            System.out.println("\nTidak ada pemain yang memiliki tinggi atau berat yang sama.");
    }
}