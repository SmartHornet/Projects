// ”наследуйте класс от базового класса, описывающего контакт Contact
public class SocialNetworkContact ... {
    private final String socialNetwork;
    private final String username;

    public SocialNetworkContact(String name, String socialNetwork, String username) {
        ...
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
    ...
    public void sendMessage() {
        System.out.println("ќтправим забавный стикер одногруппнику в соцсети " + socialNetwork + ", им¤ пользовател¤ " + username);
    }

    ...
    public void print() {
        System.out.println("—оциальна¤ сеть: " + socialNetwork);
        System.out.println("»м¤ пользовател¤: " + username);
    }
}