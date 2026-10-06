package main.systemdesign.lld.designpatterns.structural.state;

public class PlayingState implements State {
    @Override
    public void pressPlay(MediaPlayer mediaPlayer) {
        System.out.println("Pausing music...");
        mediaPlayer.setState(new PausedState());

    }
}
