enum ChangeState implements Trackable {
    STATIONARY,MOVING,ON_DRIVE;

    @Override
    public void track() {
        if (this == MOVING || this == ON_DRIVE){
            System.out.println("Monitoring " + this);
        }
    }

    public ChangeState getNextStage() {
        ChangeState[] allStage = values();
        return allStage[(ordinal() + 1) % allStage.length];
    }
}

interface Trackable {
     void track();
     default ChangeState transaction(ChangeState state) {
         ChangeState changingState = ChangeState.STATIONARY.getNextStage();
         return changingState;
     }

    private static void log(String description){
        var today = new java.util.Date();
        System.out.println(today + ": " + description);
    }

    default void logStage(ChangeState stage, String description) {

        description = stage + ": " + description;
        log(description);
    }

}
public class FreeUser implements Trackable {
    @Override
    public void track() {
        var today = new java.util.Date();
        System.out.println(today + ": is being tracked");
    }

}
