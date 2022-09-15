package single_list;

public class Student {
    
    String name;
    int age;
    
    Student(){}

    public Student(String xName, int xAge) {
        this.name = xName;
        this.age = xAge;
    }
    
    public String toString(){
        return("(" + name + "," + age + ")");
    }
    
    
}
