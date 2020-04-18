public class Main {
    public static void main(String[] args) {
//        Mahasiswa akli = new Mahasiswa("Maymunah" , "123180015" , 4 , 4.0 );
//        /*akli.namaMhs = "Muhammad Akli Adnan";
//        akli.nim     = "123180015";
//        akli.semester= 4;
//        akli.Ipk     = 4.0;*/
//
//        //ini pake private
//        akli.setNamaMhs("Muhammad Akli Adnan");
//        akli.setNim("123180015");
//        akli.setSemester(4);
//        akli.setIpk(4.0);
//
//        /*System.out.println("Nama = " + akli.namaMhs);
//        System.out.println("Nim  = " + akli.nim);
//        System.out.println("Semester  = " + akli.semester);
//        System.out.println("Ipk  = " + akli.Ipk );*/
//
//        //ini pake private
//        System.out.println("Nama = " + akli.getNamaMhs());
//        System.out.println("Nim  = " + akli.getNim());
//        System.out.println("Semester  = " + akli.getSemester());
//        System.out.println("Ipk  = " + akli.getIpk());
//        akli.belajar();
//        akli.tugas();

        Manusia manusia = new Manusia("doi");
        Mahasiswa mahasiswa = new Mahasiswa("akli", "123180013", 4, 4.0);

        mahasiswa.ktp = "12345";
//        System.out.println("nama = " + mahasiswa.namaMhs);
//        manusia.makan("anjaer");

       mahasiswa.berdansa("maju mundur kena");

    }
}
