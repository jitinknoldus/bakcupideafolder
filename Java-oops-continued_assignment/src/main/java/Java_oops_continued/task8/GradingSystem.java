package Java_oops_continued.task8;


class Student
{
    private char grades;
    public void setGrades(char grades)
    {
        this.grades=grades;
    }
    public char getGrades()
    {

        return grades;
    }
}
public class GradingSystem
{
    public static void main(String agrs[])
    {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setGrades('A');
        student2.setGrades('B');
        System.out.println("The grade of the first student is: "+student1.getGrades());
        System.out.println("The grade of the second student is: "+student2.getGrades());
    }
}
