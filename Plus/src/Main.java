public class Main {
    public static void main(String[] args) {

        for(int i=1; i<=3; i++){
            for(int j=1; j<=5; j++){
                if(i==3 || j==5){
                    System.out.print("*" + " ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        for(int i=1; i<=2; i++){
            for(int j=1; j<=5; j++){
                if(j==5){
                    System.out.print("*" + " ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}