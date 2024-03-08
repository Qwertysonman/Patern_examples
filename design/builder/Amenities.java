package paterns.design.builder;

public class Amenities {
    public Clients hobbyhorsing(String name, String surname, int age){
        Clients cl = Clients.builder().setname(name).setsurename(surname).setage(age).build();
        cl.print();
        return cl;
    }
    public Clients horsing(String name, String surname, int age, String mam_number){
        Clients cl = Clients.builder().setname(name).setsurename(surname).setage(age).setmam_number(mam_number).build();
        cl.print();
        return cl;
    }
    public Clients caring_for_horses(String name, String surname, int age, String mam_number, String work_book){
        Clients cl = Clients.builder().setname(name).setsurename(surname).setage(age).setmam_number(mam_number).setwork_book(work_book).build();
        cl.print();
        return cl;
    }
}
