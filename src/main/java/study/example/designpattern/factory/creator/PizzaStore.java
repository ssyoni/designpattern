package study.example.designpattern.factory.creator;

import study.example.designpattern.factory.product.Pizza;
import study.example.designpattern.factory.product.PizzaType;

public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType type){

        System.out.println("=========주문 받았습니다========");
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(PizzaType type); // 팩토리 메소드 선언
}
