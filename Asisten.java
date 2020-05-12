public class Asisten extends Menu implements Aslab {

    public Asisten(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public void nilaiAkhirAslab() {
        totalNilai = nilaiTulis+nilaiCoding+nilaiWawancara+nilaiMicroteaching;
        average = totalNilai/4;
        nilaiAkhir1 = average;
        System.out.println("Nilai Akhir : " + nilaiAkhir1);
    }
    public int getNilaiAkhir1() {
        return nilaiAkhir1;
    }
}
