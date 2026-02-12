import java.util.Scanner; //import utility untuk input
import java.util.ArrayList; //import utility untuk membuat arraylist

public class Soal1_DataTypes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Membuat scanner untuk input
        ArrayList<String> daftar_angka = new ArrayList <>();   //Deklarasi arrraylist daftar_angka

        //Input jumlah angka yang dimasukkan
        System.out.print("Banyak angka yang akan dimasukan : ");
        int N = input.nextInt();

        System.out.println("=".repeat(38));

        //Looping untuk mengisi arraylist
        for(int i = 0; i < N; i++){
            System.out.print("Masukan Angka: ");
            String input_angka = input.next();

            daftar_angka.add(input_angka);
        }

        System.out.println("=".repeat(25));

        //Looping untuk mengetahui kondisi di setiap angka
        for (int i = 0; i < N; i++){
            //Mengambil data dari arraylist daftar_angka
            String input_angka = daftar_angka.get(i);
            try {
                long angka = Long.parseLong(input_angka);;
                if(angka >= Byte.MIN_VALUE && angka <= Byte.MAX_VALUE){     //Kondisi 1 mulai dari byte
                    System.out.println(angka + " can be fitted in:");
                    System.out.println("*byte");
                    System.out.println("*short");
                    System.out.println("*int");
                    System.out.println("*long");
                }else if (angka >= Short.MIN_VALUE && angka <= Short.MAX_VALUE) {   //Kondisi 2 mulai dari short
                    System.out.println(angka + " can be fitted in:");
                    System.out.println("*short");
                    System.out.println("*int");
                    System.out.println("*long");
                } else if (angka >= Integer.MIN_VALUE && angka <= Integer.MAX_VALUE) { //Kondisi 3 mulai dari int
                    System.out.println(angka + " can be fitted in:");
                    System.out.println("*int");
                    System.out.println("*long");
                }else if (angka >= Long.MIN_VALUE && angka <= Long.MAX_VALUE) { //Kondisi 4 hanya long
                    System.out.println(angka + " can be fitted in:");
                    System.out.println("*long");
            }
            } catch (Exception angka) {
                System.out.println(input_angka + " can't be fitted anywhere"); //Jika kondisi angka lebih dari range long
            }
            System.out.println(" ");
        }
    }
}