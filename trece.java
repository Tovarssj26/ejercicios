public class trece {
public static void main(String[] args) {

double n1;
double n2;
double n3;
double n4;
double n5;
double n6;
double n7;
double n8;
double total;

System.out.println("ingrese numero de billetes de 50000");
n1=Double.parseDouble(System.console().readLine());
n1=n1*50000;

System.out.println("ingrese numero de billetes de 20000");
n2=Double.parseDouble(System.console().readLine());
n2=n2*20000;

System.out.println("ingrese numero de billetes de 10000");
n3=Double.parseDouble(System.console().readLine());
n3=n3*10000;
System.out.println("ingrese numero de billetes de 5000");
n4=Double.parseDouble(System.console().readLine());
n4=n4*5000;

System.out.println("ingrese numero de billetes de 2000");
n5=Double.parseDouble(System.console().readLine());
n5=n5*2000;

System.out.println("ingrese numero de billetes de 1000");
n6=Double.parseDouble(System.console().readLine());
n6=n6*1000;

System.out.println("ingrese numero de billetes de 500");
n7=Double.parseDouble(System.console().readLine());
n7=n7*500;
System.out.println("ingrese numero de billetes de 100");
n8=Double.parseDouble(System.console().readLine());
n8=n8*100;
total=n1+n2+n3+n4+n5+n6+n7+n8;
System.out.println("el total de dinero es"+total);





}


}
