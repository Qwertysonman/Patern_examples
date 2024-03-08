package paterns.Creational.Builder;

public class lessons {
    public Client children_math(String name, String surname, int age, String mum_number){
        return Client.builder().set_name(name).set_surname(surname).set_age(age).set_mam_phone_number(mum_number)
                .build();
    }
    public Client adult_math(String name, String surname, int age, String number){
        return Client.builder().set_name(name).set_surname(surname).set_age(age).set_phone_number(number)
                .build();
    }
    public Client teenager_math(String name, String surname, int age, String number, String mum_number){
        return Client.builder().set_name(name).set_surname(surname).set_age(age).set_phone_number(number)
                .set_mam_phone_number(mum_number).build();
    }
}
