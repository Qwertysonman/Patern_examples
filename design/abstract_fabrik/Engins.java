package paterns.design.abstract_fabrik;

class Engins_Rus implements engin {
    public void releaseengin() {
        System.out.println("Российский двигатель реализован");
    }
}

class Engins_Jap implements engin {
    public void releaseengin() {
        System.out.println("Японский двигатель реализован");
    }
}