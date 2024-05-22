package Bookingmanagement;

public class Fare {

    /**
     * Calculates the fare based on the number of days, rate per day, and occupancy.
     * @param days the number of days of stay
     * @param rate the rate per day
     * @param occupancyType the type of occupancy (1 for single, 2 for double)
     * @return the total fare
     */
    public int fareCalculator(int days, int rate, int occupancyType) {
        if (days < 1 || rate < 0) {
            throw new IllegalArgumentException("Days and rate must be positive. Days: " + days + ", Rate: " + rate);
        }

        switch (occupancyType) {
            case 1:
                // Single occupancy
                return days * rate;
            case 2:
                // Double occupancy
                return days * rate * 2;
            default:
                throw new IllegalArgumentException("Invalid occupancy type: " + occupancyType);
        }
    }
}