import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InputMismatchException{
        Menu m = new Menu("Aulia Salsabila","123180169");
        Asisten as = new Asisten("Aulia Salsabila","123180169");
        Admin ad = new Admin("Salsabila Aulia", "123180169");

        Scanner i = new Scanner(System.in);
        Scanner s = new Scanner(System.in);

        int ulang;
        final String menu1 = "1. Asisten Laboratorium";
        final String menu2 = "2. Admin Laboratorium";
        int pilihMenu;
        do {
        System.out.println("-- MENU FORM PENDAFTARAN --");
        System.out.println(menu1);
        System.out.println(menu2);
        System.out.println("Pilih menu : ");
            try {
                pilihMenu = s.nextInt();
                if (pilihMenu == 1) {
                    as.datadiri();
                    as.tesTulis();
                    as.tesCoding();
                    as.tesWawancara();
                    as.tesMicroteaching();
                    as.nilaiAkhirAslab();
                    if (as.getNilaiAkhir1() > 85 && as.getNilaiAkhir1() <= 100) {
                        System.out.println("Keterangan : LOLOS");
                        System.out.println("Selamat kepada " + as.getNama() + " telah diterima sebagai Asisten Laboratorium!");

                    } else if (as.getNilaiAkhir1() >= 0 && as.getNilaiAkhir1() <= 85) {
                        System.out.println("Keterangan : TIDAK LOLOS");
                        System.out.println("Maaf kepada " + as.getNama() + " belum diterima sebagai Asisten Laboratorium tahun ini!");

                    }
                } else if (pilihMenu == 2) {
                    ad.datadiri();
                    ad.tesTulis();
                    ad.tesCoding();
                    ad.tesWawancara();
                    ad.tesJaringan();
                    ad.nilaiAkhirAdmin();
                    if (ad.getNilaiAkhir2() > 85 && ad.getNilaiAkhir2() <= 100) {
                        System.out.println("Keterangan : LOLOS");
                        System.out.println("Selamat kepada " + ad.getNama() + " telah diterima sebagai Admin Laboratorium!");
                    } else if (ad.getNilaiAkhir2() >= 0 && ad.getNilaiAkhir2() <= 85) {
                        System.out.println("Keterangan : TIDAK LOLOS");
                        System.out.println("Maaf kepada " + ad.getNama() + " belum diterima sebagai Admin Laboratorium tahun ini!");

                    }
                }else{
                    System.out.println("Menu Tidak Valid! Masukkan nomor menu yang tersedia.");
                }
                System.out.println("");
                System.out.println("Ingin kembali ke menu awal?");
                System.out.println("<1> Ya");
                System.out.println("<2> Tidak");
                System.out.println("Pilihan (angka) : ");
                ulang = i.nextInt();
            } catch (InputMismatchException num) {
                System.out.println("Input harus berupa angka!");

                System.out.println("");
                System.out.println("Ingin kembali ke menu awal?");
                System.out.println("<1> Ya");
                System.out.println("<2> Tidak");
                System.out.println("Pilihan (angka) : ");
                ulang = i.nextInt();
            } s.nextLine(); i.nextLine();
        }while(ulang < 2 && ulang > 0);
        System.out.println("");
        System.out.println("--- Terima kasih ---");
    }
}
