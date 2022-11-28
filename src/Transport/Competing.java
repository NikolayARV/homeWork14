package Transport;

public interface Competing {
    void goToPitStop();

    void getBestTime(int bestTime);

    void getMaxSpeed(int maxSpeed);

    void startMoving();

    void stopMoving();

    void refill();
}
