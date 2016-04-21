import utils.CVClassifier;
import utils.CandidateSelector;

import java.io.IOException;

/**
 * Created by winch on 15.04.16.
 */
public class AutoHR {
    public static void main(String[] args) throws IOException {



        CVClassifier cvClassifier = new CVClassifier();
        CandidateSelector candidateSelector = new CandidateSelector();
        candidateSelector.selectCandidate();

    }
}
