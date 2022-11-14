package relay.race;

import java.util.Random;

public class Racer implements Runnable {

    String teamName;

    public Racer(String teamName){
    this.teamName = teamName;
    }

    @Override
    public void run() {

        Random random = new Random();
        try {
            Thread.sleep(random.nextInt(2000)+3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+" for "+teamName+" has finished his section!");
    }
}
