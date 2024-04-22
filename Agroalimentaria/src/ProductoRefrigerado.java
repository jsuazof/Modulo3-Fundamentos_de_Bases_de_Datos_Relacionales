public class ProductoRefrigerado extends Producto {

    private String codigoSupervisionSanitaria;

    public ProductoRefrigerado() {

        super(); // lama al constructor de la superclase: Producto
    }

    public ProductoRefrigerado(String nroLote, String fechaCaducidad, String codigoSupervisionSanitaria) {
        super(nroLote, fechaCaducidad); // llamar al constructor de la superclase y enviar parametros
        this.codigoSupervisionSanitaria = codigoSupervisionSanitaria;
    }

    public String getCodigoSupervisionSanitaria() {
        return codigoSupervisionSanitaria;
    }

    public void setCodigoSupervisionSanitaria(String codigoSupervisionSanitaria) {
        this.codigoSupervisionSanitaria = codigoSupervisionSanitaria;
    }

}
