import ratings.string;

public class criminal {

    public static String race ="black";
    public boolean toString;
    private int felonies;
    private int misdemeanors;
    private static String Firstname;
    private String lastname;
    private static boolean free;

    criminal(){}

  //  public static void main(String[]args){
     //   criminal c1 = new criminal("black",32, "Dexter");
     //   criminal c2 = new criminal("Italian", 900, "Capone");
    //    criminal c3 = new criminal("AllRacesMixed",70000,"Captain Pollution");

     //   System.out.println(c1);
     //   System.out.println(c2);
   // }

    criminal(String race,int felonies,String Firstname ){
        this.race = race;
        this.felonies= felonies;
        this.Firstname=Firstname;
    }

    public String toString(){

        return criminal.Firstname+"    "+criminal.race+"";
   }


  //  criminal(String newRace, int newFelonies, String newFirstname){
    //    race = newRace;
   //     felonies = newFelonies;
    //    Firstname = newFirstname;
   // }


    public static void Fight_Criminal(){

    }


    public static void OpenGate() {

    boolean free = true;

    }


    public static void CloseGate(){

        if(free==true){

    System.out.println("Hahaha  i'm free! you didn't catch me ! ");

        }
    }

}
