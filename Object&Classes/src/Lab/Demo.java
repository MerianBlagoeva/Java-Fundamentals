package Lab;


public class Demo {

    static class Student {
        String name;
        int id;
        int age;

        public Student(String name, int id, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        String getInfo() {
            return "ID: " + id + ", " + "age: " + age + ", " + "name: " + name;
        }
        void increaseAge() {
            this.age++;
        }
    }
    static class Circle {
        double radius;
        double area;

        Circle(double radius) {
            this.radius = radius;
            this.area = Math.PI * radius * radius;
        }
        void setRadius(double radius) {
            this.radius = radius;
            this.area = Math.PI * radius * radius;
        }
        String getInfo() {
            return "Circle (R=" + this.radius + ", A=" + this.area + ")";
        }
    }

    public static void main(String[] args) {
        Circle a = new Circle(5);
        System.out.println(a.getInfo());
        a.setRadius(10);
        System.out.println(a.getInfo());
    }
}
