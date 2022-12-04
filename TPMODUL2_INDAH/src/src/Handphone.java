public class Handphone extends Perangkat{
    protected boolean fingerprint;

    public Handphone(String drive, int RAM, float processor, boolean fingerprint){
        super(drive, RAM, processor);
        this.fingerprint = fingerprint;
    }

    public void informasi(){
        if(fingerprint == true){
            System.out.println("Handphone ini memiliki drive tipe " + this.drive + " dengan RAM sebesar "+ this.RAM + " GB dan processor secepat " + this.processor + " Ghz. Selain itu handphone ini memiliki fingerprint" );
        }else{
            System.out.println("Handphone ini memiliki drive tipe " + this.drive + " dengan RAM sebesar "+ this.RAM + " GB dan processor secepat " + this.processor + " Ghz. Selain itu handphone ini TIDAK memiliki fingerprint");
        }
    }


    public void telfon(int no_HP){
        System.out.println("Handphone berhasil menyambung telfon ke No " + no_HP);
    }

    public void kirimSMS(int no_HP){
        System.out.println("Handphone berhasil mengirim SMS ke No " + no_HP);
    }

    public void kirimSMS(int no_HP1, int no_HP2){
        System.out.println("Handphone berhasil mengirim SMS ke No " + no_HP1 + "dan ke No " + no_HP2);
    }

}
