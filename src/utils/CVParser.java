package utils;

import java.io.*;

/**
 * Created by winch on 18.04.16.
 */
public class CVParser {
    public int lineCount = 0;
    public int arrLine = 0;
    public String line = null;
    public String[][] cvFields;

    public CVParser(String fileLocation) throws IOException {

        /** Classloader for reading file from resources*/

        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        File file = new File(classloader.getResource(fileLocation).getFile());
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));

        String[] cvLine;
        cvFields = new String[3][2];
        while ((line = br.readLine()) != null) {
            cvLine = line.split(": ");
            cvFields[lineCount][0] = cvLine[0];
            cvFields[lineCount][1] = cvLine[1];
            lineCount = lineCount + 1;
        }
    }

    public String cvName() {
        String name = null;
        for (arrLine = 0; arrLine < lineCount; arrLine++) {
            line = cvFields[arrLine][0];

            if (line.equals("name")) {
                name = cvFields[arrLine][1];
            }
        }
        return name;
    }

    public int cvExperience(){
        int experience=0;
        for (arrLine = 0; arrLine < lineCount; arrLine++) {
            line = cvFields[arrLine][0];

            if (line.equals("experience")) {
                String exp = cvFields[arrLine][1];
                experience = Integer.parseInt(exp.substring(0, exp.indexOf(" ")));

            }
        }
        return experience;
    }

    public String cvSkills(){
        String skills = null;
        for (arrLine = 0; arrLine < lineCount; arrLine++) {
            line = cvFields[arrLine][0];

            if (line.equals("skills")) {
                skills = cvFields[arrLine][1];
            }
        }
        return skills;
    }

}


