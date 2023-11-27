import java.util.Scanner;
public class uppgift1 {
    public static void main(String args[]){
        Scanner tb = new Scanner (System.in);

        System.out.println("Uppgift A");

        int varv=0;
        while(varv<6){
            System.out.println(varv);
            varv++;
        }

        System.out.println("");
        System.out.println("Uppgift B");
        int varv2=2;
        while(varv2<6){
            System.out.println(varv2);
            varv2++;
        }

        System.out.println("");
        System.out.println("Uppgift C");

        for(int varv3=0; varv3<6; varv3++){
            System.out.println(varv3);
        }

        System.out.println("");
        System.out.println("Uppgift D");
        int varv4=2;
        do{
         System.out.println(varv4);
         varv4++;
        }while(varv4<6);

        System.out.println("");
        System.out.println("Uppgift E");
        int varv5=5;
        while(varv5>=0){
            System.out.println(varv5);
            varv5--;
        }

        System.out.println("");
        System.out.println("Uppgift F");
        for(int varv6=5; varv6>=0; varv6--){
            System.out.println(varv6);
        }

        System.out.println("");
        System.out.println("Uppgift G");
        int[] fält = new int[5];  
        System.out.println("Skriv fem nummer: ");  

        for(int i=0; i<5; i++){   
        fält[i]=tb.nextInt();  
        }

        for(int i=0; i<5; i++){
            System.out.print(fält[i]+" ");
        }

        System.out.println("");
        System.out.println("Uppgift H");

        for(int i=4; i>=0; i--){
            System.out.print(fält[i]+" ");
        }

    }
}
