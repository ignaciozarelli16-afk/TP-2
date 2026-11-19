public class Libro {
   public String titulo;
   int paginas;
   String autor;
  public void mostrarDatos(){
    
   System.out.println("El libro se llama:  "+ titulo +"Autor: "+autor+ " y tiene:  "+ paginas + " paginas");
    }
   
  
    public boolean esLargo(){
        return paginas > 300;
    }
    

   
    
    
}
