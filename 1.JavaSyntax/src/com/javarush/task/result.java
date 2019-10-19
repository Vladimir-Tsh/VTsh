import java.io.*;
import java.util.ArrayList;

public class result {
    /*Функция поиска самой длинной непрерывной строго возрастающей подпоследовательности*/
    public static ArrayList<Integer> findSubLis(ArrayList<Integer> list){

        int firstIndexTMP = 0;
        int firstIndex = 0;
        int lengthTMP = 1;
        int maxLength = 1;

        for (int i = 1; i < list.size(); i++){
            if (list.get(i - 1) < list.get(i)){
                lengthTMP++;
                if (maxLength <= lengthTMP) {
                    maxLength = lengthTMP;
                    firstIndex = firstIndexTMP;
                }
            } else {
                firstIndexTMP = i;
                lengthTMP = 1;
            }
        }

        ArrayList<Integer> subList = new ArrayList<Integer>();
        for (int i = firstIndex; i < firstIndex + maxLength; i++)
            subList.add(list.get(i));

        return subList;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        /*Размер и элементы исходной последовательности считываются с клавиатуры.
		Вводить нужно целое положительное для размера, целые для элементов*/
        int N = Integer.parseInt(reader.readLine());

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < N; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }

        ArrayList<Integer> subList = new ArrayList<Integer>();
        subList = findSubLis(list);

        /*Вывод на экран найденной последовательности*/
        for (int i : subList)
            System.out.println(i);
    }
}
