package interfaces;

import model.TblProveedorcl2;

public interface Iprovedor {
    void RegistrarProvedor(TblProveedorcl2 prove);
    void ActualizarProvedor(TblProveedorcl2 prove);
    void EliminarProvedor(TblProveedorcl2 prove);
}
