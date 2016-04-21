package candidates;

/**
 * Created by winch on 19.04.16.
 */
public class Student extends Candidate {
    public Student(String name, int experience) {
        super(name, experience);
    }

    @Override
    public String getSkills() {
        String skills = "HTML, SQL";
        return skills;
    }
    @Override
    public String getCandType(){
        String candType = "Junior";
        return candType;
    }
}
