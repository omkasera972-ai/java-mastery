package _03_OOP_Advance;

/*
 OBJECT BEHAVIOUR (BASIC)

 Object = properties (data) + behaviour (methods)

 Example:
 Car has:
  - properties → name, speed
  - behaviour → start(), accelerate()
*/

public class _04_ObjectBehaviour {

    // CLASS
    static class Car {

        // PROPERTIES
        String name;
        int speed;

        // METHOD (Behaviour)
        void start() {
            System.out.println(name + " started");
        }

        void accelerate() {
            speed += 10;
            System.out.println(name + " speed: " + speed);
        }
    }

    public static void main(String[] args) {

        // OBJECT CREATION
        Car c1 = new Car();

        c1.name = "BMW";
        c1.speed = 0;

        // BEHAVIOUR CALL
        c1.start();
        c1.accelerate();
        c1.accelerate();
    }
}