public class Libro {
    private String titulo, autor;
    private int ano;
    private short numPaginas;
    private float valoracion;

    //constructor vacio
    public Libro(){
    }

    //constructor con parametros
    public Libro(String titulo, String autor, int ano, short numPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.numPaginas = numPaginas;
    }

    public void amosar(){
        System.out.println("Titulo: " + titulo + "\nAutor: " + autor + "\nAño: " + ano + "\nNumer de paginas: " + numPaginas + "\nValoracion: " + valoracion + "\n");
    }
    //getters
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAno(){
        return ano;
    }

    public short getNumPaginas(){
        return numPaginas;
    }

    public float getValoracion(){
        return valoracion;
    }

    //setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void setNumPaginas(short numPaginas){
        this.numPaginas = numPaginas;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }
}
