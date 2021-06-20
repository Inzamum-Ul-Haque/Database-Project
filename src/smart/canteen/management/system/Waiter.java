
package smart.canteen.management.system;


class Waiter {
    
    private String id,name,address,date;
    int phoneNumber;
    
    public Waiter(String id, String name, String address, int phoneNumber, String date){
        
        this.id= id;
        this.name= name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.date=date;
    }
    
    public String getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public int getPhoneNumber(){
        return phoneNumber;
    }
    
    public String getDate(){
        return date;
    }
    
}
