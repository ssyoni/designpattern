package study.example.designpattern.factory.creator;

import study.example.designpattern.factory.product.Pizza;
import study.example.designpattern.factory.product.PizzaType;
import study.example.designpattern.factory.product.chicago.NYStyleCheesePizza;
import study.example.designpattern.factory.product.chicago.NYStylePepperoniPizza;
import study.example.designpattern.factory.product.chicago.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(PizzaType type) {
        Pizza pizza = null;

        switch (type){
            case CHEESE -> pizza = new NYStyleCheesePizza();
            case PEPPERONI -> pizza = new NYStyleVeggiePizza();
            case VEGGIE -> pizza = new NYStylePepperoniPizza();
        }

        return pizza;
    }
}
