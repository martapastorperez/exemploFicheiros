package ejemploficheros.lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerPalabras {

    Scanner sc;
    File fich;

    public void lerPal(String nomFich) {
        try {

            sc = new Scanner(new File(nomFich));
            while (sc.hasNext())
            System.out.println(sc.next());
        } catch (FileNotFoundException ex) {
            System.out.println("Erro 2: "+ex.getMessage());
        }finally{
            sc.close();
        }

    }
}
