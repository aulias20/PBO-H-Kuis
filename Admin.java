public class Admin extends Menu implements AdminLab{
    public Admin(String nama, String nim) {
        super(nama, nim);
    }
    @Override
    public void nilaiAkhirAdmin() {
        totalNilai = nilaiTulis+nilaiCoding+nilaiWawancara+nilaiMicroteaching;
        average = totalNilai/4;
        nilaiAkhir2 = average;
        System.out.println("Nilai Akhir : " + nilaiAkhir2);
    }
    public int getNilaiAkhir2() {
        return nilaiAkhir2;
    }
}
