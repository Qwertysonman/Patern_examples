package paterns.Creational.Absract_factory;

class Engin_rus implements engin{
    @Override
    public void represent_engin() {
        System.out.println("Русский двигатель представлен");
    }
}
class Engin_jap implements engin{
    @Override
    public void represent_engin() {
        System.out.println("Японский двигатель представлен");
    }
}