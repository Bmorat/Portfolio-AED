
import java.util.Collection;
import java.util.LinkedList;

public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

// cargar grafo con actores y relaciones
        TGrafoNoDirigido gkb = UtilGrafos.cargarGrafo("src\\actores.txt", "src\\en_pelicula.txt", false,TGrafoNoDirigido.class);

        String actorZZ1 = "Bruce_Willis"; // se indicará en el pizarrón
        Collection<TVertice> contactos1 = gkb.listarContactos(actorZZ1, 8);
        // escribir los resultados al archivo "salida.txt"
        String[] salidaActorZZ1= new String[contactos1.size()];
        for (int i=0;i<contactos1.size();i++){
            TVertice v = (TVertice) contactos1.toArray()[i];
            salidaActorZZ1[i]=v.getEtiqueta().toString();
            System.out.println(salidaActorZZ1[i]);
        }
        ManejadorArchivosGenerico.escribirArchivo( "salida.txt",salidaActorZZ1);
        
    }
}
