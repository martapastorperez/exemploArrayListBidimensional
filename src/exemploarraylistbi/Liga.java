

package exemploarraylistbi;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Liga {
   
    int numEquipos = Integer.parseInt(JOptionPane.showInputDialog("cantos equipos :"));
  
    ArrayList<ArrayList<Xogador>>liga = new ArrayList<ArrayList<Xogador>>();
    ArrayList<Xogador> equipo;
    
    public void crearLiga(){
        int i,j;
    for( i=0;i<numEquipos;i++ ){
      equipo = new ArrayList<Xogador>(); // creo fila vacia
        
      equipo=crearEquipo(); 
      
        liga.add(equipo);
   }
        
    }
    
    public void amosar(){
        
        for(int i =0;i< liga.size();i++){
            System.out.println("\n");
            for (int j=0;j<liga.get(i).size();j++){
                System.out.print(liga.get(i).get(j));
            }
    }
    }    
     public void buscarXogador(){
         boolean atopado = false ; // non se atopou
         System.out.println(" \n dorsal xogador a buscar :");
         int dorsal = pedirInt();
          for(int i =0;i< liga.size();i++)
            
            for (int j=0;j<liga.get(i).size();j++){
                if(dorsal == liga.get(i).get(j).getDorsal()){
                    System.out.println(liga.get(i).get(j));
                    atopado = true;
                }
          } 
         if (!atopado) // é igual que dicir o contrario de true
             System.out.println(" o dorsal "+ dorsal + " non está na liga");
      }
      public static String pedirString(){
        return (JOptionPane.showInputDialog(" dato String :") ); 
    }
    
    public static int pedirInt(){
        return(Integer.parseInt(JOptionPane.showInputDialog("dato int :")));
    }
   
     public ArrayList<Xogador> crearEquipo(){
        int tam = Integer.parseInt(JOptionPane.showInputDialog(" cantos xogadores :"));
        for(int i=0;i< tam;i++){
            equipo.add(new Xogador(pedirString(),pedirInt())); 
            
       
    }
   return equipo;
    
}
}
