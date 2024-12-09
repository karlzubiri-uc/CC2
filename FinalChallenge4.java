//Zubiri, Karl Stephen V.
//CITCS 1N, CC2
package com.zubirikarl.finalchallenge4;

class MusicPlaylist {
    // Node class for the circular doubly linked list
    private static class SongNode {
        String songName;
        SongNode next, prev;

        SongNode(String songName) {
            this.songName = songName;
            this.next = this;
            this.prev = this; // Points to itself to form a circular structure
        }
    }

    private SongNode current; // Points to the currently playing song
    private int size; // Keeps track of the number of songs in the playlist

    public MusicPlaylist() {
        current = null;
        size = 0;
    }

    // Add a song to the playlist
    public void addSong(String songName) {
        SongNode newNode = new SongNode(songName);
        if (current == null) {
            // First song in the playlist
            current = newNode;
        } else {
            // Insert at the end
            SongNode tail = current.prev;
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = current;
            current.prev = newNode;
        }
        size++;
        System.out.println("Added song: " + songName);
    }

    // Remove the current song
    public void removeCurrentSong() {
        if (current == null) {
            System.out.println("The playlist is empty.");
            return;
        }

        System.out.println("Removed song: " + current.songName);

        if (current.next == current) {
            // Only one song in the playlist
            current = null;
        } else {
            // Remove the current song
            SongNode prevNode = current.prev;
            SongNode nextNode = current.next;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
            current = nextNode; // Move to the next song
        }
        size--;
    }

    // Move to the next song
    public void nextSong() {
        if (current == null) {
            System.out.println("The playlist is empty.");
        } else {
            current = current.next;
            System.out.println("Now playing: " + current.songName);
        }
    }

    // Move to the previous song
    public void previousSong() {
        if (current == null) {
            System.out.println("The playlist is empty.");
        } else {
            current = current.prev;
            System.out.println("Now playing: " + current.songName);
        }
    }

    // Display the current song
    public void displayCurrentSong() {
        if (current == null) {
            System.out.println("No song is currently playing.");
        } else {
            System.out.println("Currently playing: " + current.songName);
        }
    }

    // Display the entire playlist
    public void displayPlaylist() {
        if (current == null) {
            System.out.println("The playlist is empty.");
            return;
        }

        System.out.println("Playlist:");
        SongNode temp = current;
        do {
            System.out.println("- " + temp.songName);
            temp = temp.next;
        } while (temp != current);
    }
}

// Main class for user interaction
public class FinalChallenge4 {
    public static void main(String[] args) {
        MusicPlaylist playlist = new MusicPlaylist();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while (true) {
            System.out.println("\n--- Music Playlist Manager ---");
            System.out.println("1. Add a song");
            System.out.println("2. Remove the current song");
            System.out.println("3. Next song");
            System.out.println("4. Previous song");
            System.out.println("5. Display current song");
            System.out.println("6. Display playlist");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter song name: ");
                    String songName = scanner.nextLine();
                    playlist.addSong(songName);
                    break;
                case 2:
                    playlist.removeCurrentSong();
                    break;
                case 3:
                    playlist.nextSong();
                    break;
                case 4:
                    playlist.previousSong();
                    break;
                case 5:
                    playlist.displayCurrentSong();
                    break;
                case 6:
                    playlist.displayPlaylist();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
