public class LearningPolymorphism {

    /**
     * Static polymorphism / compile time
     */

    public int add(int a, int b){
        System.out.println("Calling the sum with 2 arguments");
        return a+b;
    }

    public int add(int a, int b, int c){
        System.out.println("Calling the sum with 3 arguments");
        return a+b+c;
    }






















    /**
     * Dynamic polymorphism / Runtime polymorphism
     */

    static class Animal {
        public void eat(){
            System.out.println("Animal is eating");
        }
    }

    static class Dog extends  Animal {
        /**
         * Method overriding
         */
        public void eat(){
            System.out.println("Dog is eating");
        }
    }

    static class Cat extends Animal {
        /**
         * Method overriding
         */
        public void eat(){
            System.out.println("Cat is eating");
        }
    }

    public static void main(String[] args) {
         Animal a1 = new Animal();
         Animal a2 = new Dog();
         Animal a3 = new Cat();

         a1.eat(); //Animal is eating
         a2.eat(); //Dog is eating
         a3.eat(); //Cat is eating

    }
}
