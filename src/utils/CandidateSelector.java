package utils;

import candidates.Junior;
import candidates.Middle;
import candidates.Senior;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by winch on 20.04.16.
 */
public class CandidateSelector {
    public CVClassifier cvClassifier = new CVClassifier();
    ArrayList middle = cvClassifier.middle;
    ArrayList senior = cvClassifier.senior;
    ArrayList junior = cvClassifier.junior;
    ArrayList students = cvClassifier.student;

    public CandidateSelector() throws IOException {
    }


    public void selectCandidate() throws IOException {
        int candCounter = 0;
//        System.out.println(senior.size());
//        System.out.println(middle.size());
//        System.out.println(junior.size());
//        System.out.println(students.size());
        if (middle.size() >= 3) {
            System.out.println("Hired candidates are:");
            for (int i = 0; i < 3; i++) {
                candCounter++;
                hireMiddle(candCounter,i);

            }

        }
        else{
            if (middle.size()<3&senior.size()>=(3-middle.size())) {
                for (int i = 0; i < middle.size(); i++) {
                    candCounter++;
                    hireMiddle(candCounter,i);

                }
                for (int i = 0; i < 3 - middle.size(); i++) {
                    candCounter++;
                    hireSenior(candCounter,i);

                }
            }
            else {
                if (senior.size()<(3-candCounter)&junior.size()>=(3-senior.size())){
                    for (int i = 0; i < senior.size(); i++) {
                        candCounter++;
                        hireSenior(candCounter,i);

                    }
                    for (int i = 0; i < (3-candCounter) - middle.size(); i++) {
                        candCounter++;
                        hireJunior(candCounter,i);

                    }

                }

            }
        }
    }
    private void hireMiddle(int candCounter, int i){

        System.out.println("Candidate #" + (candCounter));
        Middle middleCand = (Middle) middle.get(i);
        System.out.println(middleCand.getName());
        System.out.println(middleCand.succesfulHire());
    }

    private void hireSenior(int candCounter, int i){

        System.out.println("Candidate #" + (candCounter));
        Senior seniorCand = (Senior) senior.get(i);
        System.out.println(seniorCand.getName());
        System.out.println(seniorCand.succesfulHire());
    }

    private void hireJunior(int candCounter, int i){

        System.out.println("Candidate #" + (candCounter));
        Junior juniorCand = (Junior) junior.get(i);
        System.out.println(juniorCand.getName());
        System.out.println(juniorCand.succesfulHire());
    }

}


