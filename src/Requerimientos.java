import java.sql.SQLException;
import java.util.ArrayList;

public class Requerimientos {

 public String[][] mostrar() throws SQLException {
ArrayList<Requerimiento_1> lista = new ArrayList<Requerimiento_1>();
ControladorRequerimientos controlador = new ControladorRequerimientos();
lista = controlador.consultarRequerimiento1();
String matriz[][] = new String [lista.size()][2];
for (int i = 0; i< lista.size(); i++){
matriz[i][0] = String.valueOf(lista.get(i). getPrecioUnidad());
matriz[i][1] = lista.get(i).getNombreMaterial();
}
return matriz;
}


public String[][] mostrar1() throws SQLException {
ArrayList<Requerimiento_2> lista = new ArrayList<Requerimiento_2>();
ControladorRequerimientos controlador = new ControladorRequerimientos();
lista = controlador.consultarRequerimiento2();
String matriz[][] = new String [lista.size()][2];
for (int i = 0; i< lista.size(); i++) {
matriz[i][0] = lista.get(i). getConstructora();
matriz[i][1] = lista.get(i).getCiudad();
}
return matriz;
}


public String[][] mostrar2() throws SQLException {
ArrayList<Requerimiento_3> lista = new ArrayList<Requerimiento_3>();
ControladorRequerimientos controlador = new ControladorRequerimientos();
lista = controlador.consultarRequerimiento3();
String matriz[][] = new String [lista.size()][5];
for (int i = 0; i< lista.size(); i++) {
matriz[i][0] = lista.get(i).getProveedor();
matriz[i][1] = lista.get(i).getNombreMaterial();
matriz[i][2] = lista.get(i).getImportado();
matriz[i][3] = String.valueOf(lista.get(i).getPrecioUnidad());
matriz[i][4] = String.valueOf(lista.get(i).getCantidad());
}
return matriz;
}
}

