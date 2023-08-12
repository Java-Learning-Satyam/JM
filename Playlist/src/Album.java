import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String song, double duration) {
        //if song present , no able to add
        boolean ret = true;
        for (var check : songs) {
            if (songs.contains(song)){
                ret = false;
            }
        }

        Song newSong = new Song(song,duration);
        songs.add(newSong);
        System.out.println("addSong " + newSong.getTitle() + " success");
        return ret;
    }
    public Song findSong(String title){
        if (!songs.isEmpty()) {
            for (Song s : songs) {
                if (s.getTitle().equals(title)) {
                    return s;
                }
            }
        }
        return null;
    }
    public boolean addToPlayList(int tracknum, LinkedList<Song> playList){
       if (tracknum <= 0 || tracknum >songs.size()) {
           return false;
       }
       Song songToAdd = songs.get(tracknum -1);
       String songToAddTitle = songToAdd.getTitle();

        ListIterator<Song> playlistIterator = playList.listIterator();
        while (playlistIterator.hasNext()) {
            if (playlistIterator.next().getTitle().compareTo(songToAddTitle) == 0) {
                return false;
            }
        }
        playList.add(songToAdd);
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        Song songToAdd = findSong(title);
        if (songToAdd == null) {
            return false;
        }

        ListIterator<Song> playListIterator = playList.listIterator();
        while (playListIterator.hasNext()) {
            if (playListIterator.next().getTitle().compareTo(songToAdd.getTitle()) == 0) {
                return false;
            }
        }
        playList.add(songToAdd);
        return true;
    }
}
