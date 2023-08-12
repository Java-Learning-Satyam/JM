public class PaidUser implements Trackable {
    @Override
    public void track() {
        var today = new java.util.Date();
        System.out.println(today + ": is being tracked");
        var state = transaction(ChangeState.STATIONARY);
        PaidUser check = new PaidUser();
        check.logStage(state,"Hi premium user");
    }


}
