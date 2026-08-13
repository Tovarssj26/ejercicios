/*Resuelva el problema que tienen en una gasolinera. Los surtidores de la misma registran lo que
surten en galones, pero el precio de la gasolina está fijado en litros. Se requiere que calcule y muestre
lo que hay que cobrarle a un cliente, considerando que: (a) cada galón tiene 3.785 litros; (b) el precio
del litro es de 100 Bolívares.*/
public class dieciocho {
    public static void main(String[] args) {
        double galonesSurtidos = 10.0; // Cantidad de galones surtidos
        double litrosPorGalon = 3.785; // Litros por galón
        double precioPorLitro = 100.0; // Precio del litro en Bolívares

        double litrosSurtidos = galonesSurtidos * litrosPorGalon; // Convertir galones a litros
        double montoTotal = litrosSurtidos * precioPorLitro; // Calcular el monto total a cobrar

        System.out.println("Cantidad de galones surtidos: " + galonesSurtidos);
        System.out.println("Cantidad de litros surtidos: " + litrosSurtidos);
        System.out.println("Monto total a cobrar: " + montoTotal + " Bolívares");
    }
    
}
