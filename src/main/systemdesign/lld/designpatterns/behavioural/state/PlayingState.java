package main.systemdesign.lld.designpatterns.behavioural.state;

public class PlayingState implements State {
    @Override
    public void pressPlay(MediaPlayer mediaPlayer) {
        System.out.println("Pausing music...");
        mediaPlayer.setState(new PausedState());

    }
}
