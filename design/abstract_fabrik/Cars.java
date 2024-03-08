package paterns.design.abstract_fabrik;

class Cars_Rus implements Car{
    public void releasecar(engin engin) {
        engin.releaseengin();
        System.out.println("Русский автомобиль реализован");
    }
}

class Cars_Jap implements Car{
    public void releasecar(engin engin) {
        engin.releaseengin();
        System.out.println("Японский автомобиль реализован");
    }
}