import java.util.Scanner;

public class Tag2 {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("gib zahl an");
        double zahl1 = sc.nextDouble();
      double meow = makepositive(zahl1);
        System.out.println(meow);
    }
    public static double makepositive(double x){
        if (x<0){
        double y = x-x-x-x;
        x = x+y;
        return x;}
        else {
        return x;}
    }
}
