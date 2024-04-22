public class ProductoFresco extends Producto{

    //atributos
    private String fechaEnvasado;
    private String paisOrigen;

    public ProductoFresco() {

        super(); //lama al constructor de la superclase: Producto
    }

    public ProductoFresco(String nroLote, String fechaCaducidad, String fechaEnvasado, String paisOrigen) {
        super(nroLote, fechaCaducidad); //llamar al constructor de la superclase y enviar parametros
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    
}
