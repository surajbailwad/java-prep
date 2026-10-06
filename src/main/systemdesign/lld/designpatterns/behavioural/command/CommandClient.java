package main.systemdesign.lld.designpatterns.behavioural.command;

public class CommandClient {

    public void executeCommandPattern() {

        TV tv = new TV();
        Remote remote = new Remote();

        Command onCommand = new TVOffCommand(tv);
        remote.setCommand(onCommand);
        remote.pressButton();

    }


}
