package dev.flq.refuerzoSeniorII;

import dev.flq.refuerzoSeniorI.Book;
import dev.flq.refuerzoSeniorI.Library;
import dev.flq.refuerzoSeniorI.Movie;
import dev.flq.refuerzoSeniorI.MovieCollection;

public class Main {

    public static void main(String[] args) {

        dev.flq.refuerzoSeniorI.Library lb = new Library("Municipal");

        dev.flq.refuerzoSeniorI.Book b1 = new dev.flq.refuerzoSeniorI.Book("Cien años de soledad", "GGM");
        dev.flq.refuerzoSeniorI.Book b2 = new dev.flq.refuerzoSeniorI.Book("La Odisea", "Dicaprio");
        dev.flq.refuerzoSeniorI.Book b3 = new Book("La vida de Dios en el alma del hombre", "Henry Scougal");

        lb.addBook(b1);
        lb.addBook(b2);
        lb.addBook(b3);

        lb.removeBook(b1);
        lb.removeBook(b3);

        lb.printBooks();

        System.out.println("\n=============\n");

        MovieCollection mc1 = new MovieCollection("Peliculas Clasicas");

        Movie movie1 = new Movie("El auto fantastico", "El Will");
        ItemCollection movie2 = new dev.flq.refuerzoSeniorII.Movie("Rambo", "Silvestre S");
        Movie movie3 = new Movie("Getsemani", "Will Smith");

        mc1.addMovie(movie1);
        mc1.printMovies();


        System.out.println("\n=============\n");

        CollectionItemsService service1 = new CollectionItemsService("PrimerServicio");
        Podcast podcast = new Podcast("Como crear gasolina casera", "Fabio Ledezma");
        Podcast podcast2 = new Podcast("Vivir sabroso", "F Marquez");

        //Ahora voy a crear musica

        Music music1 = new Music("Mi corzon es tuyo", "Dagoberto Osorio");
        Music music2 = new Music("Tuya es la Gloria", "Beto P");

        service1.addItem(podcast);
        service1.addItem(podcast2);
        service1.printItems();

        service1.addItem(music1);
        service1.addItem(music2);
        service1.printItems();

        service1.addItem(movie2);
        service1.printItems();


    }
}
