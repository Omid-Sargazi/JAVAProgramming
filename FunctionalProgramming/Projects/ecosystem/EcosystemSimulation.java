package FunctionalProgramming.Projects.ecosystem;

import java.util.Random;

public class EcosystemSimulation {
    private static final int RIVER_SIZE = 10;
    private static final int INITIAL_BEAR_COUNT = 3;
    private static final int INITIAL_FISH_COUNT = 3;
    private static Animal[] river = new Animal[RIVER_SIZE];
    private static Random random = new Random();

    public static void main(String[] args) {

    }

    private static void initializeRiver() {
        int bearCount = 0;
        int fishCount = 0;

        while (bearCount < INITIAL_BEAR_COUNT) {
            int position = random.nextInt(RIVER_SIZE);
            if (river[position] == null) {
                river[position] = new Bear();
                bearCount++;
            }
        }

        while (fishCount < INITIAL_FISH_COUNT) {
            int position = random.nextInt(RIVER_SIZE);
            if (river[position] == null) {
                river[position] = new Fish();
                fishCount++;
            }
        }

    }
}
