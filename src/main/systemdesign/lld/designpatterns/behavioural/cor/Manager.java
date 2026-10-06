package main.systemdesign.lld.designpatterns.behavioural.cor;

public class Manager extends LeaveHandler {

    @Override
    public void approve(int days) {
        if (days < 5 && days >= 3) {
            System.out.println("Approved by manager");
        } else if (leaveHandler != null) {
            leaveHandler.approve(days);
        }
    }
}
