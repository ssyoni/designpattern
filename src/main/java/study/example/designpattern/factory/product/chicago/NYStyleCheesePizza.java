package study.example.designpattern.factory.product.chicago;

import study.example.designpattern.factory.product.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "My Style Sauce and Cheese Pizza";
        dough = "Extra Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }
}
