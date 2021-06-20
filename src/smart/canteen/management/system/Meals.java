
package smart.canteen.management.system;


class Meals {
    
    private String id,name;
    int available,price;
    
    public Meals(String id, String name, int available,int price){
        
        this.id= id;
        this.name= name;
        this.available = available;
        this.price = price;
    }
    
    public String getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAvailable(){
        return available;
    }
    
    public int getprice(){
        return price;
    }
    
}
