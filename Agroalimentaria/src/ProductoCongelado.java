public class ProductoCongelado extends Producto {

    double temperaturaCongelacion;

    public ProductoCongelado() {
        
        super(); //lama al constructor de la superclase: Producto
    }
    
    public ProductoCongelado(String nroLote, String fechaCaducidad, double temperaturaCongelacion) {
        super(nroLote, fechaCaducidad); //llamar al constructor de la superclase y enviar parametros
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

}
