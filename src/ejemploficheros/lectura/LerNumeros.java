
package ejemploficheros.lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class LerNumeros {
     
    Scanner sc;
    File fich;
    int par;

    
    public void lerNum(String nomFich){
      try{
    
            sc =new Scanner (new File(nomFich));
            while(sc.hasNextInt())
            System.out.println(sc.nextInt());
        } catch (FileNotFoundException ex){
            System.out.println("Erro 3: "+ex.getMessage());
    }finally{
          sc.close();
      }
    
}
    public void comas(String nomFich){
      try{
            sc =new Scanner (new File(nomFich)).useDelimiter(",");
            while(sc.hasNextInt())
            System.out.println(sc.nextInt());
        } catch (FileNotFoundException ex){
            System.out.println("Erro 3: "+ex.getMessage());
    }finally{
          sc.close();
      }
}
}