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

    private static void simulateTimeStep() {
        if (river[i] != null) {
            // Determine the new position
            int newPosition = getRandomMove(i);
            if (newPosition != i) {
                if (river[newPosition] == null) {
                    // Move the animal to the new position
                    river[newPosition] = river[i];
                    river[i] = null;
                } else if (river[newPosition].getClass() == river[i].getClass()) {
                    // Same type collision: Reproduction
                    reproduceAnimal();
                } else {
                    // Different type collision: Bear eats Fish
                    if (river[i] instanceof Bear && river[newPosition] instanceof Fish) {
                        river[newPosition] = river[i];
                        river[i] = null;
                    }
                }
            }
        }
    }

    private static int getRandomMove(int index) {
        int move = random.nextInt(3) - 1; // -1 = left, 0 = stay, +1 = right
        int newPosition = index + move;
        if (newPosition < 0 || newPosition >= RIVER_SIZE) {
            return index; // Out of bounds: stay in place
        }
        return newPosition;
    }
}
