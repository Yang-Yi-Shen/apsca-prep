import java.util.ArrayList;

public class WordList {
    public static void main(String[] args) {
        WordList webster = new WordList();
        webster.myList.add("amongus");
        webster.myList.add("sussy");
        webster.myList.add("baka");

        // test numWordsOfLength
        System.out.println(webster.numWordsOfLength(5));

        // test removeWordsOfLength
        webster.removeWordsOfLength(5);
        System.out.println(webster.numWordsOfLength(5));

    }
        
    private ArrayList<String> myList = new ArrayList<String>();

    public int numWordsOfLength(int len) {
        int numWords = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).length() == len) {
                numWords++;
            }
        }
        return numWords;
    }

    public void removeWordsOfLength(int len) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).length() == len) {
                myList.remove(myList.get(i));
            }
        }
    }
}
