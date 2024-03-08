package paterns;

import paterns.design.builder.Amenities;
import paterns.design.builder.Clients;

public class mainclass {
    public static void main(String[] args) throws Exception {
        Amenities amenities = new Amenities();
        Clients client1 = amenities.hobbyhorsing("Ваня", "Дуркин", 7);
        Clients client2 = amenities.horsing("Оля", "Картавая", 14, "+7-977-364-25-11");
        Clients client3 = amenities.caring_for_horses("Толя", "Кукушкин", 39, "+7-955-666-54-70", "7654367865457");
    }
}
