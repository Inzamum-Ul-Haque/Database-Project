/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart.canteen.management.system;

public class Customer {

    String name, address;
    int csId, phone, rId, totalcash;

    public Customer(int csId, String name, String address, int phone, int rId, int totalCash) {

        this.csId = csId;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.rId = rId;
        this.totalcash = totalCash;
    }

    public int getcsId() {

        return csId;
    }

    public String getName() {

        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }

    public int getrId() {
        return rId;
    }

    public int getTotalCash() {
        return totalcash;
    }
}
