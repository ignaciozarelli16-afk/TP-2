public class Libro {
   public String titulo;
    int paginas;

  public void mostrarDatos(){
    
   System.out.println("El libro se llama:  "+ titulo + " y tiene:  "+ paginas + " paginas");
    }
   
  
    public boolean esLargo(){
        return paginas > 300;
    }
    

   
    
    
}
