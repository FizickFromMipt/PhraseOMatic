import java.io.Serial;
import java.io.Serializable;
import java.util.Arrays;

public class SaveWords implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String[] wordListOne;
    private String[] wordListTwo;
    private String[] wordListThree;

    public SaveWords(String[] wordListOne, String[] wordListTwo, String[] wordListThree) {
        this.wordListOne = wordListOne;
        this.wordListTwo = wordListTwo;
        this.wordListThree = wordListThree;
    }

    public String[] getWordListOne() {
        return wordListOne;
    }

    public void setWordListOne(String[] wordListOne) {
        this.wordListOne = wordListOne;
    }

    public String[] getWordListTwo() {
        return wordListTwo;
    }

    public void setWordListTwo(String[] wordListTwo) {
        this.wordListTwo = wordListTwo;
    }

    public String[] getWordListThree() {
        return wordListThree;
    }

    public void setWordListThree(String[] wordListThree) {
        this.wordListThree = wordListThree;
    }

    @Override
    public String toString() {
        return "SaveWords{" +
                "wordListOne=" + Arrays.toString(wordListOne) +
                ", wordListTwo=" + Arrays.toString(wordListTwo) +
                ", wordListThree=" + Arrays.toString(wordListThree) +
                '}';
    }
}
