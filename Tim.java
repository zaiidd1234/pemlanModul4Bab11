package praktikum11;

import java.util.*;

public class Tim {

    public static void tampilkan(List<Player> tim) {
        for (Player p : tim) {
            System.out.println(p);
        }
    }

    public static void sortTinggiAsc(List<Player> tim) {
        tim.sort(Comparator.comparingInt(Player::getTinggi));
    }

    public static void sortTinggiDesc(List<Player> tim) {
        tim.sort((a, b) -> b.getTinggi() - a.getTinggi());
    }

    public static void sortBeratAsc(List<Player> tim) {
        tim.sort(Comparator.comparingInt(Player::getBerat));
    }

    public static void sortBeratDesc(List<Player> tim) {
        tim.sort((a, b) -> b.getBerat() - a.getBerat());
    }

    public static void minMaxTinggi(List<Player> tim) {

        int min = tim.get(0).getTinggi();
        int max = tim.get(0).getTinggi();

        for (Player p : tim) {
            if (p.getTinggi() < min)
                min = p.getTinggi();

            if (p.getTinggi() > max)
                max = p.getTinggi();
        }

        System.out.println("Tinggi Minimum : " + min);
        System.out.println("Tinggi Maximum : " + max);
    }

    public static void minMaxBerat(List<Player> tim) {

        int min = tim.get(0).getBerat();
        int max = tim.get(0).getBerat();

        for (Player p : tim) {
            if (p.getBerat() < min)
                min = p.getBerat();

            if (p.getBerat() > max)
                max = p.getBerat();
        }

        System.out.println("Berat Minimum : " + min);
        System.out.println("Berat Maximum : " + max);
    }

    public static int binarySearchTinggi(List<Player> tim, int tinggi) {

        sortTinggiAsc(tim);

        int left = 0;
        int right = tim.size() - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (tim.get(mid).getTinggi() == tinggi)
                return mid;

            if (tim.get(mid).getTinggi() < tinggi)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    public static int hitungTinggi(List<Player> tim, int tinggi) {

        int jumlah = 0;

        for (Player p : tim) {
            if (p.getTinggi() == tinggi)
                jumlah++;
        }

        return jumlah;
    }

    public static int hitungBerat(List<Player> tim, int berat) {

        int jumlah = 0;

        for (Player p : tim) {
            if (p.getBerat() == berat)
                jumlah++;
        }

        return jumlah;
    }
}