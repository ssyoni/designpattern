package study.example.designpattern.factory.product.newyork;

import study.example.designpattern.factory.product.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {

    public ChicagoStylePepperoniPizza(){
        name = "My Style Sauce and Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Tomato Sauce";

        toppings.add("파마산 Cheese");
    }
}
