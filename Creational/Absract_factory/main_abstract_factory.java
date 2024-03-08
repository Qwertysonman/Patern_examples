package paterns.Creational.Absract_factory;

public class main_abstract_factory {
    public static void main(String[] args) throws Exception {
        Factory_jap jap_factory = new Factory_jap();
        Factory_rus rus_factory = new Factory_rus();

        engin jap_engin_1 = jap_factory.create_engin();
        car jap_car_1 = jap_factory.create_car(jap_engin_1);
        jap_car_1.represent_car(jap_engin_1);

        engin rus_engin_1 = rus_factory.create_engin();
        car rus_car_1 = rus_factory.create_car(rus_engin_1);
        rus_car_1.represent_car(rus_engin_1);
    }
}
