public class primerejercicio {
    public static void main(String[] args) {

        int edad1;
        int edad2;
        int edad3;
        int resultado;

        System.out.println("coloque la primera edad:");
        edad1 = Integer.parseInt(System.console().readLine());

        System.out.println("coloque la segunda edad:");
        edad2 = Integer.parseInt(System.console().readLine());

        System.out.println("coloque la tercera edad:");
        edad3 = Integer.parseInt(System.console().readLine());

        resultado = (edad1 + edad2 + edad3) / 3;
        System.out.println("El promedio de las edades es: " + resultado);
    }
}