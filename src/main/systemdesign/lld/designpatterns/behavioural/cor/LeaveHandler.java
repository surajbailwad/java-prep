package main.systemdesign.lld.designpatterns.behavioural.cor;

abstract class LeaveHandler {
    public LeaveHandler leaveHandler;

    public void setNextHandler(LeaveHandler handler) {
        if (handler != null) {
            this.leaveHandler = handler;
        }
    }

    public abstract void approve(int days);
}
