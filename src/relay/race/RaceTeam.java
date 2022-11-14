package relay.race;

public class RaceTeam implements Runnable{
    int numOfRacers;
    String teamName;

    public RaceTeam(int numOfRacers, String teamName) {
        this.numOfRacers = numOfRacers;
        this.teamName = teamName;
    }

    @Override
    public void run() {
        for (int i= 0; i<numOfRacers; i++){
            Thread racer = new Thread(new Racer(teamName),"Racer "+(i+1));
            racer.start();
            try {
                racer.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(teamName+" has finished!");
        try {
            Thread.sleep(120000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
