//invertir un numero
import java.util.Scanner;
public class inDigito {
    public static void main (String [] args) {
        int num, inv = 0, resto;
        Scanner read = new Scanner(System.in);
        System.out.print("introduzca un numero ");
        num= read.nextInt();
        while (num>0){
            resto=num%10;
            inv=inv*10+resto;
            num/=10;
        }
        System.out.println("Numero invertido es: "+inv);
    }

}






