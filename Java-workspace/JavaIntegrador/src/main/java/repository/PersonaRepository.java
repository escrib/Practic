package repository;

import model.Cliente;
import model.Persona;
import model.Tecnico;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class PersonaRepository {

    @PersistenceContext
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public List<Tecnico> buscarTecnicos() {
        return em.createQuery("select t from Tecnico t", Tecnico.class).getResultList();
    }

    public Cliente buscarUno(long numero) {
        return em.find(Cliente.class, numero);
    }

    public List<Cliente> buscarClientes() {
        return em.createQuery("select c from Cliente c", Cliente.class).getResultList();
    }

    public void insertar(Persona persona) {
        em.persist(persona);
    }

    public void actualizar(Persona persona) {
        em.merge(persona);
    }


}
