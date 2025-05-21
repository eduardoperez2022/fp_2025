package demo_bicicleta;

public class Demo_bicicleta {

    public static void main(String[] args) {
        
        bicicleta bici1 = new bicicleta();
        
        bici1.velocidadActual = 107;
        
        System.out.println("Vel Actual: " + bici1.velocidadActual);
        
        bici1.acelerar();
        
        System.out.println("Vel Actual: " + bici1.velocidadActual);

        bici1.frenar();

        System.out.println("Vel Actual: " + bici1.velocidadActual);

        bici1.frenar();

        System.out.println("Vel Actual: " + bici1.velocidadActual);

        bicicleta bici2 = new bicicleta();

        bici2.velocidadActual = 60;
        
        System.out.println("Vel Actual bici1: " + bici1.velocidadActual);
        
        System.out.println("Vel Actual bici2: " + bici2.velocidadActual);
        
        System.out.println(bici1.toString());
        
        System.out.println(bici2.toString());
        
    }
    
}




