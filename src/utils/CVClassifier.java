package utils;

import candidates.Junior;
import candidates.Middle;
import candidates.Senior;
import candidates.Student;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by winch on 19.04.16.
 */
public class CVClassifier {

    public ArrayList senior = new ArrayList();
    public ArrayList middle = new ArrayList<>();
    public ArrayList junior = new ArrayList<>();
    public ArrayList student = new ArrayList<>();

    public CVClassifier() throws IOException {
        for (int i = 1; i<=10; i++) {

            String cv = i+".txt";
            candidateCreate(cv);
        }

//        System.out.println("Candidates: "+candidates.size());
//        System.out.println("Senior: "+senior.size());
//        System.out.println("Middle: "+middle.size());
//        System.out.println("Junior: "+junior.size());
//        System.out.println("Students: "+student.size());

//        Senior senCand = (Senior) senior.get(1);
//        System.out.println(senCand.getName());
//        System.out.println(candidates.get(0).getClass().toString());

    }

    public void candidateCreate(String CV) throws IOException {

        CVParser cvParser = new CVParser (CV);
        String candName = cvParser.cvName();
        int candExp = cvParser.cvExperience();
        String candSkills = cvParser.cvSkills();


        //Senior selection criteria
        if (candExp>=5&candSkills.equals("HTML, JavaScript, SQL")){
            createSenior(candName,candExp);
//            System.out.println(candEducation);

        }

        //Middle selection criteria
        if (candExp>=2&candExp<5&candSkills.equals("HTML, JavaScript, SQL")){
            createMiddle(candName,candExp);
        }

        //Junior selection criteria
        if (candSkills.equals("HTML, SQL")||candExp<2){
            createJunior(candName,candExp);
        }

        //Student selection criteria
        if (candSkills.equals("HTML")){
            createStudent(candName,candExp);
        }
    }
    public ArrayList createSenior(String candName, int candExp){
        Senior seniorCand = new Senior(candName,candExp);
        senior.add(seniorCand);
        return senior;
    }
    public ArrayList createMiddle(String candName, int candExp){
        Middle middleCand = new Middle(candName,candExp);
        middle.add(middleCand);
        return middle;
    }
    public ArrayList createJunior(String candName, int candExp){
        Junior juniorCand = new Junior(candName,candExp);
        junior.add(juniorCand);
        return junior;
    }
    public ArrayList createStudent(String candName, int candExp){
        Student studentCand = new Student(candName,candExp);
        student.add(studentCand);
        return student;
    }
}
