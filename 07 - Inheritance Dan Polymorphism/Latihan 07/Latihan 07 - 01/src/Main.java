public class Main{
    static class Hewan{
        String nama;

        void getSuara() {
            System.out.println("suara hewan normal");
        }
    }

    static class Kucing extends Hewan {
        @Override
        void getSuara() {
            System.out.println("miaw");
        }
    }

    static class Anjing extends Hewan {
        @Override
        void getSuara() {
            System.out.println("guk guk");
        }
    }


}