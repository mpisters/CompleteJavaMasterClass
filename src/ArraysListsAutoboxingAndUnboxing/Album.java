package ArraysListsAutoboxingAndUnboxing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private ArrayList<Song> songs;
    private String name;
    private String artist;

    public Album(ArrayList<Song> songs, String name, String artist) {
        this.songs = songs;
        this.name = name;
        this.artist = artist;
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null){
            this.songs.add(new Song(title, String.valueOf(duration)));
            return true;
        }
        return false;
    }

    private Song findSong(String title){
        for(Song checkedSong: this.songs){
            if(checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        int index = trackNumber - 1;
        if(index >= 0 && index <= this.songs.size()){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album doesn't have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        Song checkedSong = findSong(title);
        if(checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in the album");
        return false;
    }

}