import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {

    //member vars
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song songToAdd = this.songs.findSong(trackNumber);
        if (songToAdd != null) {
            playList.add(songToAdd);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        //verify the song exists
        Song songToAdd = this.songs.findSong(title);
        if (songToAdd == null) {
            // The song was not found
            System.out.println("The song " + title + " is bot in this album");
            return false;
        }
        // Check if the song is already in the playList
        ListIterator<Song> playListIterator = playList.listIterator();
        while (playListIterator.hasNext()) {
            if  (playListIterator.next().getTitle().compareTo(songToAdd.getTitle()) == 0) {
                // The song is already in the playlist
                return false;
            }
        }

        // Add the song to the end of the playList.
        playList.add(songToAdd);
        return true;
    }

    public static class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            songs = new ArrayList<Song>();
        }

        private boolean add(Song song) {
            if (findSong(song.getTitle()) != null) {
                return false;
            }

            this.songs.add(song);
            return true;
        }

        private Song findSong(String title) {
            for (Song el : this.songs) {
                if (el.getTitle().equals(title)){
                    return el;
                }
            }
            return  null;
        }

        private Song findSong(int trackNo) {
            int humanCount = trackNo - 1;
            if (humanCount > 0 && humanCount < songs.size()) {
                return songs.get(humanCount);
            }
            return null;
        }

    }
}

//My solution to Inner Class PlayList Solution