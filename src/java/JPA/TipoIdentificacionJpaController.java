package JPA;

import Entidades.TipoIdentificacion;
import JPA.exceptions.NonexistentEntityException;
import JPA.exceptions.RollbackFailureException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.UserTransaction;

public class TipoIdentificacionJpaController implements Serializable {

    public TipoIdentificacionJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TipoIdentificacion tipoIdentificacion) throws RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            em.persist(tipoIdentificacion);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TipoIdentificacion tipoIdentificacion) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            tipoIdentificacion = em.merge(tipoIdentificacion);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = tipoIdentificacion.getId();
                if (findTipoIdentificacion(id) == null) {
                    throw new NonexistentEntityException("The tipoIdentificacion with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            TipoIdentificacion tipoIdentificacion;
            try {
                tipoIdentificacion = em.getReference(TipoIdentificacion.class, id);
                tipoIdentificacion.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tipoIdentificacion with id " + id + " no longer exists.", enfe);
            }
            em.remove(tipoIdentificacion);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TipoIdentificacion> findTipoIdentificacionEntities() {
        return findTipoIdentificacionEntities(true, -1, -1);
    }

    public List<TipoIdentificacion> findTipoIdentificacionEntities(int maxResults, int firstResult) {
        return findTipoIdentificacionEntities(false, maxResults, firstResult);
    }

    private List<TipoIdentificacion> findTipoIdentificacionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TipoIdentificacion.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public TipoIdentificacion findTipoIdentificacion(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TipoIdentificacion.class, id);
        } finally {
            em.close();
        }
    }

    public int getTipoIdentificacionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TipoIdentificacion> rt = cq.from(TipoIdentificacion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
