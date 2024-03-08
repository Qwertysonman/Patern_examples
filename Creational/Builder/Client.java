package paterns.Creational.Builder;

public class Client {
    private final String name;
    private final String surname;
    private final int age;
    private final String phone_number;
    private final String mam_phone_number;
    public Client(String name, String surname, int age, String phoneNumber, String mamPhoneNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone_number = phoneNumber;
        this.mam_phone_number = mamPhoneNumber;
    }

    public void show_info(){
        System.out.println("name - " + name);
        System.out.println("surname - " + surname);
        System.out.println("age - " + age);
        System.out.println("phone_number - " + phone_number);
        System.out.println("mam_phone_number - " + mam_phone_number);
        System.out.println("-----------------------------------");
    }
    public static Client_builder builder(){
        return new Client_builder();
    }
}
