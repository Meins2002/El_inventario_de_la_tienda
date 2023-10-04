package model;

public class Product {
        //Variables privadas
        private String name;
        private double price;
        private int stock;

        // inicializa la clase
        public Product(String Nombre, double Precio, int Cantidad_Disponible) {
            this.name = Nombre;
            this.price = Precio;
            this.stock = Cantidad_Disponible;
        }
        //Funciones == metodos
        public String getName() {
            return name;
        }

        public void setName(String Nombre) {
            this.name = Nombre;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double Precio) {
            this.price = Precio;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int Cantidad_Disponible) {
            this.stock = Cantidad_Disponible;
        }

        @Override
        public String toString() {
            return "{ 'Nombre':" + name + ", Precio:" + price + ", Cantidad Disponible:" + stock + "}";
        }

        public void Inventario(){

            if (this.stock == 0){
                System.out.print("No hay productos");
            } else if ( this.stock < 0) {
                System.out.println("Error");
            }else {
                System.out.println("Cantidad => " + this.stock);
            }

        }
        //Producto_Mayor determina si el precio del producto es mayor a un valor por parametros
        public boolean Producto_Mayor (double Precio){
            if (this.price > Precio ){
                System.out.println("true");
                return true;
            }else {
                System.out.println("false");
                return false;
            }

        }

    public boolean Producto_es_menor_o_Igual  (double Precio){
        if (this.price <= Precio ){
            System.out.println(" true");
            return true;
        }else {
            System.out.println(" false");
            return false;
        }

    }

    public void Comprobacion_Palabra (String Nombre){
        if (this.name.contains(String.valueOf(Nombre))) {
            System.out.println("El nombre del producto contiene la palabra: " + this.name);
        } else {
            System.out.println("Palabra incorrecta.");
        }

    }

    public static void main(String[] args) {


       Product producto_uno = new Product("Celular", 280000.00, 3);
       System.out.print("Cantidad del producto: " + producto_uno.name + ", " );
       producto_uno.Inventario();
       System.out.print("El precio es mayor a " + producto_uno.price + " : ");
       producto_uno.Producto_Mayor(20000);
       System.out.print("¿El precio es menor o igual? " + producto_uno.price);
       producto_uno.Producto_es_menor_o_Igual(234000 );
       System.out.println("Comprobando el nombre del producto:  ");
       producto_uno.Comprobacion_Palabra("Celular");
    }
}