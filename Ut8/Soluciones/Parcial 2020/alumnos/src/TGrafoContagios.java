
import java.util.Collection;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ernesto
 */
public class TGrafoContagios extends TGrafoNoDirigido implements IGrafoContagio{
    
    public TGrafoContagios(Collection<TVertice> vertices, Collection<TArista> aristas) {
        super(vertices, aristas);
    }

    @SuppressWarnings("rawtypes")
    @Override
    public TAnillosContagio anillosDeProbablesContagiados(String personaCOVID, int maxDistancia) {
        // debe realizarse invocando el metodo de TVertice "obtenerAnillos"...
        TVertice verticeCOVID = this.buscarVertice(personaCOVID);
        if (verticeCOVID == null) {
            return null;
        }
        TAnillosContagio anillos = new TAnillosContagio();
        verticeCOVID.setNumDist(0);
        anillos.agregarContagio(0, personaCOVID);
        verticeCOVID.obtenerAnillos(anillos, maxDistancia);
        return anillos;

    }
    
  

          
    

}
