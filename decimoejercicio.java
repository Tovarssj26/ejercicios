public class decimoejercicio {
    public static void main(String[] args) {
        double chelinesaustriacos;
        double pesetas;
        double dracmasgriegos;
        double francosfranceses;
        double pesetas2;
        double dolares;
        double lirasitalianas;

        System.out.println("ingrese la cantidad de chelines austriacos");
        chelinesaustriacos = Double.parseDouble(System.console().readLine());
        pesetas = chelinesaustriacos * 9568.71;
        System.out.println("la cantidad de pesetas es: " + pesetas);
        System.out.println("ingrese la cantidad de dracmas griegos");
        dracmasgriegos = Double.parseDouble(System.console().readLine());
        francosfranceses = dracmasgriegos * 0.0440611636;
        System.out.println("la cantidad de francos franceses es: " + francosfranceses);
        System.out.println("ingrese la cantidad de pesetas");
        pesetas2 = Double.parseDouble(System.console().readLine());
        dolares = pesetas2 * 122499;
        System.out.println("la cantidad de dolares es: " + dolares);
        System.out.println("ingrese la cantidad de liras italianas");
        lirasitalianas = pesetas2 * 92.89;
        System.out.println("la cantidad de liras italianas es: " + lirasitalianas);
        

        


        


}}
