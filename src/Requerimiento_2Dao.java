import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        var response = new ArrayList<Requerimiento_2>();

        String consulta = "SELECT DISTINCT p.Constructora, p.Ciudad" 
                            + " FROM Proyecto p "
                            + " WHERE p.Ciudad LIKE 'B%'"
                            + " ORDER BY p.Ciudad;";

        try(var connection = JDBCUtilities.getConnection();
            var statement = connection.prepareStatement(consulta);
            var rset = statement.executeQuery()){
                
                while(rset.next()){
                    var requerimiento_2VO = new Requerimiento_2();
                    requerimiento_2VO.setConstructora(rset.getString("Constructora"));
                    requerimiento_2VO.setCiudad(rset.getString("Ciudad"));

                    response.add(requerimiento_2VO);
                }                          
        }
        return response;
    }
}

