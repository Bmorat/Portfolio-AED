
import java.util.ArrayList;
import java.util.LinkedList;

public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TGrafoRedDatos redDatos;

        // cargar grafo con SERVIDORES y ENLACES
        //redDatos = (TGrafoRedDatos)UtilGrafos.cargarGrafo...
        redDatos=UtilGrafos.cargarGrafo("src\\servidores.txt", "src\\enlaces.txt", false, TGrafoRedDatos.class);
       
        // EJECUTAR PARA servidor1 = BUF y servidor2 = DFW
        String servidor1 = "BUF";
        String servidor2 = "DFW";   //BUF BWI PIT DFW
        LinkedList<TVertice> ruta = redDatos.rutaMenosSaltos(servidor1, servidor2);
        ArrayList<String>salida = new ArrayList<>();
        for (TVertice vertice : ruta) {
            System.out.println(vertice.getEtiqueta());
            salida.add(vertice.getEtiqueta().toString());
        }
        salida.add("");
        salida.add("");
        redDatos.desvisitarVertices();
        // ESCRIBIR RUTA EN rutas.txt SEGUIDO DE 2 LINEAS EN BLANCO
         // EJECUTAR PARA servidor1 = BUF y servidor2 = LAS
         servidor2 = "LAS";
         ruta = redDatos.rutaMenosSaltos(servidor1, servidor2);
            for (TVertice vertice : ruta) {
                System.out.println(vertice.getEtiqueta());
                salida.add(vertice.getEtiqueta().toString());
            }
            System.out.println();
         // ESCRIBIR RUTA EN rutas.txt SEGUIDO DE 2 LINEAS EN BLANCO
         salida.add("");
         salida.add("");
         redDatos.desvisitarVertices();
         // EJECUTAR PARA servidor1 = BUF y servidor2 = MIA
         servidor2 = "MIA";
         ruta = redDatos.rutaMenosSaltos(servidor1, servidor2);
         // ESCRIBIR RUTA EN rutas.txt SEGUIDO DE 2 LINEAS EN BLANCO
         for (TVertice vertice : ruta) {
            salida.add(vertice.getEtiqueta().toString());
            System.out.println(vertice.getEtiqueta());
        }
        ManejadorArchivosGenerico.escribirArchivo("rutas.txt", salida.toArray(String[]::new));
    }
}
