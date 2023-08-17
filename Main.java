public class Main{
    public static void main(String[] arg){
        System.out.println("Hello To JavaUni");
        Course c=new Course();
        c.name="Math";

        Teacher t=new Teacher();
        t.name="ghesmat";
        t.takeCoures(c);

        Student s=new Student();
        s.name="heshmat";
        s.takeCoures(c);

    }
}