/*
 @author Myvin Barboza
 27/04/20 2:26 PM 
 */public class Power {



    static int raiseToPower(int number,int power){
        if (power!=0){
            return number * raiseToPower(number,power-1);
        }
        else{
            return 1;
        }



    }


     public static void main(String[] args) {
         System.out.println(raiseToPower(2,3));
    }
}