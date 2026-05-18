package dev.flq.RefuerzoSeniorIII;

public class Main {

    public static void main(String[] args) {

        MediaCollection collection = new MediaCollection("Mi primera collection");

        //Veamos ahora y agreguemos unas medias Como Books, Music and Podcast...

        Book b1 = new Book("El coronel","Gabo");
        Book b2 = new Book("Continuara", "S. Waldrom");
        Music m1 = new Music("Malo", "Gigantes");
        Music m2 = new Music("EL terremoto", "M. Elias");
        Podcast p1 = new Podcast("La liebre", "Menuel T");
        Podcast p2 = new Podcast("El afan", "Julio R");

        //Ahora haciendo uso de collection vamos a gestionar cada una de las funcionalidades a realizar...
        collection.addMedia(b1);
        collection.addMedia(b2);
        collection.addMedia(m1);
        collection.addMedia(m2);
        collection.addMedia(p1);
        collection.addMedia(p2);

        collection.addMedia(new Book("Cien años de soledad","Gabo"));
        collection.addMedia(new Music("Mi corazon es tuyo","Negrito Osorio"));

        collection.printMediaItems();

        collection.removeMediaItem(b1);
        collection.removeMediaItem(b2);
        collection.removeMediaItem(p2);
        collection.removeMediaItem(p1);
        collection.removeMediaItem(m1);
        collection.removeMediaItem(m2);

        collection.printMediaItems();
    }
}
