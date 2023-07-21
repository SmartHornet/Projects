// ”наследуйте класс от базового класса, описывающего контакт Contact
public class Email ... {
    private final String email;

    public Email(String name, String email) {
        ...
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    // ћетод sendMessage переопредел¤ет метод базового класса
    ...
    public void sendMessage() {
        System.out.println("ќтправим новогоднюю картинку коллеге на электронную почту " + email);
    }

    ...
    public void print() {
        System.out.println("Email: " + getEmail());
    }
}