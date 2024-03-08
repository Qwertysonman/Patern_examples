package paterns.Creational.Absract_factory;

class Car_rus implements car {
    @Override
    public void represent_car(engin engin) {
        engin.represent_engin();
        System.out.println("Русская машина представлена");
    }
}

class Car_jap implements car {
    @Override
    public void represent_car(engin engin) {
        engin.represent_engin();
        System.out.println("Японская машина представлена");
    }
}