package ejercicios_string;

// E505 - Crea un programa que pida al usuario ingresar un texto que corresponde a una identificación. En base a la existencia del carácter arroba determinar si el ingreso es un email o un usuario de instagram. Usar el método contains y startWith de la clase String para determinar lo solicitado.

import java.util.Scanner;

public class e505 {
    
    public void solucion() {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese campo: ");
        
        String campo = sc.nextLine();
        
        String mensaje="";
        
        if ( campo.contains("@") ) {
            if (campo.startsWith("@")) {
                mensaje = "Usuario Instagram";
            }
            else {
                mensaje = "Usuario email";
            }
        }
        else {
            mensaje = "El campo NO es un usuario";
        }
        
        System.out.println(mensaje);
    
    }
    
    
    
}
