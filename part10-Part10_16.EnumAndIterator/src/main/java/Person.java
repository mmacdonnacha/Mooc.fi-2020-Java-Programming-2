/**
 *
 * @author micheal
 */
public class Person {
    private String name;
    private Education education;
    
    public Person(String name, Education educationLevel){
        this.name = name;
        this.education = educationLevel;
    }
    
    
    public Education getEducation(){
        return this.education;
    }
    
    @Override
    public String toString(){
        return this.name + ", " + this.education;
    }
}
