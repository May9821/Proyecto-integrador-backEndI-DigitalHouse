package com.proyectointegrador.odontologia.service.imp;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyectointegrador.odontologia.repository.IDomicilioRepository;



public class DomicilioServiceImp {
    private final IDomicilioRepository domicilioRepository;
    ObjectMapper mapper = new ObjectMapper();
    public DomicilioServiceImp(IDomicilioRepository domicilioRepository){
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
