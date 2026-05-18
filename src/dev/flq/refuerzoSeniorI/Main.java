package dev.flq.refuerzoSeniorI;

public class Main {

    public static void main(String[] args) {

        Library lb = new Library("Municipal");

        Book b1 = new Book("Cien años de soledad", "GGM");
        Book b2 = new Book("La Odisea", "Dicaprio");
        Book b3 = new Book("La vida de Dios en el alma del hombre", "Henry Scougal");

        lb.addBook(b1);
        lb.addBook(b2);
        lb.addBook(b3);

        lb.removeBook(b1);
        lb.removeBook(b3);

        lb.printBooks();

        System.out.println("\n=============\n");

        MovieCollection mc1 = new MovieCollection("Peliculas Clasicas");

        Movie movie1 = new Movie("El auto fantastico", "El Will");
        Movie movie2 = new Movie("Rambo", "Silvestre S");
        Movie movie3 = new Movie("Getsemani", "Will Smith");

        mc1.addMovie(movie1);
        mc1.printMovies();

    }
}
