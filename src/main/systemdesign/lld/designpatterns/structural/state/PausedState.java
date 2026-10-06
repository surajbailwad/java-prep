package main.systemdesign.lld.designpatterns.structural.state;

public class PausedState implements State {
    @Override
    public void pressPlay(MediaPlayer mediaPlayer) {
        System.out.println("Playing Music...");
        mediaPlayer.setState(new PlayingState());
    }
}
