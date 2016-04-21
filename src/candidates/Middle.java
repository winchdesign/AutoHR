package candidates;

/**
 * Created by winch on 19.04.16.
 */
public class Middle extends Senior {

    public Middle(String name, int experience) {
        super(name, experience);
    }
    @Override
    public String getCandType(){
        String candType = "Middle";
        return candType;
    }
}
