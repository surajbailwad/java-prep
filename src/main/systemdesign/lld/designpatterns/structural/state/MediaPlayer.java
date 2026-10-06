package main.systemdesign.lld.designpatterns.structural.state;

public class MediaPlayer {
    private State state;

    public MediaPlayer() {
        this.state = new PausedState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void press() {
        state.pressPlay(this);
    }
}
