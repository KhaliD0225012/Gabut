package latihan;

import java.util.Scanner;

public class Latihan14 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String[] nama = {
            "Marsya", "Abrar", "Khalid", "Alim", "Iqra"
        };
        String panggil = s.nextLine();
        for (int i = 0; i < nama.length; i++) {
            if (panggil.equals(nama[i])){
                System.out.println("Indeks "+ i);
            }
        }
    }
    
}
