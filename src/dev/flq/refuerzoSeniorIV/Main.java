package dev.flq.refuerzoSeniorIV;

import dev.flq.RefuerzoSeniorIII.Music;
import dev.flq.RefuerzoSeniorIII.Podcast;

public class Main {

    public static void main(String[] args) {

        MediaCollection<Book> bookCollection = new MediaCollection<>("Mi coleccion de books");
        MediaCollection<Music> musicCollection = new MediaCollection<>("Mi coleccion de musics");
        MediaCollection<Podcast> podcastCollection = new MediaCollection<>("Mi colleccion de podcasts");

        Book b1 = new Book("El coronel","Gabo");
        Book b2 = new Book("Continuara", "S. Waldrom");

        Music m1 = new Music("Malo", "Gigantes");
        Music m2 = new Music("EL terremoto", "M. Elias");

        Podcast p1 = new Podcast("La liebre", "Menuel T");
        Podcast p2 = new Podcast("El afan", "Julio R");

        bookCollection.addItems(b1);
        bookCollection.addItems(b2);
        bookCollection.printItems();

        musicCollection.addItems(m1);
        musicCollection.addItems(m2);
        musicCollection.printItems();

        podcastCollection.addItems(p1);
        podcastCollection.addItems(p2);
        podcastCollection.printItems();



    }
}
