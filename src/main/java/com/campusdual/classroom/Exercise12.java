package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car car = new Car();

        // Verificar si el tacómetro es cero
        System.out.println("Is tachometer zero? " + car.isTachometerEqualToZero());

        // Encender el coche
        car.start();
        System.out.println("Car started. Tachometer: " + car.tachometer);

        // Intentar encender el coche cuando ya está encendido
        car.start();
        System.out.println("Tried to start again. Tachometer: " + car.tachometer);

        // Apagar el coche
        car.stop();
        System.out.println("Car stopped. Tachometer: " + car.tachometer);

        // Encender el coche de nuevo
        car.start();
        System.out.println("Car started again. Tachometer: " + car.tachometer);

        // Acelerar el coche
        for (int i = 0; i < 10; i++) {
            car.accelerate();
        }
        System.out.println("Accelerated. Speed: " + car.speedometer);

        // Intentar superar la velocidad máxima
        for (int i = 0; i < 20; i++) {
            car.accelerate();
        }
        System.out.println("Tried to exceed max speed. Speed: " + car.speedometer);

        // Frenar
        for (int i = 0; i < 6; i++) {
            car.brake();
        }
        System.out.println("Braked. Speed: " + car.speedometer);

        // Intentar frenar hasta un valor negativo
        for (int i = 0; i < 20; i++) {
            car.brake();
        }
        System.out.println("Tried to brake to negative. Speed: " + car.speedometer);

        // Girar el volante 20 grados
        car.turnAngleOfWheels(20);
        System.out.println("Turned wheels. Angle: " + car.wheelsAngle);

        // Intentar girar el volante más de 45 grados
        car.turnAngleOfWheels(50);
        System.out.println("Tried to turn wheels over 45 degrees. Angle: " + car.wheelsAngle);

        // Intentar apagar el coche mientras está en movimiento
        car.accelerate();
        car.stop();
        System.out.println("Tried to stop while moving. Tachometer: " + car.tachometer);

        // Frenar hasta detenerse
        while (car.speedometer > 0) {
            car.brake();
        }
        System.out.println("Stopped. Speed: " + car.speedometer);

        // Poner marcha atrás
        car.setReverse(true);
        System.out.println("Set to reverse. Gear: " + car.gear);

        // Intentar poner marcha atrás mientras el coche está en movimiento
        car.accelerate();
        car.setReverse(true);
        System.out.println("Tried to set reverse while moving. Gear: " + car.gear);

        // Apagar el coche
        car.stop();
        System.out.println("Car stopped. Tachometer: " + car.tachometer);
    }
}