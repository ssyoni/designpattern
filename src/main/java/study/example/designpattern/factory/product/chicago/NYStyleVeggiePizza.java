package study.example.designpattern.factory.product.chicago;

import study.example.designpattern.factory.product.Pizza;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "My Style Sauce and Veggie Pizza";
        dough = "Extra Thin Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("파프리카");
        toppings.add("양상추");
        toppings.add("당근");
    }
}
