package daolmp;

import interfaces.Iprovedor;
import model.TblProveedorcl2;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class provedorlmp implements Iprovedor {

	@Override
	public void RegistrarProvedor(TblProveedorcl2 prove) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_CL2_SALAZARCHINCHAY");
		EntityManager em=emf.createEntityManager();
		try{
			//iniciamos la transaccion
			em.getTransaction().begin();
			//utilizamos el metodo para registrar.
			em.persist(prove);
			//confirmamos la transaccion
			em.getTransaction().commit();
			}catch(RuntimeException e){
				//mensaje de error
				e.getMessage();
			}finally{
			//cerramos
			em.close();
			}
		
	}

	@Override
	public void ActualizarProvedor(TblProveedorcl2 prove) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_CL2_SALAZARCHINCHAY");
		EntityManager em=emf.createEntityManager();
		try {
		//Nos conectamos a la unidad de persistencia
			//para actualizar los datos de la BD
			//niciamops la tranzaicion
			em.getTransaction().begin();
			//Invocamos m todo de actualizar
			em.merge(prove);
			//confirmamos tranzacci n
			em.getTransaction().commit();
			
		} catch (RuntimeException e) {
			e.getMessage();
		}
			finally {
				//cerramos
				em.close();
			}
	}

	@Override
	public void EliminarProvedor(TblProveedorcl2 prove) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAMiercolesNoche");
		EntityManager em=emf.createEntityManager();
		try {
		//Nos conectamos a la unidad de persistencia
			//para actualizar los datos de la BD
			//niciamops la tranzaicion
			em.getTransaction().begin();
			//Invocamos m todo de actualizar
			TblProveedorcl2 codelink = em.find(TblProveedorcl2.class, prove.getIdprooveedorcl2());
			//confirmamos tranzacci n
			em.getTransaction().commit();
			
		} catch (RuntimeException e) {
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			e.getMessage();
		}
			finally {
				//cerramos
				em.close();
			}
		
	}

	}

