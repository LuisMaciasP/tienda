
import java.sql.PreparedStatement;


public class Clientes {
    String codigo, nombre, rfc, tel, dir;

    public Clientes(String codigo, String nombre, String rfc, String tel, String dir) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.rfc = rfc;
        this.tel = tel;
        this.dir = dir;
    }

     public int insertar (Conexion cnx){
        try {
            String sql = "INSERT INTO clientes VALUES (?,?,?,?,?)";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setString(1, codigo);
            ps.setString(2, nombre);
            ps.setString(3, rfc);
            ps.setString(4, tel);
            ps.setString(5, dir);
            
            return ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("No se pudo insertar " + e.getMessage());
            return 0;
        }
    }
     
     public int actualizar(Conexion cnx) {
        try {
            String sql = "UPDATE clientes SET nombrec=?, rfc=?,telefono=?,direccion=? "
                    + "WHERE codigoc=?";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            
            ps.setString(1, nombre);
            ps.setString(2, rfc);
            ps.setString(3, tel);
            ps.setString(4, dir);
            ps.setString(5, codigo);
            
            return ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("No se pudo actualizar " + e.getMessage());
            return 0;
        }
    }
     
    public int remover(Conexion cnx) {
        try {
            String sql = "DELETE FROM clientes WHERE codigoc=?";
            PreparedStatement ps = cnx.con.prepareStatement(sql);

            ps.setString(1, codigo);

            return ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("No se pudo remover " + e.getMessage());
            return 0;
        }
    }
}
