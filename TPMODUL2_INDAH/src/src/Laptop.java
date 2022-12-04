public class Laptop extends Perangkat{
    protected boolean webcam;

    public Laptop(String drive, int RAM, float processor, boolean webcam){
        super(drive, RAM, processor);
        this.webcam = webcam;
    }

    public void informasi(){
        if(webcam == true){
            System.out.println("Laptop ini memiliki drive tipe " + this.drive + " dengan RAM sebesar "+ this.RAM + "GB dan processor secepat " + this.processor + "Ghz. Selain itu laptop ini memiliki webcam");
        }else{
            System.out.println("Laptop ini memiliki drive tipe " + this.drive + " dengan RAM sebesar "+ this.RAM + "GB dan processor secepat " + this.processor + "Ghz. Selain itu laptop ini TIDAK memiliki webcam");
        }
    }

    public void bukaGame(String nama_game){
        System.out.println("Laptop berhasil membuka game " + nama_game);
    }

    public void kirimEmail(String Email){
        System.out.println("Laptop berhasil mengirim Email ke " + Email);
    }

    public void kirimEmail(String Email1, String Email2){
        System.out.println("Laptop berhasil mengirim Email ke " + Email1 + " dan ke " + Email2);
    }
}
