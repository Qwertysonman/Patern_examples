package paterns.design.abstract_fabrik;

public class main_abstrat_fab {
    public static void main(String[] args) throws Exception {
        jap_fabrik fab_jap = new jap_fabrik();
        rus_fabrik fab_rus = new rus_fabrik();

        engin jap_engin = fab_jap.createEngin();
        Car jap_car = fab_jap.createCar();
        jap_car.releasecar(jap_engin);

        engin rus_engin = fab_rus.createEngin();
        Car rus_car = fab_rus.createCar();
        rus_car.releasecar(rus_engin);
    }
}
