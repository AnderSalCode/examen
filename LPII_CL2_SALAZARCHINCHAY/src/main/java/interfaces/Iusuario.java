package interfaces;

import model.TblUsuariocl2;

public interface Iusuario {
 
	void RegistrarUsuario(TblUsuariocl2 tblusu);
	void ActualizarUsuario(TblUsuariocl2 tblusu);
	void EliminarUsuario(TblUsuariocl2 tblusu);
}
