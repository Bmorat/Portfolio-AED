import java.util.ArrayList;

public class Parcial2 {

    public static void main(String[] args) {
        
        
        // CREAR EL GRAFO CON PERSONAS.TXT y CONTACTOS.TXT
        
        TGrafoContagios grafoTrazabilidad = (TGrafoContagios) UtilGrafos.cargarGrafo(
                "src\\personas.txt",
        "src\\contactos.txt",
                false, TGrafoContagios.class);

        String personaCOVID = "Kevin_Bacon";
        int maxDistancia = 3;
        
        // invocar al método "anillosDeProbablesContagiados" con estos parámetros;
       TAnillosContagio anillos=grafoTrazabilidad.anillosDeProbablesContagiados(personaCOVID, maxDistancia);
       int suma=0;
       for(int i=0;i<anillos.size();i++){
          System.out.println("Cantidad de personas contagiadas en el anillo "+i+": "+anillos.obtenerAnillo(i).size());
          suma=suma+anillos.obtenerAnillo(i).size();
       }
       suma=suma+anillos.size();
       ArrayList<String> Salida=new ArrayList<String>();
       for(int i=0;i<anillos.size();i++){
           Salida.add("DISTANCIA de CONTACTO: "+(i+1));
           for(int j=0;j<anillos.obtenerAnillo(i).size();j++){
               Salida.add(anillos.obtenerAnillo(i).toArray()[j].toString());
           }
       }
       ManejadorArchivosGenerico.escribirArchivo("anillos.txt", Salida.toArray(String[]::new));
        
                  
        
        
        
       
    }
}
