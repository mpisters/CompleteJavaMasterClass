package ArraysListsAutoboxingAndUnboxing;

import java.util.*;

public class LinkedListChallenge {

    public static void main(String[] args) {
        Song song1 = new Song("a", "123");
        Song song2 = new Song("b", "123");
        Song song3 = new Song("c", "123");
        Song song4 = new Song("d", "123");
        Song song5 = new Song("e", "123");
        Song song6 = new Song("f", "123");
        Song song7 = new Song("g", "123");
        LinkedList<Song> playlist = new LinkedList<Song>();
        playlist.add(song1);
        playlist.add(song2);
        playlist.add(song3);
        playlist.add(song4);
        playlist.add(song5);
        playlist.add(song6);
        playlist.add(song7);
        playPlayList(playlist);
    }

    private static void playPlayList(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean isForward = true;
        boolean isChanged = false;
        ListIterator<Song> i = playlist.listIterator();
        if (playlist.isEmpty()) {
            System.out.println("No songs available");
        } else {
            System.out.println("Now playing: " + i.next().getTitle());
            showOptions();
        }
        while (!quit) {
            System.out.println("Enter a number: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                switch (number) {
                    case 1:
                        quit = true;
                        System.out.println("Shutting down...");
                        break;
                    case 2:
                        if (!isForward) {
                            if (i.hasNext()) {
                                i.next();
                            }
                            isForward = true;
                        }
                        if (i.hasNext()) {
                            System.out.println("Now playing: " + i.next().getTitle());
                        } else {
                            System.out.println("This is the last song of the playList");
                            isForward = false;
                        }
                        break;
                    case 3:
                        if (isForward) {
                            if (i.hasPrevious()) {
                                i.previous();
                            }
                            isForward = false;
                        }
                        if (i.hasPrevious()) {
                            System.out.println("Now playing: " + i.previous().getTitle());
                        } else {
                            System.out.println("This is the first song of the playList");
                            isForward = true;
                        }
                        break;
                    case 4:
                        if (i.hasNext()) {
                            i.next();
                            System.out.println("Replayed song: " + i.previous().getTitle());
                            isForward = false;
                            isChanged = true;
                        } else if (!isChanged) {
                            i.previous();
                            System.out.println("Replayed song: " + i.next().getTitle());
                            isForward = true;
                        }
                        break;
                    case 5:
                        if (playlist.size() > 0) {
                            i.remove();
                            if (i.hasNext()) {
                                System.out.println("Now playing: " + i.next().getTitle());
                            } else if (i.hasPrevious()) {
                                System.out.println("Now playing: " + i.previous().getTitle());
                            }
                        }
                        break;
                    case 6:
                        addSong(i, playlist, scanner);
                        break;
                    case 7:
                        showOptions();
                        break;
                    default:
                        System.out.println("Non valid number");
                        break;
                }
            }
            scanner.nextLine();
        }
    }

    private static void addSong(ListIterator<Song> i, LinkedList<Song> playList, Scanner scanner) {
        System.out.println("Enter a song name: ");
        String songTitle = scanner.nextLine();
        System.out.println("Enter duration of song: ");
        String duration = scanner.nextLine();
        Song song = new Song(songTitle, duration);
        playList.addLast(song);
    }

    private static void showOptions() {
        System.out.println("1 - Quit \n 2 - Skip song forward \n 3 - Skip song backwards " +
                "\n 4 - Replay a song \n 5 - Remove song\n" +
                "6 - Add album");
    }

}
