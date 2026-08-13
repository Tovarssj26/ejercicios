/*Calcule qué tanto por ciento anual cobraron por un préstamo de Bolívares X, si se pagaron Bolívares
Y de intereses en 4 años. La fórmula del interés es:
Capital. Tiempo. Razón
I = ------------------------------
100*/
public class veinte {
public static void main(String[] args) {
    double capital;
    double tiempo;
    double interes;
    double razon;

    System.out.println("Ingrese el capital prestado (Bolívares):");
    capital = Double.parseDouble(System.console().readLine());

    System.out.println("Ingrese el interés pagado (Bolívares):");
    interes = Double.parseDouble(System.console().readLine());

    tiempo = 4; // Tiempo en años

    razon = (interes * 100) / (capital * tiempo);

    System.out.println("El porcentaje anual cobrado por el préstamo es: " + razon + "%");
    }
}
