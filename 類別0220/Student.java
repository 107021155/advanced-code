public class Student {
    private String name ,id ,dept ,tutor;

    public Student(){
        System.out.println("aaaaaa");
    }
    public void setName(String newName){
        this.name = newName;
    }
    public String getName(){
        return this.name;
    }
    public void setId(String newId){
        this.id = newId;
    }
    public  String getId(){
        return  this.id;
    }
    public void setDept(String newDept){
        this.dept = newDept;
    }
    public String getDept(){
        return  this.dept;
    }
    public void setTutor(String newTutor){
        this.tutor = newTutor;
    }
    public String getTutor(){
        return  this.tutor;
    }
}
