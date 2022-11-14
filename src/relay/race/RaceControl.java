package relay.race;

public class RaceControl {
    int numberOfTeams;
    int racersPerTeam;

    RaceTeam[] teams;

    public RaceControl(int numberOfTeams, int racersPerTeam) {
        this.numberOfTeams = numberOfTeams;
        this.racersPerTeam = racersPerTeam;
        teams = new RaceTeam[numberOfTeams];
    }

    public void startRace(){
        for (int i = 0; i < numberOfTeams; i++){
            teams[i] = new RaceTeam(racersPerTeam,"Team "+i);
            Thread teamThread = new Thread(teams[i],"Team"+(i+1));
            teamThread.start();
        }
        try {
            Thread.sleep(120000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
