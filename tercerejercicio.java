public class tercerejercicio {
    public static void main(String[] args) {
        int comisiones;
        int sueldo;
        int resultado;
        int porcentaje;
        int ventas;


        System.out.println("ingresar las ventas");
        ventas = Integer.parseInt(System.console().readLine());
        System.out.println("ingresar el sueldo");
        sueldo = Integer.parseInt(System.console().readLine());

        comisiones = (sueldo * 10/100);
        porcentaje = (ventas * comisiones);
        resultado = sueldo + porcentaje;
        System.out.println("el sueldo total es:" + resultado);

        
        
        

        
    
    
    }



}