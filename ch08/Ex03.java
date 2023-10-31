class Cddd {
    String name;
    double height, weight;
}

public class Ex03 {
    public static void main(String[] args) {
        Cddd student;
        student = new Cddd();

        student.name = "Sandy";
        student.height = 165.5;
        student.weight = 58.2;

        double heightInMeters = student.height / 100.0;
        double bmi = student.weight / (heightInMeters * heightInMeters);

        System.out.println("學生姓名: " + student.name);
        System.out.println("身高: " + student.height + " cm");
        System.out.println("體重: " + student.weight + " kg");
        System.out.println("BMI值: " + bmi);
    }
}
