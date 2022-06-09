
public class LearningAbstraction {
    /**
     * Abstraction is hiding implementation details
     *
     * We achieve abstraction by 2 ways in Java
     * 1. Using Abstract Class
     * 2. Using interfaces
     */

    /**
     * Using Abstract classes
     * <p>
     * Let's say we need to learn driving a CAR. And in case if we learn
     * driving one car, we will be able to drive any car.
     * <p>
     * As a end user , we should be only aware of steering, break , clutch and accelerator
     * <p>
     * I don't need to know, how they are internally implemented.
     * <p>
     * But different cars will have they own specialized implementation of the same
     */

    abstract class Car {
        abstract void applyBreak();

        abstract void appAcceleration();

        abstract void applyClutch();

        abstract void moveSteering();
    }

    class HyundaiCar extends Car {

        @Override
        void applyBreak() {
            System.out.println("Implementing break in Hyundai car");
        }

        @Override
        void appAcceleration() {
            System.out.println("Implementing acceleration in Hyundai car");
        }

        @Override
        void applyClutch() {
            System.out.println("Implementing clutch in Hyundai car");
        }

        @Override
        void moveSteering() {
            System.out.println("Implementing steering in Hyundai car");
        }
    }

    class BMW extends Car {

        @Override
        void applyBreak() {
            System.out.println("Implementing break in BMW car");
        }

        @Override
        void appAcceleration() {
            System.out.println("Implementing acceleration in BMW car");
        }

        @Override
        void applyClutch() {
            System.out.println("Implementing clutch in BMW car");
        }

        @Override
        void moveSteering() {
            System.out.println("Implementing steering in BMW car");
        }
    }


    /**
     * Abstraction using interface
     */

    interface Vehicle {
        abstract void applyBreak();

        abstract void appAcceleration();

        abstract void applyClutch();

        abstract void moveSteering();
    }


    class Toyota implements Vehicle {

        @Override
        public void applyBreak() {
            System.out.println("Implementing break in Toyota car");
        }

        @Override
        public void appAcceleration() {
            System.out.println("Implementing acceleration in Toyota car");
        }

        @Override
        public void applyClutch() {
            System.out.println("Implementing clutch in Toyota car");
        }

        @Override
        public void moveSteering() {
            System.out.println("Implementing steering in Toyota car");
        }
    }

    class Audi implements Vehicle {

        @Override
        public void applyBreak() {
            System.out.println("Implementing break in Audi car");
        }

        @Override
        public void appAcceleration() {
            System.out.println("Implementing acceleration in Audi car");
        }

        @Override
        public void applyClutch() {
            System.out.println("Implementing clutch in Audi car");
        }

        @Override
        public void moveSteering() {
            System.out.println("Implementing steering in Audi car");
        }
    }
}
