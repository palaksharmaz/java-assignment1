class Distance {
    double distanceInMiles;

    Distance(double distanceInMiles) {
        this.distanceInMiles = distanceInMiles;
    }

    void travelTime() {
        double time = distanceInMiles / 60; 
        System.out.println("Time to travel " + distanceInMiles + " miles at 60 mph: " + time + " hours.");
    }
}
class DistanceMKS extends Distance {
    DistanceMKS(double distanceInMiles) {
        super(distanceInMiles);
    }

    @Override
    void travelTime() {
        double distanceInKilometers = distanceInMiles * 1.60934; 
        double time = distanceInKilometers / 100; 
        System.out.println("Time to travel " + distanceInKilometers + " kilometers at 100 km/s: " + time + " seconds.");
    }
}
public class q42 {
    public static void main(String[] args) {
        Distance distance = new Distance(120); 
        DistanceMKS distanceMKS = new DistanceMKS(120); 

        System.out.println("Base Class Output:");
        distance.travelTime();

        System.out.println("\nDerived Class Output:");
        distanceMKS.travelTime();
    }
}