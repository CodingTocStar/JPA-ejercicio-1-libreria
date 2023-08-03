/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import libreria.entidades.Libro;

/**
 *
 * @author MiriamNahuel
 */
public class LibroDAO extends DAO<Libro>{
    @Override
    public void guardar(Libro libro){
        super.guardar(libro);
    }

    public void editar(Libro libro){
        super.editar(libro);
    }
    
    public void eliminar(Libro libro){
        super.eliminar(libro);
    }
    
    public List<Libro> listarLibros
    
    
}
