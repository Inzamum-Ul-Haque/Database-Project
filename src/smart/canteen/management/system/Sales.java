
package smart.canteen.management.system;


class Sales {
    
    private String date;
    int id,totalcash;
    
    public Sales(int id, String date, int totalcash){
        
        this.id= id;
        this.date=date;
        this.totalcash = totalcash;
    }
    
    public int getId(){
        return id;
    }
    
    public String getDate(){
        return date;
    }
    
    public int totalcash(){
        return totalcash;
    }
    
}
