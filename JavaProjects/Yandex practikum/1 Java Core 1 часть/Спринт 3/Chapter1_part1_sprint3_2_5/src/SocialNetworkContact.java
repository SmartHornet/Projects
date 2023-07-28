// ”наследуйте класс от базового класса, описывающего контакт Contact
public class SocialNetworkContact extends Contact {
    private final String socialNetwork;
    private final String username;

    public SocialNetworkContact(String name, String socialNetwork, String username) {
        super(name);
        this.socialNetwork = socialNetwork;
        this.username = username;
    }

    public String getSocialNetwork() {
        return socialNetwork;
    }

    public String getUsername() {
        return username;
    }

    // ћетод sendMessage переопредел¤ет метод базового класса
    @Override
    public void sendMessage() {
        System.out.println("ќтправим забавный стикер одногруппнику в соцсети " + socialNetwork + ", им¤ пользовател¤ " + username);
    }

    @Override
    public void print() {
        System.out.println("—оциальна¤ сеть: " + socialNetwork);
        System.out.println("»м¤ пользовател¤: " + username);
    }
}