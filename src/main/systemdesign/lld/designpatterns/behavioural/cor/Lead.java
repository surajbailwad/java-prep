package main.systemdesign.lld.designpatterns.behavioural.cor;

public class Lead extends LeaveHandler {

    @Override
    public void approve(int days) {
        if (days < 3) {
            System.out.println("Approved by lead");
        } else if (leaveHandler != null) {
            leaveHandler.approve(days);
        }
    }
}
