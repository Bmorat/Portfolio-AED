
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
public class TGrafoRedDatos extends TGrafoNoDirigido implements IGrafoRedDatos {

    public TGrafoRedDatos(Collection<TVertice> vertices, Collection<TArista> aristas) {
        super(vertices, aristas);
    }

    @Override
    public LinkedList<TVertice> rutaMenosSaltos(Comparable origen, Comparable destino) {
        TVertice vOrigen = this.buscarVertice(origen);
        TVertice vDestino = this.buscarVertice(destino);
        LinkedList<TVertice> lista = new LinkedList<>();
        if (vOrigen != null && vDestino != null) {
            lista = vOrigen.rutaMenosSaltos(vDestino);
        }
        return lista;
    }


    
    
    
}
