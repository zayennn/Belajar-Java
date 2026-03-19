import java.util.HashMap;

public class Main {
    static class User<U> {
        private U name;
        private U age;

        User(U name, U age) {
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

    public static void main(String[] args) {
        HashMap<String, User<?>> users = new HashMap<>();

        User<Integer> user1 = new User<>("zayen", 19);

        users.put("user1", user1);

        users.get("user1").getInfo();
    }
}