package dev.flq.RefuerzoSeniorIII;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MediaCollection {

    private String name;
    private List<MediaItem> mediaItems = new ArrayList<>();

    public MediaCollection(String name) {
        this.name = name;
    }

    public void addMedia(MediaItem mediaItem) {

        if (Objects.isNull(mediaItem)) {
            System.out.println("No puede ser null");
            return;
        }

        if (!mediaItems.contains(mediaItem)) {
            mediaItems.add(mediaItem);
        }
    }

    public boolean removeMediaItem(MediaItem mediaItem) {
        return mediaItems.remove(mediaItem);
    }

    private List<MediaItem> getMediaItems() {
        return mediaItems;
    }

    public void printMediaItems() {
        System.out.println(getMediaItems());
    }
}
