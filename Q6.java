interface Playlist {
    void addSong(String song);
    void removeSong(String song);
}

class MediaPlayer {
    void play() {
        System.out.println("Playing media...");
    }

    void pause() {
        System.out.println("Media paused.");
    }

    void stop() {
        System.out.println("Media stopped.");
    }
}

class VideoPlayer extends MediaPlayer implements Playlist {
    @Override
    public void addSong(String song) {
        System.out.println(song + " added to playlist.");
    }

    @Override
    public void removeSong(String song) {
        System.out.println(song + " removed from playlist.");
    }

    void rewind() {
        System.out.println("Video rewinding...");
    }

    void fastForward() {
        System.out.println("Fast-forwarding video...");
    }
}

public class Q6 {
    public static void main(String[] args) {
        VideoPlayer player = new VideoPlayer();
        player.play();
        player.rewind();
        player.fastForward();
        player.pause();
        player.stop();
        player.addSong("Jaalma");
        player.removeSong("Jaalma");
    }
}
