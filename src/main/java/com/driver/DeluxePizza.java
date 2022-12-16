package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);

        // call directly so if in future same method will be present in this class then it will call
        // first that if not present then it will go to parent class.
        addExtraCheese();
        addExtraToppings();

//        // this is also correct
//        super.addExtraCheese();
//        super.addExtraToppings();

//        //this is also correct
//        this.addExtraCheese();
//        this.addExtraToppings();
    }
}
