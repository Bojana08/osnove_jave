package p02_06_2022_zadatak_3;

public class TimeControl extends Control {

    private boolean idiNapred;

    public TimeControl(boolean stranaVidea) {
        this.idiNapred = stranaVidea;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (idiNapred) {
            videoPlayer.setTrenutnoVremeVidea(videoPlayer.getTrenutnoVremeVidea() + 15);
        } else {
            videoPlayer.setTrenutnoVremeVidea(videoPlayer.getTrenutnoVremeVidea() - 15);
        }
        if (videoPlayer.getTrenutnoVremeVidea() + 15 > videoPlayer.getDuzinaVidea()) {
            videoPlayer.setTrenutnoVremeVidea(videoPlayer.getDuzinaVidea());
        }
    }
}
