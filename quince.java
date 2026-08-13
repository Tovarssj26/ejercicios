/*Calcular y mostrar el monto total a pagar en un mes de luz eléctrica, teniendo como dato la lectura
anterior, la lectura actual y el costo por kilovatio.*/
public class quince {
public static void main(String[] args) {
    
    double lecturaAnterior;
    double lecturaActual;
    double costoPorKilovatio;
    double consumo;
    double montoTotal;

    System.out.println("Ingrese la lectura anterior del medidor de luz eléctrica:");
    lecturaAnterior = Double.parseDouble(System.console().readLine());

    System.out.println("Ingrese la lectura actual del medidor de luz eléctrica:");
    lecturaActual = Double.parseDouble(System.console().readLine());

    System.out.println("Ingrese el costo por kilovatio:");
    costoPorKilovatio = Double.parseDouble(System.console().readLine());

    consumo = lecturaActual - lecturaAnterior;
    montoTotal = consumo * costoPorKilovatio;

    System.out.println("El consumo de energía eléctrica es: " + consumo + " kWh");
    System.out.println("El monto total a pagar es: $" + montoTotal);
    
}    
}
