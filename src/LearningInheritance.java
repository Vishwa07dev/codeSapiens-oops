public class LearningInheritance {
    /**
     * Inheritance
     *
     * Relationships : Parent - Child relationship
     *
     * Dog  is A Animal  - True
     */
    static class Animal {

        public void eat(){

            System.out.println("Animal is Eating");
        }
    }

    static class Dog extends Animal {   // used to represent parent child relationship

    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // eat method is coming from the parent class Animal
    }
















    /**
     * Composition
     *
     *   Person  has A Car -> true
     */

    static class Person {
        private Car car ;  // This is an example of composition

        public Car getCar() {
            return car;
        }

        public void setCar(Car car) {
            this.car = car;
        }
    }

    static class Car {

        private String model;
        private String color;
        private String makeYear ;

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getMakeYear() {
            return makeYear;
        }

        public void setMakeYear(String makeYear) {
            this.makeYear = makeYear;
        }
    }
}
