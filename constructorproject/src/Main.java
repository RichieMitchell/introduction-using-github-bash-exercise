public  class Main {

    public static void main(String[] args)
    {




        Alcohol c =new Alcohol();
        c.info = "The beverage is Alcohol and it is blue hypnotic.";


        Alcohol c2 = new Alcohol();
       // c2.info = String.valueOf(22);
        //c2.info = String.valueOf(22);
                    System.out.println(""+ c.info + "it is age" +c2.info + "years");

                    Beverage c3 = new Beverage("coolata","Coffee");
                    System.out.println("The beverage company is called "+ new Beverage());
        System.out.println("The beverage style is called "+ c3.Brandname+"it is a type of"+c3.BeverageType);
                    Beverage c4 = new Beverage(false,900,"purple");

                    if(c4.good==false)
                    {
                        System.out.println("You can't drink beverage c4 so why do you need the info for it?");
                    }
                    else
                    {
                        System.out.println("The calories are"+c4.getCalories()+"The color is purple"+c4.color());
                    }

    }

}
