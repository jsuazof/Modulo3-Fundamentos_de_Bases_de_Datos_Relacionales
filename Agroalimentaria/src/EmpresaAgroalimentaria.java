public class EmpresaAgroalimentaria {
    public static void main(String[] args){
        
        ProductoFresco productoFresco = new ProductoFresco("OUL6254","10/01/2026",
        "05/06/2023","Corea del Sur");
        System.out.println(productoFresco.getNroLote());
        System.out.println(productoFresco.getFechaCaducidad());
        System.out.println(productoFresco.getFechaEnvasado());
        System.out.println(productoFresco.getPaisOrigen());
        
    }

}
