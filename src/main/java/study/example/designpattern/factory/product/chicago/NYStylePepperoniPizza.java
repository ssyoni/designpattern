package study.example.designpattern.factory.product.chicago;

import study.example.designpattern.factory.product.Pizza;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        name = "My Style Sauce and Pepperoni Pizza";
        dough = "Extra Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Salami");
    }
}
