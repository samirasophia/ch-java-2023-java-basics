import java.util.Scanner;
public class meow {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("zahl 1");
        double zahl1 = sc.nextDouble();
        System.out.println("zahl 2");
        double zahl2 = sc.nextDouble();
        if(zahl1>zahl2){
double sum = substract(zahl1, zahl2);
        } else {
            double sum = add(zahl1,zahl2);
        }
    }
    public static double substract(double x, double y){
double zahl3 = x - y;
return zahl3;}
    public static double add(double x, double y){
        double zahl3 = x + y;
        return zahl3;}
}
