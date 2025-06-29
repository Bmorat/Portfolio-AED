
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class TGrafoNoDirigido extends TGrafoDirigido implements IGrafoNoDirigido, IGrafoKevinBacon {
protected TAristas lasAristas = new TAristas() ;
       /**
     *
     * @param vertices
     * @param aristas
     */
    public TGrafoNoDirigido(Collection<TVertice> vertices, Collection<TArista> aristas) {
       super(vertices, aristas);     
      lasAristas.insertarAmbosSentidos(aristas);
       
    }

    @Override
    public boolean insertarArista(TArista arista) {
        boolean tempbool = false;
        TArista arInv = new TArista(arista.getEtiquetaDestino(), arista.getEtiquetaOrigen(), arista.getCosto());
        tempbool = (super.insertarArista(arista) && super.insertarArista(arInv));
        return tempbool;
    }
public TAristas getLasAristas() {
        return lasAristas;
    }

    @Override
    public TGrafoNoDirigido Prim() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TGrafoNoDirigido Kruskal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public TVertice buscarVertice(String nombre){
        for (TVertice v : this.getVertices().values()){
            if (v.getEtiqueta().equals(nombre)){
                return v;
            }
        }
        return null;
    }

    @Override
    public Collection<TVertice> listarContactos(String nombreActor, int maxSaltos) {
        TVertice actor = this.buscarVertice(nombreActor);
        if (actor == null) {
            return null;
        }
        LinkedList<TVertice> visitados = new LinkedList<>();
        LinkedList<TVertice> porVistitar = new LinkedList<>();
        LinkedList<TVertice> aux = new LinkedList<>();
        visitados.add(actor);
        porVistitar.add(actor.primerAdyacente());
        int saltos = 1;
        while (saltos < maxSaltos) {
            for (TVertice v : porVistitar) {
                if (!visitados.contains(v)) {
                    aux.add(v.primerAdyacente());
                    visitados.add(v);
                }
            }
            porVistitar.clear();
            porVistitar.addAll(aux);
            aux.clear();
            saltos++;
        }
        return visitados;
    }
    
  


}
