package paterns.design.builder;

public class Clients_Builder{
    private String name;
    private String surname;
    private int age;
    private String mam_number;
    private String work_book;
    public Clients_Builder setname(String name){
        this.name = name;
        return this;
    }
    public Clients_Builder setsurename(String surname){
        this.surname = surname;
        return this;
    }
    public Clients_Builder setage(int age){
        this.age = age;
        return this;
    }
    public Clients_Builder setmam_number(String mam_number){
        this.mam_number = mam_number;
        return this;
    }
    public Clients_Builder setwork_book(String work_book){
        this.work_book = work_book;
        return this;
    }
    public Clients build(){
        return new Clients(name, surname, age, mam_number, work_book);
    }

}
