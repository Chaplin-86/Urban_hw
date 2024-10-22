public class Car {
    String carBrand;
    double speed;
    double weight;

    private class Engine{
        Engine(double carSpeed){
            speed = carSpeed;
        }
        public void running (double carSpeed) {
            if(carSpeed == 0.0){
                System.out.println("Машина едет со скоростью " + carSpeed);
            } else {
                System.out.println("Машина стоит");
            }
        }
    }

    private class CarInterior {
        class SteeringWheel {
            public void turnRight (){
                System.out.println("Машина поворачивает направо");
            }

            public void turnLeft() {
                System.out.println("Машина поворачивает налево");
            }

        }

        class Breaks {
            public void stop() {
                System.out.println("Машина остановилась");
            }
        }

    }
}
