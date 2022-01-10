package principal;

public class Main {

    public static void main(String[] args) {
        // write your code here

        libro libro1 =new libro(111111, "El primer libro ","Fernando ",96);

        libro libro2 =new libro(222222, "El segundo libro ","David ",64);

        libro libro3 = new libro(33333333, "El tercer luibro", "RUBEN", 8582929);


        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());



        if(libro1.getNumPaginas() > libro2.getNumPaginas()){

            System.out.println(libro1.getTitulo() +" tiene más páginas");
        }else{
            System.out.println(libro2.getTitulo() + " tiene más páginas");
        }





        /* ARRAY

        int [] miArray = new int[9];

        for(int i = 0; i< miArray.length;i++){

            miArray[i]= (int) (Math.random()*100);

        }

        for(int i=0; i< miArray.length;i++){

            System.out.println("El array " + i +" "+ miArray[i]);

        }



         */

    }








    public static class libro {

        /*Atributos*/
        private int ISBN;
        private String titulo;
        private String autor;
        private int numPaginas;



        /*Constructores*/
        public libro(int ISBN, String Titulo, String Autor, int NumPaginas){
            this.ISBN=ISBN;
            this.titulo=Titulo;
            this.autor=Autor;
            this.numPaginas=NumPaginas;

        }

        /*Metodos*/

        public int getISBN() {
            return ISBN;
        }

        public void setISBN(int ISBN) {
            this.ISBN = ISBN;
        }

        public String getTitulo() {

            return titulo;
        }


        public void setTitulo(String titulo) {

            this.titulo = titulo;
        }

        public String getAutor() {

            return autor;
        }

        public void setAutor(String autor) {

            this.autor = autor;
        }

        public int getNumPaginas() {

            return numPaginas;
        }

        public void setNumPaginas(int numPaginas) {

            this.numPaginas = numPaginas;
        }


        public String toString(){

            return "El libro " +titulo+" con ISBN "+ISBN+ " creado por el autor " +autor+"tiene " +numPaginas+" páginas";
        }



    }
}