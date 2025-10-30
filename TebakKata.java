package tebakkata;

import java.util.Random;
import java.util.Scanner;

public class TebakKata {
    
    public static void main(String[] args) {
        
        System.out.println("<< MENEBAK KATA MISTERI >>");
        
        Scanner s = new Scanner(System.in);
        String[] kata = {
            "angin", "pohon", "senyum", "tangga", "hujan", "pagi", "gelombang", "bintang", "sunyi", "harapan",
            "warna", "tirai", "tanah", "awan", "pasir", "daun", "senja", "cahaya", "jejak", "langkah",
            "ombak", "tenang", "langit", "bayangan", "melodi", "bayu", "jemari", "bulan", "rumput", "senandung",
            "embun", "kertas", "kisah", "pelangi", "larik", "nada", "sayap", "hutan", "cermin", "lentera",
            "cahaya", "gunung", "gembira", "sekilas", "embusan", "serpihan", "suara", "aksara", "dedaunan", "pelukan"
        };
        Random r = new Random();
        int acak = r.nextInt(1, 50);
        String a = kata[acak];
        char[] tebakan = new char[a.length()];
        for (int i = 0; i < a.length(); i++) {
            tebakan [i] = a.charAt(i);
        }
        int nyawa = (a.length())*3/2;
        char[] output = new char[a.length()];
        for (int i = 0; i < a.length(); i++) {
            output [i] = ' ';
        }
        for (int turn = nyawa; turn > 0; turn--) {
            int y = 0;
            
            switch (a.length()) {
                case 4 -> {
                    if (output[0] != ' ' && output[1] != ' ' && output[2] != ' ' && output[3] != ' ') {
                        y = 1;
                    }
                }
                case 5 -> {
                    if (output[0] != ' ' && output[1] != ' ' && output[2] != ' ' && output[3] != ' ' && output[4] != ' ') {
                        y = 1;
                    }
                }
                case 6 -> {
                    if (output[0] != ' ' && output[1] != ' ' && output[2] != ' ' && output[3] != ' ' && output[4] != ' ' && output[5] != ' ') {
                        y = 1;
                    }
                }
                case 7 -> {
                    if (output[0] != ' ' && output[1] != ' ' && output[2] != ' ' && output[3] != ' ' && output[4] != ' ' && output[5] != ' ' && output[6] != ' ') {
                        y = 1;
                    }
                }
                case 8 -> {
                    if (output[0] != ' ' && output[1] != ' ' && output[2] != ' ' && output[3] != ' ' && output[4] != ' ' && output[5] != ' ' && output[6] != ' ' && output[7] != ' ') {
                        y = 1;
                    }
                }
                default -> {
                }
            }
            
            if (y == 1){
                break;
            }
            System.out.println("\nKesempatan: " + turn);
            int x = 0;
            while (x < a.length()) {
                System.out.printf("[%c]", output[x]);
                x++;
            }
            
            System.out.println("");
            System.out.print("Tebak 1 huruf: ");
            char in = s.next().charAt(0);
                
            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < a.length(); j++) {
                    if (in == tebakan[i]) {
                        output[i] = in;
                    }
                }
                
            }
            nyawa = turn;
        }
        if (nyawa > 1 || (output[0] != ' '&& output[1] != ' '&& output[2] != ' '&& output[3] != ' ')){
                System.out.println("\n<< SELAMAT >>");
            } else {
            System.out.println("\nKesempatan habis");
                System.out.println("<< KAMU KALAH >>");
            }
        System.out.println("Kata misterinya adalah " + a);
    }
    
}
