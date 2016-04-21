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

    public ArrayList candidates = new ArrayList();
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

            Senior seniorCand = new Senior(candName,candExp);

//            System.out.println(seniorCand.getExperience());
//            System.out.println(seniorCand.getName());
//            System.out.println(seniorCand.getCandType());

            candidates.add(seniorCand);
            senior.add(seniorCand);

        }

        //Middle selection criteria
        if (candExp>=2&candExp<5&candSkills.equals("HTML, JavaScript, SQL")){

            Middle middleCand = new Middle(candName,candExp);

//            System.out.println(middleCand.getName());
//            System.out.println(middleCand.getExperience());
//            System.out.println(middleCand.getCandType());

            candidates.add(middleCand);
            middle.add(middleCand);

        }

        //Junior selection criteria
        if (candSkills.equals("HTML, SQL")||candExp<2){

            Junior juniorCand = new Junior(candName,candExp);

//            System.out.println(juniorCand.getName());
//            System.out.println(juniorCand.getExperience());
//            System.out.println(juniorCand.getCandType());

            candidates.add(juniorCand);
            junior.add(juniorCand);

        }

        //Student selection criteria
        if (candSkills.equals("HTML")){

            Student studentCand = new Student(candName,candExp);

//            System.out.println(studentCand.getName());
//            System.out.println(studentCand.getExperience());
//            System.out.println(studentCand.getCandType());

            candidates.add(studentCand);
            student.add(studentCand);

        }
    }
}
