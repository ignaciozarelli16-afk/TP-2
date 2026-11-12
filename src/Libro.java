public class Libro {
   private String titulo;
    int paginas;
    Boolean Longitud = false;
  private void mostrarDatos(){
    
   System.out.println("El libro se llama:  "+ titulo + " y tiene:  "+ paginas + " paginas");
   
    }
   
   public void esLargo(){
if (paginas >= 300){
    Longitud = true;
    if(Longitud = true){
    System.out.println("El libro es Largo");
} else {
    System.out.println("El libro es Corto");
}

    }
    }

   public String getTitulo() {
    return titulo;
   }

   public int getPaginas() {
    return paginas;
   }

   public Boolean getLongitud() {
    return Longitud;
   }

   public void setTitulo(String titulo) {
    this.titulo = titulo;
   }

   public void setPaginas(int paginas) {
    this.paginas = paginas;
   }

   public void setLongitud(Boolean longitud) {
    Longitud = longitud;
   }
    
    
}
