package candidates;

/**
 * Created by winch on 15.04.16.
 */
public class Senior extends Candidate {


    public Senior(String name, int experience) {
        super(name,experience);
    }

    @Override
    public String getSkills() {
        String skills = "HTML, JavaScript, SQL";
        return skills;
    }
    @Override
    public String getCandType(){
        String candType = "Senior";
        return candType;
    }
}
