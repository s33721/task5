import java.util.ArrayList;
import java.util.Objects;

public class MusicLibrary {
    private final ArrayList<String> tracks;
    private final ArrayList<Playlist> playlists;
    private final String name;
    private final String owner;

    public MusicLibrary(String name, String owner) {
        this.tracks = new ArrayList<>();
        this.playlists = new ArrayList<>();
        this.name = name;
        this.owner = owner;
    }

    public void addTrack(String track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        } else {
            System.out.println("Track already exists");
        }
    }

    public void removeTrack(String track) {
        if (tracks.remove(track)) {
            System.out.println("Track removed " + track);
        } else {
            System.out.println("Track does not exist");
        }
    }

    public void displayTracks() {
        if (this.tracks.isEmpty()) {
            System.out.println("No tracks found");
        } else {
            for (String track : tracks) {
                System.out.println(track);
            }
        }
    }

    public void searchTracks(String phrase) {
        if (tracks.contains(phrase)) {
            System.out.println("Track found " + phrase);
        } else {
            System.out.println("Track does not exist");
        }
    }

    public Playlist findPlaylist(String playlistName) {
        for (Playlist playlist : playlists) {
            if (playlist.getName().equalsIgnoreCase(playlistName)) {
                System.out.println("Playlist found " + playlist.getName());
                return playlist;
            }
        }
        System.out.println("Playlist does not exist");
        return null;
    }

    public void createPlaylist(String playlistName) {
        var existingPlayList = findPlaylist(playlistName);
        if (existingPlayList != null) {
            System.out.println("Playlist already exists");
        } else {
            this.playlists.add(new Playlist(playlistName));
        }
    }

    public void addTrackToPlaylist(String track, String playlistName) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        }
        Playlist existingPlaylist = findPlaylist(playlistName);
        if (existingPlaylist != null) {
            existingPlaylist.addTrack(track);
        } else {
            System.out.println("Playlist does not exist");
        }
    }

    public void displayPlaylist(String playlistName) {
        Playlist existingPlaylist = findPlaylist(playlistName);
        if (existingPlaylist != null) {
            existingPlaylist.displayTracks();
        } else {
            System.out.println("Playlist does not exist");
        }
    }

    public void displayAllPlaylists() {
        for (Playlist playlist : playlists){
            playlist.displayTracks();
        }
    }

    public int getTrackCount() {
        return tracks.size();
    }

    public int getPlaylistCount() {
        return playlists.size();
    }


}



