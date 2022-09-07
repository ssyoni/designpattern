package study.example.designpattern.factory.product;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    @Getter
    public String name;
    public String dough;
    public String sauce;
    public List<String> toppings = new ArrayList<>();

    public void prepare(){
        System.out.println("Preparing "+this.name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings : ");
        for (String topping:toppings) {
            System.out.println("  "+topping);
        }
    }

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

}
