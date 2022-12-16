package com.driver;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;

    private int CheesePrice;

    private int ToppingsPrice;

    private int TakeawayPrice;

    private boolean isBillGenerated;

    private boolean isCheeseadded;
    private boolean isToppingsadded;
    private boolean isTakeawayadded;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.CheesePrice = 80;
        this.TakeawayPrice = 20;

        if(isVeg == true){
            this.price = 300;
            this.ToppingsPrice = 70;
        }
        else{
            this.price = 400;
            this.ToppingsPrice = 120;
        }

        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
        this.isCheeseadded = false;
        this.isTakeawayadded = false;
        this.isToppingsadded = false;
        this.isBillGenerated = false;

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(isCheeseadded == false)
            this.price = this.price + CheesePrice;
        isCheeseadded = true;
    }

    public void addExtraToppings(){
        if(isToppingsadded == false)
            this.price = this.price+ ToppingsPrice;
        isToppingsadded = true;

    }

    public void addTakeaway(){
        if(isTakeawayadded == false)
            this.price =this.price + TakeawayPrice;
        isTakeawayadded = true;

    }

    public String getBill(){
        if(isBillGenerated == false){
            if(isCheeseadded == true){
                this.bill = this.bill+"Extra Cheese Added: "+this.CheesePrice+"\n";
            }
            if(isToppingsadded == true){
                this.bill = this.bill + "Extra Toppings Added: "+this.ToppingsPrice+"\n";
            }
            if(isTakeawayadded == true){
                this.bill = this.bill+"Paperbag Added: "+this.TakeawayPrice+"\n";
            }
            this.bill = this.bill+"Total Price: "+ this.price+"\n";
        }
        isBillGenerated = true;
        return this.bill;
    }
}
