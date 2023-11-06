import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
System.out.println("Hello, Java!");
Scanner sc = new Scanner(System.in);
       double sum = 0;
     double zahl1 = Rechner(sum);
        System.out.println("Deine erste Zahl ist: " + zahl1);
        double zahl2 = Rechner(sum);
        if (zahl1 < zahl2){
            System.out.println("Zahl " + zahl2 + " ist groesser als " + zahl1);
        }if (zahl1 > zahl2){
            System.out.println("Zahl " + zahl1 + " ist groesser als " + zahl2);
        }if (zahl1==zahl2){
            System.out.println("Zahl " + zahl2 + " ist gleich gross wie" + zahl1);
        }
    }
    public static double Rechner(double sum){
        Scanner sc = new Scanner(System.in);
        System.out.println("Gib eine Zahl an");
        double a = sc.nextDouble();
        System.out.println("Gib eine weitere Zahl an");
        double b = sc.nextDouble();
        System.out.println("Gib einen Rechenoperator an");
        sc.nextLine();
        String operator = sc.nextLine();
        if (operator.equalsIgnoreCase("plus")){
        sum = a + b;
        return sum;
    } else if (operator.equalsIgnoreCase("minus")){
        sum = a - b;
        return sum;
    } else if (operator.equalsIgnoreCase("geteilt")) {
            while (b==0) {
                System.out.println("invalid");
                System.out.println("Du kannst nicht mit 0 dividieren, gib eine neue zweite Zahl an");
                double c = sc.nextInt();
                b = c;
            }
                sum = a / b;

            return sum;
            }

     else if (operator.equalsIgnoreCase("mal")) {
        sum = a * b;
        return sum;
    }
     else {
        System.out.print("invalid");
        return 0;
    }}}

