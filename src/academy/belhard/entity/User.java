package academy.belhard.entity;

public class User extends Person {
    private String email;
    private String password;

    public User(String firstName, String lastName, String email, String password) {
        super(firstName, lastName);
        this.email = email;
        this.password = password;

    }


    public void getFullInfo(){

        System.out.println("Имя: " + super.getFullName() + "\n" + "E-mail: " + email);


    }

    public boolean isPasswordCorrect(String password){
        boolean submitPassword = false;
        if (this.password.equals(password)) {
            submitPassword = true;
        }
        System.out.println(submitPassword);
        return submitPassword;
    }

}
