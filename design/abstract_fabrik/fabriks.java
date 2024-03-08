package paterns.design.abstract_fabrik;

class rus_fabrik implements fabrik{
    public engin createEngin(){
        return new Engins_Rus();
    }
    public Car createCar(){
        return new Cars_Rus();
    }
}

class jap_fabrik implements fabrik{
    public engin createEngin(){
        return new Engins_Jap();
    }
    public Car createCar(){
        return new Cars_Jap();
    }
}