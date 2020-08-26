package Office_Hours.Practice_19_08;
 /*Create a class named Pizza that stores information about a single pizza.
        Attributes:
        size, NumOfCheeseTopping, NumOfPepperoniTopping
        Actions:
        set(): sets all info of the pizza
        calcCost(): calculates the price and returns it as double
        toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()
        Pizza cost is determined by:
        Small: $10 + $2 per topping
        Medium: $12 + $2 per topping
        Large: $14 + $2 per topping

  */
public class Pizza {

    String size;
    int numOfCheeseTopping;
    int numOfPepperoniTopping;

    public void setPizzaInfo(String size, int numOfCheeseTopping, int numOfPepperoniTopping){
        this.size = size;
        this.numOfCheeseTopping = numOfCheeseTopping;
        this.numOfPepperoniTopping = numOfPepperoniTopping;

    }

    public double calcPrice(){
        int totalNumberOfTopping = numOfCheeseTopping + numOfPepperoniTopping;
        double totalPriceOfTopping = totalNumberOfTopping * 2;
        double totalPrice = totalPriceOfTopping;

        if (size.equalsIgnoreCase("small")){
            totalPrice += 10;
        }else if (size.equalsIgnoreCase("medium")){
            totalPrice += 12;
        }else{
            totalPrice+=14;
        }

        return totalPrice;
    }

    public String toString(){  // PRINT WAY        toString method returns String at the end
        return "Size: " + size+"\nNumber of Cheese Topping: "+numOfCheeseTopping
                + "\nNumber of Pepperoni Topping: "+numOfPepperoniTopping
                + "\nTotal Price: "+calcPrice();
    }
}
