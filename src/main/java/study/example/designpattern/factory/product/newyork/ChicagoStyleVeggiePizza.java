package study.example.designpattern.factory.product.newyork;

import study.example.designpattern.factory.product.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        name = "My Style Sauce and Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Tomato Sauce";

        toppings.add("콩 Cheese");
        toppings.add("파프리카");
        toppings.add("콩나물");
    }
}
