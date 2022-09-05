package beans;

import java.sql.Date;

public class Pedido {
   private int id;
   private String username;
   private Date fecha;

    public Pedido(int id, String username, Date fecha) {
        this.id = id;
        this.username = username;
        this.fecha = fecha;
    }

    public Pedido(int id, String nombreproducto, double precio, int cantidad, String categoria, boolean novedad, double descuento, String tamano) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

   
    
    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", username=" + username+ ", fecha=" + fecha +  '}';
    }
   
   
    
}
