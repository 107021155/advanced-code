public class Main {

    public static void main(String[] args) {
	Student stud1 = new Student();
        System.out.println(stud1.getName());
        stud1.setName("Java");
        System.out.println(stud1.getName());

        System.out.println(stud1.getId());
        stud1.setId("107021155");
        System.out.println(stud1.getId());

        System.out.println(stud1.getDept());
        stud1.setDept("iiiiii");
        System.out.println(stud1.getDept());

        System.out.println(stud1.getTutor());
        stud1.setTutor("chou");
        System.out.println(stud1.getTutor());
    }
}
