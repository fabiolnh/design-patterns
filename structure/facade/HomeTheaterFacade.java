package structure.facade;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        dvdPlayer.on();
        dvdPlayer.play(movie);
        projector.on();
        projector.setInput("DVD Player");
        soundSystem.on();
        soundSystem.setVolume(10);
        System.out.println("Movie is playing");
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        dvdPlayer.off();
        projector.off();
        soundSystem.off();
    }
}