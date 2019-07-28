package fanXing;

import java.lang.reflect.Array;
import java.util.Arrays;

public class User implements Comparable<User> {
    private String usernname;
    private int age;

    public User(String usernname, int age) {
        this.usernname = usernname;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return usernname + ": " + age;
    }

    public int compareTo(User obj) {
        return this.age - obj.age;
    }

    public static void main(String[] args) {
        User[] users = {new User("curry", 20), new User("kd" ,30)};
        Arrays.sort(users);
        for (User user: users) {
            System.out.println(user.toString());
        }
    }
}
