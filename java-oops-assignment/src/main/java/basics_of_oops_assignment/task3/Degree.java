package basics_of_oops_assignment.task3;

public class Degree {
    public void getDegree() {
        System.out.println("I got a degree");
    }
}

class Undergraduate extends Degree {
    public void getDegree() {
        System.out.println("I am an Undergraduate");
    }
}

class Postgraduate extends Degree {
    public void getDegree() {
        System.out.println("I am a Postgraduate");
    }
}

class PrintDegree {
    public static void main(String[] args) {

        Degree degree = new Degree();
        degree.getDegree();

        Undergraduate undergrad = new Undergraduate();
        undergrad.getDegree();

        Postgraduate postgrad = new Postgraduate();
        postgrad.getDegree();
    }
}