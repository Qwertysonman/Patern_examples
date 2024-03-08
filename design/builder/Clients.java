package paterns.design.builder;

public class Clients {
    private final String name;
    private final String surname;
    private final int age;
    private final String mam_number;
    private final String work_book;

    public Clients(String name, String surname, int age, String mam_number, String work_book){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.mam_number = mam_number;
        this.work_book = work_book;
    }

    public static Clients_Builder builder(){
        return new Clients_Builder();
    }
    public void print(){
        System.out.println(this.name + " " + this.surname + " " + this.age + " " + this.mam_number + " " + this.work_book);
    }
}
