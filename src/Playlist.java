import javax.sound.midi.Track;
import java.util.ArrayList;

public class Playlist {
    private ArrayList<String> tracks;
    private String name;

    public Playlist(String name) {
        this.name = name;
        this.tracks = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addTrack(String track) {
        if (!tracks.contains(track)) {
            this.tracks.add(track);
        } else {
            System.out.println("Track " + track + " already exists");
        }
    }

    public void removeTrack(String track) {
        boolean isRemoved = this.tracks.remove(track);
        if (!isRemoved) {
            System.out.println("Track " + track + " does not exist");
        }

    }

    public void displayTracks() {
        System.out.println("Tracks: " + this.name);
        if (this.tracks.isEmpty()) {
            System.out.println("Nothing to show");
        } else {
            for (String track : this.tracks) {
                System.out.println("-" + track);
            }
        }
    }


}
