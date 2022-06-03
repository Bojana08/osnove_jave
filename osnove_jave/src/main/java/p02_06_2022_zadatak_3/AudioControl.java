package p02_06_2022_zadatak_3;

public class AudioControl extends Control {

    private boolean pojacajZvuk;

    public AudioControl(boolean pojacajZvuk) {
        this.pojacajZvuk = pojacajZvuk;
    }

    public boolean isPojacajZvuk() {
        return pojacajZvuk;
    }

    public void setPojacajZvuk(boolean pojacajZvuk) {
        this.pojacajZvuk = pojacajZvuk;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (isPojacajZvuk()) {
            videoPlayer.setJacinaZvuka(videoPlayer.getJacinaZvuka() + 1);
        } else {
            videoPlayer.setJacinaZvuka(videoPlayer.getJacinaZvuka() - 1);
        }
        if (videoPlayer.getJacinaZvuka() < 0) {
            videoPlayer.setJacinaZvuka(0);
        }
        if (videoPlayer.getJacinaZvuka() > 100) {
            videoPlayer.setJacinaZvuka(100);
        }
    }
}
