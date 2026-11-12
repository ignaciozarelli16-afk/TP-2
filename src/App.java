public class App {
    public static void main(String[] args) throws Exception {
        
     Libro libro1 = new Libro();
     libro1.setTitulo ("El Principito");
     libro1.paginas = 300;

    System.out.println(libro1.getTitulo());
    libro1.esLargo();


    }
}

