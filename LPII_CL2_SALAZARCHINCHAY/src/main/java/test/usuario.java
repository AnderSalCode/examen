package test;

import daolmp.usuariolmp;
import model.TblUsuariocl2;

public class usuario {
	public static void main(String[] args) {
		TblUsuariocl2 tblusu = new TblUsuariocl2();
		usuariolmp usulmp = new usuariolmp();
		
		/*tblusu.setUsuariocl2("Anderson");
		tblusu.setPasswordcl2("BODERBALL");
		
		usulmp.RegistrarUsuario(tblusu);*/
		
		
		//actuañizar 
		
		
		/*tblusu.setIdusuariocl2(1);
		tblusu.setUsuariocl2("Ander");
		tblusu.setPasswordcl2("BODERBALL");
		
		usulmp.ActualizarUsuario(tblusu);*/
		
		//eliminar
		
        tblusu.setIdusuariocl2(1);
		
		usulmp.EliminarUsuario(tblusu);
		
		System.out.print("Cliente Eliminado de la BD");

		
	}
}
