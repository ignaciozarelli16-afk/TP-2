public class App {
    public static void main(String[] args) throws Exception {
        
    // Creamos la instancia que contiene el arreglo
    Arreglo miBiblioteca = new Arreglo();

    // Creamos el gestor de datos
    Datos gestor = new Datos();

    // Llamamos a los metodos pasandoles nuestra biblioteca
    gestor.cargarLibros(miBiblioteca);
    gestor.mostrarLibros(miBiblioteca);
    


    }
}

