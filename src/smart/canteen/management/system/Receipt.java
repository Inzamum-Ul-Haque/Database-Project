/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart.canteen.management.system;

/**
 *
 * @author Sanjida Islam
 */
public class Receipt {

    String Ordered_Meal_Name;
    int Receipt_Id, Unit_Cost, No_of_items, Subtotal;

    public Receipt(int Receipt_Id, String Ordered_Meal_Name, int Unit_Cost, int No_of_items, int Subtotal) {

        this.Receipt_Id = Receipt_Id;
        this.Ordered_Meal_Name = Ordered_Meal_Name;

        this.Unit_Cost = Unit_Cost;
        this.No_of_items = No_of_items;
        this.Subtotal = Subtotal;
    }

    public int getReceipt_Id() {
        return Receipt_Id;
    }

    public String getOrdered_Meal_Name() {

        return Ordered_Meal_Name;
    }

    public int getUnit_Cost() {

        return Unit_Cost;
    }

    public int getNo_of_items() {

        return No_of_items;
    }

    public int getSubtotall() {

        return Subtotal;
    }
}
