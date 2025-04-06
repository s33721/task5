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

    public void searchTracks(String track) {
        if (tracks.contains(track)) {
            System.out.println("Track found " + track);
        } else {
            System.out.println("Track does not exist");
        }
    }

    public boolean findPlaylist(String name) {
        for (Playlist playlist : playlists) {
            if (playlist.getName().equalsIgnoreCase(name)) {
                System.out.println("Playlist found " + playlist);
                return true;
            }
        }
        System.out.println("Playlist does not exist");
        return false;
    }

    public void createPlaylist(String playlistName) {
        var existingPlayList = findPlaylist(playlistName);
        if (existingPlayList) {
            System.out.println("Playlist already exists");
        } else {
            this.playlists.add(new Playlist(playlistName));
        }
    }

    public void addTrackToPlaylist(String track, String playlistName) {
        for (Playlist playlist : playlists) {
            if (playlist.getName().equalsIgnoreCase(playlistName)) {
                playlist.addTrack(track);
            } else {
                System.out.println("Playlist does not exist");
            }
        }
    }
    public void displayPlaylist(String playlistName) {
        for (Playlist playlist : playlists) {
            System.out.println(playlist);
        }
    }
    public void displayAllPlaylists() {
        for (int i = 0; i < playlists.size(); i++) {
            System.out.println(playlists.get(i));
        }
    }
    public int getTrackCount() {
        return tracks.size();
    }
    public int getPlaylistCount() {
        return playlists.size();
    }


}



