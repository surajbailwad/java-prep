package main.systemdesign.lld.designpatterns.behavioural.state;

public class PausedState implements State {
    @Override
    public void pressPlay(MediaPlayer mediaPlayer) {
        System.out.println("Playing Music...");
        mediaPlayer.setState(new PlayingState());
    }
}
