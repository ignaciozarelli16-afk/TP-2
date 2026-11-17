import java.util.Scanner;

public class Datos {
    Scanner sc = new Scanner(System.in);

public void cargarLibros(Arreglo arr) {
    for ( int i = 0; i < arr.biblioteca.length ; i++){
    System.out.println("--- CARGA DE LIBROS---");
    // 1 Recibe el objeto ´Arreglo´ por parámetro para llenar su vector
    Libro nuevoLibro = new Libro(); 

    // 2 Pedimos y guardamos sus datos

    System.out.println("Ingrese el titulo del libro: ");
    nuevoLibro.titulo = sc.nextLine();

    System.out.println("Ingrese la cantidad de paginas: ");
    nuevoLibro.paginas = sc.nextInt();
    sc.nextLine(); // Limpiar el buffer de entrada

    // 3 Guardamos el objeto ya cargado en la posicion ´i´ del Arreglo
    arr.biblioteca[i] = nuevoLibro;
}
}

public void mostrarLibros(Arreglo arr) {

System.out.println("\n=== LISTADO DE LIBROS ===");


for (int i = 0 ; i < arr.biblioteca.length ; i++){

    // Verificamos que la posicion no este vacia 
    if(arr.biblioteca[i] != null){
        arr.biblioteca[i].mostrarDatos();

        if(arr.biblioteca[i].esLargo()){
            System.out.println("-> Es un libro largo. ");
        } else {
            System.out.println("-> Es un libro corto. ");
        }
        System.out.println("-----------------------------");
    }
 
}




}

}
