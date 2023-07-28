public class Main {
    public static void main(String[] args) {

        Address address = new Address("address", "Нижневартовск", "Индустриальная");
        Email email = new Email("email", "shdg@xjd.ru");
        Phone phone = new Phone("phone","+7465646864");
        SocialNetworkContact socialNetworkContact
                = new SocialNetworkContact("socialNetworkContact","VK","Мяка");

        ContactBook<Contact> contactBook = new ContactBook<>();
        contactBook.addContact(address);
        contactBook.addContact(email);
        contactBook.addContact(phone);
        contactBook.addContact(socialNetworkContact);

        contactBook.printList();

        contactBook.congratulate("email");


        contactBook.congratulate("2mail");

    }
}