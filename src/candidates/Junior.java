package candidates;

/**
 * Created by winch on 19.04.16.
 */
public class Junior extends Candidate {
    public Junior(String name, int experience) {
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
