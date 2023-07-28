// Дополните объявление класса Contact
public abstract class Contact {
    // Класс должен содержать одно поля - имя пользователя name
    private String name;

    public Contact(String name) {
        this.name = name;
    }

    abstract void sendMessage();

    abstract void print();

    public String getName(){
        return name;
    }

    // И два метода -  для отправки сообщения и  для печати информации о контакте
    
}