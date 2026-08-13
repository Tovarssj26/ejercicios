/*El siguiente sistema de ecuaciones lineales:
aX + bY = c
dX + eY = f

se resuelve con las fórmulas:
ce - bf af - cd
X = --------- Y = --------- calcule y muestre el valor de X e Y.
ae – bd ae – bd*/
public class catorce {
public static void main(String[] args) {
    
    double a;
    double b;
    double c;
    double d;
    double e;
    double f;
    double X;
    double Y;

    System.out.println("Ingrese el valor de a:");
    a = Double.parseDouble(System.console().readLine());

    System.out.println("Ingrese el valor de b:");
    b = Double.parseDouble(System.console().readLine());

    System.out.println("Ingrese el valor de c:");
    c = Double.parseDouble(System.console().readLine());

    System.out.println("Ingrese el valor de d:");
    d = Double.parseDouble(System.console().readLine());

    System.out.println("Ingrese el valor de e:");
    e = Double.parseDouble(System.console().readLine());

    System.out.println("Ingrese el valor de f:");
    f = Double.parseDouble(System.console().readLine());

    X = (c * e - b * f) / (a * e - b * d);
    Y = (a * f - c * d) / (a * e - b * d);

    System.out.println("El valor de X es: " + X);
    System.out.println("El valor de Y es: " + Y);
    



 
    











}
}














