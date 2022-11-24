
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;

/**
 *
 * @author luisf
 */
public class Productos {

    String idproductos, nombrep, descripcion, precioBase, precioSugerido, cantidad;
    ImageIcon foto;

    public Productos(String idproductos, String nombrep, String descripcion, String precioBase, String precioSugerido, String cantidad, ImageIcon foto) {
        this.idproductos = idproductos;
        this.nombrep = nombrep;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.precioSugerido = precioSugerido;
        this.cantidad = cantidad;
        this.foto = foto;
    }
    
    public int insertar (Conexion cnx){
        try {
            String sql = "INSERT INTO productos VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setString(1, idproductos);
            ps.setString(2, nombrep);
            ps.setString(3, descripcion);
            ps.setString(4, precioBase);
            ps.setString(5, precioSugerido);
            ps.setString(6, cantidad);
            ps.setBinaryStream(7, cnx.ImagenBytes(foto));
            
            return ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("No se pudo insertar " + e.getMessage());
            return 0;
        }
    }
    
    public int actualizar(Conexion cnx) {
        try {
            String sql = "UPDATE productos SET nombrep=?,descripcion=?,preciobase=?,preciosugerido=?,cantidad=?,fotop=? "
                    + "WHERE  idproductos=?";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            
            ps.setString(1, nombrep);
            ps.setString(2, descripcion);
            ps.setString(3, precioBase);
            ps.setString(4, precioSugerido);
            ps.setString(5, cantidad);
            ps.setBinaryStream(6, cnx.ImagenBytes(foto));
            ps.setString(7, idproductos);
            
            return ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("No se pudo actualizar " + e.getMessage());
            return 0;
        }
    }
    
    public int remover(Conexion cnx) {
        try {
            String sql = "DELETE FROM productos WHERE idproductos=?";
            PreparedStatement ps = cnx.con.prepareStatement(sql);

            ps.setString(1, idproductos);

            return ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("No se pudo remover " + e.getMessage());
            return 0;
        }
    }
    
}
