public class Mahasiswa extends Manusia implements Bernyanyi{//extends mewariskan hanya 1 //implements mewariskan boleh 2/lebih dari bernyanyi
    //merah alt+enter
    // ada attribute
    //private String namaMhs;
    private String nim;
    private double semester;
    private double Ipk;


    // kalau pake private pake get dan set caranya alt+insert+pilih set get
    // modifier itu = public , private untuk dalam ini saja, protected, default kita pake public dan private dulu


    // hapus alt insert constructor  buat dibawah ini biar gak capek
    public Mahasiswa(String namaMhs, String nim, double semester, double ipk) {
        super(namaMhs);
        this.namaMhs = namaMhs;
        this.nim = nim;
        this.semester = semester;
        this.Ipk = ipk;
    }

    //inherintance = bapak => anak atau umum => khusus
    //contoh  makhluk hidup --> manusia -->> mahasiswa --> anaknya lagi
    //ini private
    public String getNamaMhs() {
        return super.namaMhs;
    }

    public void setNamaMhs(String namaMhs) {
        super.namaMhs = namaMhs;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getSemester() {
        return semester;
    }

    public void setSemester(double semester) {
        this.semester = semester;
    }

    public double getIpk() {
        return Ipk;
    }

    public void setIpk(double ipk) {
        Ipk = ipk;
    }

    // ini method
    void belajar() {
        System.out.println("sedang belajar");
    }

    void tugas() {
        System.out.println("Ngerjain tugas");
    }

    @Override
    public void makan(String saya) {
        System.out.println(saya + "mau makan");
    }

    @Override
    public void berdansa(String gerakan) {
        System.out.println(namaMhs + " sedang bergerak");
    }

    @Override
    public void bersuara(String fales) {
        System.out.println("nyanyi" + fales);
    }
}
