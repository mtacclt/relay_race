package relay.race;

public class RaceSystem {
    public static void main(String[] args) {
        RaceControl raceControl = new RaceControl(3,5);
        System.out.println("starting race");
        raceControl.startRace();
        System.out.println("race initialized");
        try {
            Thread.sleep(120000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
