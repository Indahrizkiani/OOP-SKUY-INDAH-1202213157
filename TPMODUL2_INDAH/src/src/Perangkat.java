public class Perangkat {

    protected String drive;
    protected int RAM;
    protected float processor;

    public Perangkat(String drive, int RAM, float processor){
        this.drive = drive;
        this.RAM = RAM;
        this.processor = processor;
    }

    public void informasi(){
        System.out.println("Perangkat tidak diketahui memiliki drive tipe" +  this.drive + "dengan RAM sebesar"+  this.RAM + "GB dan processor secepat" +  this.processor + "Ghz.");
    }

}
