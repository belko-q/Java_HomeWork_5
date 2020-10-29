package academy.belhard;
import academy.belhard.entity.*;


public class Main {

    public static void main(String[] args) {

        User user1 = new User("Tom", "Hardy", "tom.hardy@mail.ru", "qwerty");

        user1.getFullInfo();
        user1.isPasswordCorrect("qwerty");
        user1.isPasswordCorrect("Qwerty");


    }
}
