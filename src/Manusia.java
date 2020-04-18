public class Manusia {
    String namaMhs;
    String ktp;
    int umur;

    //overloading = nama dan tipe methodnya sama,tapi parameternya harus beda , isi program boleh beda
    //overriding  = nama dan tipe methodnya sama,tapi parameternya harus sama , isi program boleh beda
    public Manusia(String namaMhs) {
        this.namaMhs = namaMhs;

    }

    //overloading dikelas yang sama

    public void makan() {
        System.out.println("saya laper");
    }

    public void makan(String saya) {
        System.out.println(saya + " saya laper");
    }

    public void makan(String nama, String bobok) {
        System.out.println(nama + " saya laper" + bobok);
    }
}
