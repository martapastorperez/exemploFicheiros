
package ejemploficheros.lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class leerLinea {
    File fich;
    Scanner sc;
    
    public void leer(String nomeFich){
        fich=new File(nomeFich);
        try {
            sc=new Scanner(fich);
            while(sc.hasNextLine())
                System.out.println(sc.nextLine());
        } catch (FileNotFoundException ex) {
          ex.getMessage();
        }
        finally{
            sc.close();
        }
    }
    
}
