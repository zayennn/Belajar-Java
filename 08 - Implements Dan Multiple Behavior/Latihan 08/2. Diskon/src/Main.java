interface Diskon{
    double getHitungDiskon(double harga);
}

class MemberGold implements Diskon{
    public double getHitungDiskon(double harga) {
        return harga * 0.2;
    }
}

class MemberSilver implements Diskon{
    public double getHitungDiskon(double harga) {
        return harga * 0.1;
    }
}

public class Main{
    public static void main(String[] args) {
        MemberGold person1 = new MemberGold();
        MemberSilver person2 = new MemberSilver();

        System.out.println("harga yang harus di bayar : " + person1.getHitungDiskon(100000));
        System.out.println("harga yang harus di bayar : " + person1.getHitungDiskon(100000));
    }
}