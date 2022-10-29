import java.util.*;

public class HarekCity {
    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[]{age1, age2, age3, age4};
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public String firstAndLastTogether(String[] names) {
        return names[0] + " AND " + names[9] + " TOGETHER";
    }

    public void changeElectResult(String[] results) {
        String[] results2 = new String[2];
        results2 = Arrays.copyOf(results, results.length);
        for (int i = 0; i < results.length; i++) {
            if (i == 0 || i == results.length - 1)
                results[i] = results2[results.length - 1 - i];
            else
                continue;
        }

    }

    public String[] changeElectResultAgain(String[] results) {
        String[] changedResults = new String[3];
        System.arraycopy(results, 2, changedResults, 0, 3);
        return changedResults;
    }

    public char[][] createKeyboard(){
        char [][] createKeyBoard = {{'1','2','3'}, {'4','5','6'}, {'7','8','9'}, {'*','0','#'}};
        return createKeyBoard;
    }

    public void printKeyboard(){
        char [][] createKeyBoardNext = createKeyboard();
        System.out.println(Arrays.toString(createKeyBoardNext[0]));
        System.out.println(Arrays.toString(createKeyBoardNext[1]));
        System.out.println(Arrays.toString(createKeyBoardNext[2]));
        System.out.println(Arrays.toString(createKeyBoardNext[3]));

    }

    public String[] makeCopy(String[] names){
        System.out.println("Copied!");
        return  Arrays.copyOf(names, names.length);
    }
    public static void main(String[] args) {
        String[] source = new String[] {"Hero", "Mihu"};
        String[] copy = new HarekCity().makeCopy(source);

        source[0] = "CHANGED!"; //Мы меняем исходный массив, но на копии это не отображается

        System.out.println(Arrays.toString(copy));
    }
}