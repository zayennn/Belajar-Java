import java.util.ArrayList;

public class Main {
    static class User {
        private String name;
        private int age;

        User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void getInfo() {
            System.out.printf("""
                    Name    : %s
                    Age     : %d
                    """, name, age);
        }
    }

    public static void main(String[] args)
}