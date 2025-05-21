package ejercicio402;


// E402 - Crea una clase llamada Libro que guarde la información de cada uno de los 
// libros de una biblioteca. La clase debe guardar el título del libro, autor, número 
// de ejemplares del libro ynúmero de ejemplares prestados. La clase contendrá los 
// siguientes métodos:- Método préstamo que incremente el atributo correspondiente 
// cada vez que se realice un préstamo del libro. No se podrán prestar libros de 
// los que no queden ejemplares disponibles para prestar. Devuelve true si se ha
// podido realizar la operación y false en caso contrario.- Método devolución que 
// decremente el atributo correspondiente cuando se produzca la devolución de un 
// libro. No se podrán devolver libros que no se hayan prestado. Devuelve true si 
// se ha podido realizar la operación y false en caso contrario.- Método toString 
// para mostrar los datos de los libros. Este método se heredada de Object y 
// lodebemos modificar (override) para adaptarlo a la clase Libro.Escribe un 
// programa para probar el funcionamiento de la clase Libro.


public class Ejercicio402 {

    public static void main(String[] args) {
        
//        Libro martinFierro = new Libro();
//        martinFierro.titulo = "Martin Fierro";
//        martinFierro.autor = "Hernandez";
//        martinFierro.numero_ejemplares = 3;
        
        Libro martinFierro = new Libro("Martin Fierro", "Hernandez", 3);
        
        System.out.println("Libro 1:");
        System.out.println(martinFierro.toString());
        
        System.out.println("Prueba prestamo:");
        
        boolean res = martinFierro.prestamo();
        System.out.println("Pudo prestarse ? " + res);
        
        res = martinFierro.prestamo();
        System.out.println("Pudo prestarse ? " + res);
        
        res = martinFierro.prestamo();
        System.out.println("Pudo prestarse ? " + res);

        res = martinFierro.prestamo();
        System.out.println("Pudo prestarse ? " + res);
        
        System.out.println("");
        System.out.println(martinFierro.toString());
        
        res = martinFierro.devolucion();
        System.out.println("Pudo devolver ? " + res);
        
        res = martinFierro.devolucion();
        System.out.println("Pudo devolver ? " + res);

        res = martinFierro.devolucion();
        System.out.println("Pudo devolver ? " + res);

        res = martinFierro.devolucion();
        System.out.println("Pudo devolver ? " + res);

        System.out.println("");
        System.out.println(martinFierro.toString());

    }
    
}
