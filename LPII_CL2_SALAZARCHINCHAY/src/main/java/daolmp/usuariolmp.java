package daolmp;

import interfaces.Iusuario;
import model.TblUsuariocl2;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class usuariolmp implements Iusuario {

	@Override
	public void RegistrarUsuario(TblUsuariocl2 tblusu) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_CL2_SALAZARCHINCHAY");
		EntityManager em=emf.createEntityManager();
		try{
			//iniciamos la transaccion
			em.getTransaction().begin();
			//utilizamos el metodo para registrar.
			em.persist(tblusu);
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
	public void ActualizarUsuario(TblUsuariocl2 tblusu) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_CL2_SALAZARCHINCHAY");
		EntityManager em=emf.createEntityManager();
		try {
		//Nos conectamos a la unidad de persistencia
			//para actualizar los datos de la BD
			//niciamops la tranzaicion
			em.getTransaction().begin();
			//Invocamos m todo de actualizar
			em.merge(tblusu);
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
	public void EliminarUsuario(TblUsuariocl2 tblusu) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAMiercolesNoche");
		EntityManager em=emf.createEntityManager();
		try {
		//Nos conectamos a la unidad de persistencia
			//para actualizar los datos de la BD
			//niciamops la tranzaicion
			em.getTransaction().begin();
			//Invocamos m todo de actualizar
			TblUsuariocl2 codelink = em.find(TblUsuariocl2.class, tblusu.getIdusuariocl2());
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


