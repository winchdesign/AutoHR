package candidates;

/**
 * Created by winch on 01.04.16.
 */
abstract class Candidate  {
    private String name;
    private int experience;
    private String skills;
    private String candType;

    public Candidate (String name, int experience){
        this.name = name;
        this.experience = experience;
    }

    public int getExperience (){
        return  experience;
    }

    public String getSkills(){
        return skills;
    }

    public String getName(){return name;}

    public String getCandType(){return candType;}

    public String succesfulHire (){return "Candidate "+name+" is hired successfully";}
    public String unsuccesfulHire (){return "Unfortunetely candidate doesn't correspond to requirements ";}

}
