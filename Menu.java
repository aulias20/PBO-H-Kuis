import javax.xml.crypto.Data;
import java.util.Scanner;

public class Menu implements DataNilai {
    Scanner input = new Scanner(System.in);
    private String nama;
    private String nim;
    public int nilaiTulis;
    public int nilaiCoding;
    public int nilaiWawancara;
    public int nilaiMicroteaching;
    public int nilaiJaringan;
    public int totalNilai;
    public int average;
    public int nilaiAkhir1;
    public int nilaiAkhir2;

    public Menu(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }
    public void datadiri(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.nim);
    }
    public String getNama() {
        return nama;
    }

    @Override
    public void tesTulis() {
        System.out.println("Nilai Tes Tulis : "); nilaiTulis = input.nextInt();
    }

    @Override
    public void tesCoding() {
        System.out.println("Nilai Tes Praktek Coding : "); nilaiCoding = input.nextInt();
    }

    @Override
    public void tesWawancara() {
        System.out.println("Nilai Tes Wawancara : "); nilaiWawancara = input.nextInt();
    }

    @Override
    public void tesMicroteaching() {
        System.out.println("Nilai Tes Microteaching : "); nilaiMicroteaching = input.nextInt();
    }
    @Override
    public void tesJaringan() {
        System.out.println("Nilai Tes Jaringan : "); nilaiJaringan = input.nextInt();
    }

}
