public class Producto  {

    //atributos
    private String nroLote;
    private String fechaCaducidad;
    public Producto() {
    }

    public Producto(String nroLote, String fechaCaducidad){
        this.nroLote = nroLote;
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getNroLote() {
        return nroLote;
    }

    public void setNroLote(String nroLote) {
        this.nroLote = nroLote;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    
}
