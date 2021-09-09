import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args ){
        SkolniTrida skolniTrida =new SkolniTrida("4.C",4,3," Novak, Jan ");

        Student student1 = new Student("Petr Svoboda",2011,1,"ID001");
        Student student2 = new Student("Milan Riha",2010,2,"ID123");
        Student student3 = new Student("Jindrich Novy",2012,3,"ID345");
        System.out.println("####################################");
        System.out.println(skolniTrida.vypis());
        List<Student> studenti = new ArrayList();
        studenti.add(student1);
        studenti.add(student2);
        studenti.add(student3);
        System.out.println("Pocet studentu: " + studenti.size());
        System.out.println("####################################");
        System.out.println(student1.studentskyVypis());
        System.out.println(student2.studentskyVypis());
        System.out.println(student3.studentskyVypis());
        System.out.println(skolniTrida.jmenoTridy + skolniTrida.jmenoUcitele + System.lineSeparator()+
                student1.iD + "," + student1.jmenoZaka + System.lineSeparator() +
                student2.iD + "," + student2.jmenoZaka + System.lineSeparator() +
                student3.iD + "," + student3.jmenoZaka);
    }

}
