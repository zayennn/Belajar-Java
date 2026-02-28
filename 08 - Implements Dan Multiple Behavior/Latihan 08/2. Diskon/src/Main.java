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
        person1.getHitungDiskon(100000);

        MemberSilver person2 = new MemberSilver();
        person2.getHitungDiskon(100000);

        System.out.println(person1);
        System.out.println(person2);
    }
}