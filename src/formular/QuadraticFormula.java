package formular;

import java.util.Scanner;

public class QuadraticFormula {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,c;
        System.out.println("The quadratic formula finds the root (s)\n"+"where f(x)=0 " +
                "for the function f(x)=X^2+ax+c\n");
        System.out.println("Enter a:");
        a=sc.nextDouble();
        System.out.println("Enter b:");
        b=sc.nextDouble();
        System.out.println("Enter c:");
        c=sc.nextDouble();
        double dis;
        dis=Math.pow(b,2)-(4*a*c);
        double root1,root2;
        double image;
        if (dis>=0){

          root1= ((-1*b)+Math.sqrt(dis))/(2*a) ;
          root2=  ((-1*b)-Math.sqrt(dis))/(2*a);
            System.out.println("Two real roots"+root1+"and "+root2);}
        else if (dis<0){

        image=Math.sqrt(-1*dis)/(2*a);
        System.out.println("Two imaginary roots  are:"+(-b)/(2*a)+ "or -i"+image); }
        else {
            root1=-b/(2*a);
            System.out.println("One real root"+root1);
        }


    }
}
