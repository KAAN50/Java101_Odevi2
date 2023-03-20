import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a , b, c ;
        double d;
        double alan;
        double cevre;

        Scanner ilkKenar = new Scanner(System.in);
        System.out.println("Ilk Kenari Gir: ");
        a=ilkKenar.nextInt();

        Scanner ikinciKenar = new Scanner(System.in);
        System.out.println("Ilk Kenari Gir: ");
        b=ikinciKenar.nextInt();

        Scanner ucuncuKenar = new Scanner(System.in);
        System.out.println("Ilk Kenari Gir: ");
        c=ucuncuKenar.nextInt();

        d= (a+b+c)/2;

        cevre=2*d;

        alan=d*(d-a)*(d-b)*(d-c);

        System.out.println("Ucgenin Cevresi: "+ cevre );

        System.out.println("Ucgenin Alani: "+alan );


    }
}