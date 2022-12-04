public class MainApp {
    public static void main(String[] args) {
        // Deklarasi
        Perangkat Perangkat1 = new Perangkat("LENOVO",4,(float)1.90);
        Laptop Laptop1 = new Laptop("THINKPAD", 8, (float)2.60, false);
        Handphone Handphone1 = new Handphone("SAMSUNG",4,(float)2.20,false);

        Perangkat1.informasi();
        System.out.println();
        Laptop1.informasi();
        Laptop1.bukaGame("PUBG");
        Laptop1.kirimEmail(" indahrizkianii@student.telkomuniversity.com");
        Laptop1.kirimEmail("indahrizkiaaa@gmail.com"," indahrizkianii@student.telkomuniversity.com");

        System.out.println();
        Handphone1.informasi();
        Handphone1.telfon(628224264);
        Handphone1.kirimSMS(628537686, 681382381);
    }
}
