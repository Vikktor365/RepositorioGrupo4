package beans;



public class Producto {
    private int id;
    private String nombreproducto;
    //private Date fecha;
    private double precio;
    private int cantidad ;
     private String categoria;
    private boolean novedad;
    private double descuento;
    private String tamano;

    public Producto(int id, String nombreproducto, double precio, int cantidad, String categoria, boolean novedad, double descuento, String tamano) {
        this.id = id;
        this.nombreproducto = nombreproducto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.novedad = novedad;
        this.descuento = descuento;
        this.tamano = tamano;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isNovedad() {
        return novedad;
    }

    public void setNovedad(boolean novedad) {
        this.novedad = novedad;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    



  //  @Override
  //  public String toString() {
  //      return "Alquiler{" + "id=" + id + ", username=" + username + ", fecha=" + fecha + ", novedad=" + novedad + ", genero=" + genero + '}';
   // }
     @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombreproducto=" + nombreproducto + ", precio=" + precio + ", cantidad=" + cantidad + ", categoria=" + categoria + ", novedad=" + novedad + ",descuento" + descuento + ",tamano" + tamano +'}';
    }
    
}
