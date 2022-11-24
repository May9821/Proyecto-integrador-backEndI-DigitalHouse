package com.proyectointegrador.odontologia.service;
import com.proyectointegrador.odontologia.repository.IDomicilioRepository;



public class DomicilioService {
    private final IDomicilioRepository domicilioRepository;

    public DomicilioService (IDomicilioRepository domicilioRepository){
        this.domicilioRepository = domicilioRepository;
    }

    /*public DomicilioService(IDao<Domicilio> domicilioDao) {
        this.domicilioDao = domicilioDao;
    }

    public Domicilio guardar(Domicilio d) {
        domicilioDao.guardar(d);
        return d;
    }

    public Optional<Domicilio> buscar(Integer id) {
        return domicilioDao.buscar(id);
    }

    public List<Domicilio> buscarTodos() {
        return domicilioDao.buscarTodos();
    }

    public void eliminar(Integer id) {
        domicilioDao.eliminar(id);
    }
*/
}
