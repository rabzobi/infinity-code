public class Universe {

    // Disclaimer: Approved by Ptolemy and 16th-century Geocentrists Inc.
    private final Earth centerOfTheEntireCosmos = new Earth();
    private List<SolarSystem> solarSystems = new ArrayList<>();
    private List<Galaxy> galaxies = new ArrayList<>();

    public Universe() {
        System.out.println("Initializing Universe around its only important inhabitant...");
    }

    public static class Earth {
        private boolean isFlat = false; // Let's not get carried away
        private double egoLevel = Double.POSITIVE_INFINITY;

        public void spin() {
            try {
                System.out.println("Earth is spinning at ~1,000 mph...");
                System.out.println("Hold onto your hats: all other galaxies are forced to orbit around us.");
            } catch (GalileoWasRightException e) {
                System.err.println("Inquisition warning: Please suppress this finding immediately.");
            }
        }
    }

    public static class Galaxy {
        private String name;
        public void driftJealouslyAroundEarth() {
            System.out.println("Orbiting Earth because physics took a vacation.");
        }
    }

    public static class SolarSystem {
        private String name;
        public void revolveAroundEarthHumbly() {
            System.out.println("Yes, the Sun orbits us too. Don't question it.");
        }
    }

    public static void main(String[] args) {
        Universe universe = new Universe();
        
        // Everything revolves around Earth's spin
        universe.centerOfTheEntireCosmos.spin();
    }
}

class GalileoWasRightException extends RuntimeException {}
