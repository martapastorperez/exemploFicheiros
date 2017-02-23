
package ejemploficheros;
import ejemploficheros.lectura.LerNumeros;
import ejemploficheros.lectura.LerPalabras;
import ejemploficheros.lectura.leerLinea;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjemploFicheros {

   
    public static void main(String[] args) {
        leerLinea obxFich=new leerLinea();
       // obxFich.leer("fichero.txt");
        obxFich.leer("/home/local/DANIELCASTELAO/mpastorperez/Escritorio/programacion.txt");
        
        
        LerNumeros obxFiche=new LerNumeros();
        obxFiche.lerNum("/home/local/DANIELCASTELAO/mpastorperez/Escritorio/Numeros.txt");
        obxFiche.comas("/home/local/DANIELCASTELAO/mpastorperez/Escritorio/Numeros.txt");
        
        LerPalabras obxFicheir=new LerPalabras();
        obxFicheir.lerPal("/home/local/DANIELCASTELAO/mpastorperez/Escritorio/hola.txt");
        
      
}
}