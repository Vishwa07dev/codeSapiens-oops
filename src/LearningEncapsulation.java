public class LearningEncapsulation {

    /**
     * Encapsulations :
     * 1. Make all the fields private
     * 2. Make public methods to allow the access of these private fields
     */

    class Person {

        private String name ;
        private Car car ;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Car getCar() {
            return car;
        }

        public void setCar(Car car) {
            this.car = car;
        }
    }


    /**
     * Encapsulation is being followed in the below class
     */
    class Car {

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
