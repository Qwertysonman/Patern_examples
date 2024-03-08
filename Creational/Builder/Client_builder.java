package paterns.Creational.Builder;

public class Client_builder {
    private String name;
    private String surname;
    private int age;
    private String phone_number;
    private String mam_phone_number;

    public Client_builder set_name (String name){
        this.name = name;
        return this;
    }
    public Client_builder set_surname (String surname){
        this.surname = surname;
        return this;
    }
    public Client_builder set_age (int age){
        this.age = age;
        return this;
    }
    public Client_builder set_phone_number (String phone_number){
        this.phone_number = phone_number;
        return this;
    }
    public Client_builder set_mam_phone_number (String mam_phone_number){
        this.mam_phone_number = mam_phone_number;
        return this;
    }
    public Client build(){
        return new Client(name, surname, age, phone_number, mam_phone_number);
    }

}
