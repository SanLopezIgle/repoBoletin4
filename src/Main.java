public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro ("AAA", "BBB", 2022, (short)120);
        libro1.amosar();


        Libro libro2 = new Libro();

        libro2.setTitulo("aaa");
        libro2.setAutor("bbb");
        libro2.setAno(2020);
        libro2.setNumPaginas((short)96);
        libro2.setValoracion(3.4f);

        libro2.amosar();
    }
}