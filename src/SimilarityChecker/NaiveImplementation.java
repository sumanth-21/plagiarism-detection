/*

 *
 * Purpose:
 *      - Project | Plagiarism Detection
 *
 * About:
 *      - This is a naive implementation of string comparison.
 *
 * Input      - A source string and a plagiarized string
 * Output     - Starting points of common elements in the string
 *
 * Extra Info - This algorithm is not used in the main program; however, it may be of use for future developments on this project
 */
package SimilarityChecker;

import java.util.ArrayList;

public class NaiveImplementation {
    public ArrayList<Integer> naiveComparison(String source, String pattern) {
        ArrayList  startPoints = new ArrayList();
        int iterate = source.length() - pattern.length() + 1;
        int patLen = pattern.length();

        for (int index = 0; index < iterate; index++) {
            boolean valid = true;
            for (int count = index, patTrack = 0; count < index + patLen; count++, patTrack++) {
                if (source.charAt(count) != pattern.charAt(patTrack)) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                startPoints.add(index);
            }
        }

        return startPoints;
    }
}
