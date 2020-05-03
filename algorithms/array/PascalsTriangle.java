package algorithms.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. Pascal's Triangle
 * Given numRows, generate the first numRows of Pascal's triangle.
 For example, given numRows = 5,
 Return
 [
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
 ]
 */

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if (numRows < 1) return result;
        
        List<Integer> row = new ArrayList<Integer>();
        row.add(1);
        result.add(row);
        for (int i = 1; i < numRows; ++i) {
            List<Integer> temp = new ArrayList<Integer>();
            temp.add(1);
            for (int k = 1; k < i; ++k) {
                temp.add(result.get(i-1).get(k-1) + result.get(i-1).get(k));
            }
            temp.add(1);
            result.add(temp);
        }
        return result;
    }
}