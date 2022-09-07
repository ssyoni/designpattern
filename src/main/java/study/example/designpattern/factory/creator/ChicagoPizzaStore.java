package study.example.designpattern.factory.creator;

import study.example.designpattern.factory.product.Pizza;
import study.example.designpattern.factory.product.PizzaType;
import study.example.designpattern.factory.product.newyork.ChicagoStyleCheesePizza;
import study.example.designpattern.factory.product.newyork.ChicagoStylePepperoniPizza;
import study.example.designpattern.factory.product.newyork.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(PizzaType type) {
        Pizza pizza = null;

        switch (type){
            case CHEESE -> pizza = new ChicagoStyleCheesePizza();
            case VEGGIE -> pizza = new ChicagoStyleVeggiePizza();
            case PEPPERONI -> pizza = new ChicagoStylePepperoniPizza();
        }

        return pizza;
    }
}
