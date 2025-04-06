//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

// Create a new music library
        MusicLibrary myLibrary = new MusicLibrary("Rock Collection",
                "John Smith");
        // Add tracks to the library
        myLibrary.addTrack("Led Zeppelin - Stairway to Heaven");
        myLibrary.addTrack("Queen - Bohemian Rhapsody");
        myLibrary.addTrack("Pink Floyd - Comfortably Numb");
        myLibrary.addTrack("AC/DC - Back in Black");
        myLibrary.addTrack("Metallica - Nothing Else Matters");
        // Display all tracks
        myLibrary.displayTracks();
        // Create playlists
        myLibrary.createPlaylist("Favorites");
        myLibrary.createPlaylist("Party");
        // Add tracks to playlists
        myLibrary.addTrackToPlaylist("Queen - Bohemian Rhapsody",
                "Favorites");
        myLibrary.addTrackToPlaylist("Pink Floyd - Comfortably Numb",
                "Favorites");
        myLibrary.addTrackToPlaylist("AC/DC - Back in Black", "Party");
        myLibrary.addTrackToPlaylist("Metallica - Nothing Else Matters",
                "Party");
        // Display all playlists
        myLibrary.displayAllPlaylists();
        // Display the contents of the "Favorites" playlist
        myLibrary.displayPlaylist("Favorites");
        // Search for tracks with the phrase "Queen"
        myLibrary.searchTracks("Queen");
        // Remove a track from the library
        myLibrary.removeTrack("AC/DC - Back in Black");
        // Check if the track was removed from the playlist
        myLibrary.displayPlaylist("Party");
        System.out.println("Total number of tracks in the library: " +
                myLibrary.getTrackCount());
        System.out.println("Total number of playlists: " +
                myLibrary.getPlaylistCount());
    }

}