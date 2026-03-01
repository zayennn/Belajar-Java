class Vehicle{
    String merk;

    Vehicle(String merk) {
        this.merk = merk;
    }

    void start(){
        System.out.println("jalan");
    }

    void stop() {
        System.out.println("berhenti");
    }
}

interface Electric {
    void isiDaya();
    double getCekBatre();
}

class Tesla extends Vehicle implements Electric {
    int batre_sekarang;

    Tesla(String merk, int batre_sekarang) {
        super(merk);
    }


}

public class Main{
    public static void main(String[] args) {

    }
}