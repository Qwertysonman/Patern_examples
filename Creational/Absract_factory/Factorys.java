package paterns.Creational.Absract_factory;

class Factory_rus implements factory {
    @Override
    public engin create_engin() {
        return new Engin_rus();
    }
    @Override
    public car create_car(engin engin) {
        return new Car_rus();
    }
}
class Factory_jap implements factory {
    @Override
    public engin create_engin() {
        return new Engin_jap();
    }
    @Override
    public car create_car(engin engin) {
        return new Car_jap();
    }
}