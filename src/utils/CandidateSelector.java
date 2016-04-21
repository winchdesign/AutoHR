package utils;

import candidates.Middle;
import candidates.Senior;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by winch on 20.04.16.
 */
public class CandidateSelector {

    public CandidateSelector() {
    }

    public void selectCandidate() throws IOException {
        CVClassifier cvClassifier = new CVClassifier();

        ArrayList middle = cvClassifier.middle;
        ArrayList senior = cvClassifier.senior;
        ArrayList junior = cvClassifier.junior;
        ArrayList students = cvClassifier.student;
        int candCounter = 0;




        if (middle.size() >= 3) {
            System.out.println("Hired candidates are:");
            for (int i = 0; i < 3; i++) {
                candCounter++;
                System.out.println("Candidate #" + (candCounter));
                Middle middleCand = (Middle) middle.get(i);
                System.out.println(middleCand.getName());
                System.out.println(middleCand.succesfulHire());
            }



//        for (int i = 0; i<middle.size(); i++){
//            Middle middleCand = (Middle) middle.get(i);
//            System.out.println(middleCand.getName());
//            if (i==2) {
//                System.out.println("We have 3 middle candidates.");
//                break;
//            }
//            else
//            }
//        }

        }
        else{
            for (int i = 0; i<middle.size();i++){
                candCounter++;
                System.out.println("Candidate #" + (candCounter));
                Middle middleCand = (Middle) middle.get(i);
                System.out.println(middleCand.getName());
                System.out.println(middleCand.succesfulHire());
            }
            for (int i = 0; i<3-middle.size();i++){
                candCounter++;
                System.out.println("Candidate #" + (candCounter));
                Senior seniorCand = (Senior) senior.get(i);
                System.out.println(seniorCand.getName());
                System.out.println(seniorCand.succesfulHire());
            }
        }
    }
}


