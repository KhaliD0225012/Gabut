package latihan;

import java.util.Scanner;

public class Latihan13 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String[] nama = {
            "Marsya", "Abrar", "Khalid", "Alim", "Iqra"
        };
        System.out.print("Panggil mahasiswa nomor urut: ");
        int a = s.nextInt();
        System.out.println(nama[(a-1)]);
        
    }
    
}
