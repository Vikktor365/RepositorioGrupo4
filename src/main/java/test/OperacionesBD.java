
package test;
//import beans.Pedido;
import beans.Producto;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {
    public static void main(String[] args) {
       listarProducto(); 
       //actualizarPelicula(1,"Terror/Fantasia");
    }
    
public static void actualizarProducto(int id, String nombreproducto){
    DBConnection  con = new DBConnection();
    String sql = "UPDATE pelicula SET genero = '" + nombreproducto+ "'WHERE id  = " + id;
    
    try {
      Statement st = con.getConnection().createStatement();
      st.executeUpdate(sql);
      
    }catch(Exception ex){
        System.out.println(ex.getMessage());
    
    }
    
    finally {
        con.desconectar();
    }

    
}
  
public static void listarProducto(){
    DBConnection con = new DBConnection();
    String sql ="SELECT *FROM producto";
    
    try {
      Statement st = con.getConnection().createStatement();
      ResultSet rs = st.executeQuery(sql);
      while(rs.next()){
          int id = rs.getInt("id");
          String nombreproducto = rs.getString("nombreproducto");
          double precio = rs.getDouble("precio");
          int cantidad = rs.getInt("cantidad");
          String categoria = rs.getString("categoria");
          boolean novedad = rs.getBoolean("novedad");
          double descuento = rs.getDouble("descuento");
          String tamano = rs.getString("tamano");
          Producto producto = new Producto (id, nombreproducto, precio,cantidad,categoria, novedad,descuento,tamano);
          System.out.println(producto.toString());
      }
      
      st.executeQuery(sql);
      
    }catch(Exception ex){
        System.out.println(ex.getMessage());
    
    }
    
    finally {
        con.desconectar();
    }
}
}
