

public class Student implements Comparable<Student>{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    @Override
    public int compareTo(Student x){
        return this.name.compareTo(x.getName());
        
//        if(this.name == x.getName()){
//            return 0;
//        }else if(this.name > x.getName()){
//            return 1;
//        }else{
//            return -1;
//        }
    }

}
