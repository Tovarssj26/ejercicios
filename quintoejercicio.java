public class quintoejercicio {
    public static void main(String[] args) {
        double parcial1;
        double parcial2;
        double parcial3;
        double promedio;
        double examenfinal;
        double trabajofinal;
        double resultado;

        System.out.println("ingrese el primer parcial");
        parcial1 = Double.parseDouble(System.console().readLine());
        System.out.println("ingrese el segundo parcial");
        parcial2 = Double.parseDouble(System.console().readLine());
        System.out.println("ingrese el tercer parcial");
        parcial3 = Double.parseDouble(System.console().readLine());
        System.out.println("ingrese el examen final");
        examenfinal = Double.parseDouble(System.console().readLine());
        System.out.println("ingrese el trabajo final");
        trabajofinal = Double.parseDouble(System.console().readLine());
        promedio = (parcial1 + parcial2 + parcial3) /3;
        resultado = (promedio * 0.55) + (examenfinal * 0.30) + (trabajofinal * 0.15);
        System.out.println("el resultado es: " + resultado);





}}
