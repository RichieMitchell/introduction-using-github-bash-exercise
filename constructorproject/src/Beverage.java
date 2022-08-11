public class Beverage {


    // public  String Brandname;
    String BeverageType;
    
   String Brandname="beverages x inc";
    private String name;

    private int calories;

    private String color;

    boolean good = true;


   public void SayBeverageType()
   {
       System.out.println("The beverage type is Normal");
   }


    public Beverage(boolean good, int calories, String color) {
        this.good = good;
        this.calories = calories;
        this.color = color;
    }
    
    public Beverage(String Brandname, String BeverageType){
        this.Brandname = Brandname;
        this.BeverageType = BeverageType;
    }

    public Beverage() {

    }

    //  public Beverage() {

  //  }

    public  String getName() {
       return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void SetCalories(int calories){
        this.calories = calories;
    }

    public String color(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
}






