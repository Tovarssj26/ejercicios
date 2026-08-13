public class sextoejercicio {
    public static void main(String[] args) {
        double porcentaje1;
        double porcentaje2;
        double resultado;
        double hombres;
        double mujeres;

        System.out.println("escriba el numero de hombres");
        hombres = Double.parseDouble(System.console().readLine());
        System.out.println("escriba el numero de mujeres");
        mujeres = Double.parseDouble(System.console().readLine());
        resultado = (hombres * 100) / (hombres + mujeres);
        porcentaje2 = (mujeres * 100) / (hombres + mujeres);
        System.out.println("el porcentaje de hombres es: " + resultado);
        System.out.println("el porcentaje de mujeres es: " + porcentaje2);



}}
