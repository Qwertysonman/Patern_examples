package paterns.Creational.Builder;

public class main_builder {
    public static void main(String[] args) throws Exception {
        lessons lessons = new lessons();
        Client client_1 = lessons.children_math("Коля", "Колин", 6, "+7-966-849-43-41");
        Client client_2 = lessons.teenager_math("Боб", "Губка", 15, "+7-986-008-12-21",
                "+7-907-911-76-16");
        Client client_3 = lessons.adult_math("Толя", "Кукушкин", 46, "+7-916-199-93-29");

        client_1.show_info();
        client_2.show_info();
        client_3.show_info();
    }
}
