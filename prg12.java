import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//pascal triangle


public class prg12 {

    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int numRows = sc.nextInt();
        prg12 program = new prg12();
        List<List<Integer>> generatedTriangle = program.generate(numRows);
        for (List<Integer> row : generatedTriangle) {
            System.out.println(row);
        }
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result =  new ArrayList<>();
        if(numRows == 0)
        {
            return result;
        }
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        for(int i = 1;i<numRows;i++)
        {
            List<Integer> prevRow = result.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            for (int j = 1; j < i; j++) {
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            currentRow.add(1);
            result.add(currentRow);

        }
        return result;
    }
}
