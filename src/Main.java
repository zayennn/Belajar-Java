import java.util.HashMap;

public class Main {
    static class User<U> {
        private U name;
        private U age;

        User(U name, U age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> user = new HashMap<>();

        user.put("zayen", 19);

        System.out.println(user);
    }
}