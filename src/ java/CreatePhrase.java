public class CreatePhrase {

    private String[] listOne;
    private String[] listTwo;
    private String[] listThree;


    public CreatePhrase(String[] listOne, String[] listTwo, String[] listThree) {
        this.listOne = listOne;
        this.listTwo = listTwo;
        this.listThree = listThree;
    }

    public void generatePhrase () {
        int lengthOne = listOne.length;
        int lengthTwo = listTwo.length;
        int lengthThree = listThree.length;

        int randNumOne = (int) (Math.random() * lengthOne);
        int randNumTwo = (int) (Math.random() * lengthTwo);
        int randNumThree = (int) (Math.random() * lengthThree);

        System.out.print(listOne[randNumOne] + " " + listTwo[randNumTwo] + " " + listThree[randNumThree]);
    }
}
