public class octavoejercicio {
    public static void main(String[] args) {
        double area;
        double resultado;
        double a;
        double b;
        double c;
        double p;


        System.out.println("ingrese el area");
        area = Double.parseDouble(System.console().readLine());
        System.out.println("ingrese el valor de a");
        a = Double.parseDouble(System.console().readLine());
        System.out.println("ingrese el valor de b");
        b = Double.parseDouble(System.console().readLine());
        System.out.println("ingrese el valor de c");
        c = Double.parseDouble(System.console().readLine());
        p = (a + b + c) / 2;
        resultado = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("el resultado es: " + resultado);





}}
