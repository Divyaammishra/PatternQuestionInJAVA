import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //As we know that, rectangle's height and width are unequal, so we are taking two input.

        //Input for height
        System.out.print("Enter the height : ");
        int height = sc.nextInt(); // you can take input type as per your value

        //Input for width
        System.out.print("Enter the width : ");
        int width = sc.nextInt();

        //Outer loop for height
        for(int i=1; i<=height; i++){

            //Inner loop for width
            for(int j=1; j<=width; j++){
                //Giving condition to print star and space
                if(i==1 || j==1 || i==height || j==width){
                    System.out.print("*"); //print star
                }else{
                    System.out.print(" "); //print space
                }
            }
            System.out.println(); //taking next line
        }
    }
}