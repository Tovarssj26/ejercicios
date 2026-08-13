/*Se conoce de un trabajador su nombre, el número de horas normales trabajadas, el pago de una hora
normal y el número de horas extras trabajadas. Además, que, cada hora extra se paga 25% más del
valor de una hora normal. Si se deducen al trabajador sobre el sueldo base 5% del paro forzoso, 2%
de política habitacional y 7% para caja de ahorro. Si se le asignan 25000 Bolívares por actualización
académica, 17300 Bolívares por cada hijo y una prima por hogar de 18000 Bolívares. Calcule y
muestre las asignaciones, las deducciones y el sueldo neto del trabajador.*/
public class once {
public static void main(String[] args) {
    
    String nombre;
    double horasNormales;
    double pagoHoraNormal;
    double horasExtras;
    double pagoHoraExtra;
    double sueldoBase;
    double deduccionParoForzoso;
    double deduccionPoliticaHabitacional;
    double deduccionCajaAhorro;
    double asignacionActualizacionAcademica = 25000;
    double asignacionPorHijo = 17300;
    double asignacionPrimaHogar = 18000;
    double sueldoNeto;

    System.out.println("Ingrese el nombre del trabajador:");
    nombre = System.console().readLine();

    System.out.println("Ingrese el número de horas normales trabajadas:");
    horasNormales = Double.parseDouble(System.console().readLine());

    System.out.println("Ingrese el pago por hora normal:");
    pagoHoraNormal = Double.parseDouble(System.console().readLine());

    System.out.println("Ingrese el número de horas extras trabajadas:");
    horasExtras = Double.parseDouble(System.console().readLine());

    pagoHoraExtra = pagoHoraNormal * 1.25; // Pago por hora extra es 25% más que la hora normal
    sueldoBase = (horasNormales * pagoHoraNormal) + (horasExtras * pagoHoraExtra);

    deduccionParoForzoso = sueldoBase * 0.05; // 5% del paro forzoso
    deduccionPoliticaHabitacional = sueldoBase * 0.02; // 2% de política habitacional
    deduccionCajaAhorro = sueldoBase * 0.07; // 7% para caja de ahorro

    sueldoNeto = sueldoBase - (deduccionParoForzoso + deduccionPoliticaHabitacional + deduccionCajaAhorro) 
     + asignacionActualizacionAcademica + (asignacionPorHijo * 1) + asignacionPrimaHogar; // Asumiendo un hijo para el cálculo

    System.out.println("Asignaciones:");
    System.out.println("Actualización Académica: " + asignacionActualizacionAcademica);
    System.out.println("Asignación por hijo: " + (asignacionPorHijo * 1)); // Asumiendo un hijo
    System.out.println("Prima por hogar: " + asignacionPrimaHogar);

    System.out.println("Deducciones:");
    System.out.println("Paro Forzoso: " + deduccionParoForzoso);
    System.out.println("Política Habitacional: " + deduccionPoliticaHabitacional);
    System.out.println("Caja de Ahorro: " + deduccionCajaAhorro);
    System.out.println("Sueldo Neto: " + sueldoNeto);


 
    










    
}
}