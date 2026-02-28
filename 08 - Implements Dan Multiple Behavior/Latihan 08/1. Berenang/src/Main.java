interface BisaBerenang{
    void berenang();
}

class Ikan implements BisaBerenang{
    public void berenang() {
        System.out.println("ikan berenag menggunakan sirip");
    }
}

class Bebek implements BisaBerenang{
    public void berenang() {
        System.out.println("bebek berenang menggunakan selaput");
    }
}

public class Main{
    public static void main(String[] args) {
        BisaBerenang[] daftar = {
                new Ikan(),
                new Bebek()
        };

        for (BisaBerenang bb : daftar) {
            bb.berenang();
        }
    }
}