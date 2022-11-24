
import java.sql.PreparedStatement;


public class Empleados {
    String codigoe, nombree,telefonoe, puesto;


    public Empleados(String codigoe, String nombree, String telelefonoe, String puesto) {
        this.codigoe = codigoe;
        this.nombree = nombree;
        this.telefonoe = telelefonoe;
        this.puesto = puesto;
    }
    

    
     public int insertar (Conexion cnx){
        try {
            String sql = "INSERT INTO empleados VALUES (?,?,?,?)";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setString(1, codigoe);
            ps.setString(2, nombree);
            ps.setString(3, telefonoe);
            ps.setString(4, puesto);
            
            return ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("No se pudo insertar " + e.getMessage());
            return 0;
        }
    }
     
     public int actualizar(Conexion cnx) {
        try {
            String sql = "UPDATE empleados SET nombree=?,telefonoe=?,puesto=? "
                    + "WHERE codigoe=?";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            
            ps.setString(1, nombree);
            ps.setString(2, telefonoe);
            ps.setString(3, puesto);
            ps.setString(4, codigoe);
            
            return ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("No se pudo actualizar " + e.getMessage());
            return 0;
        }
    }
     
    public int remover(Conexion cnx) {
        try {
            String sql = "DELETE FROM empleados WHERE codigoe=?";
            PreparedStatement ps = cnx.con.prepareStatement(sql);

            ps.setString(1, codigoe);

            return ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("No se pudo remover " + e.getMessage());
            return 0;
        }
    }
}
