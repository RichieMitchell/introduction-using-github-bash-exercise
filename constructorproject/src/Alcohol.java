public class Alcohol extends Beverage{
    //public String name;

    String info = "the stuff";



    public void SayBeverageType()
    {
        System.out.println("The beverage type is Alcohol");
    }




    public void info(String info)
    {

        this.info=info;
    }


    public void info(int info)
    {

        this.info= String.valueOf(info);
    }




    public void Beverage(String BrandnameAlcohols, String BeverageAlcoholTypes){
      //  super();
        super.Brandname = BrandnameAlcohols;
        super.BeverageType = BeverageAlcoholTypes;
    }





}





  //  public  String getName(){

    //    return name;
   // }

  //  public void setName(String name){

   //     this.name = name;

   // }


     //   }


