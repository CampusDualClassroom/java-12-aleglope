package com.campusdual.classroom;

public class Car {
    public int tachometer;
    public int speedometer;
    public int wheelsAngle;
    public String gear;
    public static final int MAX_SPEED = 120;
    private static final int MAX_WHEEL_ANGLE = 45;
    private static final int MIN_WHEEL_ANGLE = -45;
    private static final int IDLE_RPM = 700;

    public Car() {
        this.tachometer = 0;
        this.speedometer = 0;
        this.wheelsAngle = 0;
        this.gear = "N";
    }

    public boolean isTachometerGreaterThanZero() {
        return tachometer > 0;
    }

    public boolean isTachometerEqualToZero() {
        return tachometer == 0;
    }

    public void start() {
        if (tachometer == 0) {
            tachometer = IDLE_RPM;
        }
    }

    public void stop() {
        if (speedometer == 0) {
            tachometer = 0;
        }
    }

    public void accelerate() {
        if (tachometer > 0) {
            speedometer = Math.min(speedometer + 5, MAX_SPEED);
            tachometer = IDLE_RPM + (speedometer * 10);
        }
    }

    public void brake() {
        if (speedometer > 0) {
            speedometer = Math.max(speedometer - 5, 0);
            tachometer = IDLE_RPM + (speedometer * 10);
        }
    }

    public void turnAngleOfWheels(int angle) {
        wheelsAngle = Math.max(MIN_WHEEL_ANGLE, Math.min(MAX_WHEEL_ANGLE, angle));
    }

    public void setReverse(boolean reverse) {
        if (speedometer == 0) {
            gear = reverse ? "R" : "D";
        }
    }
}