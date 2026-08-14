import java.util.ArrayList;
import java.util.List;

public class cellList {
  public static void main(String[] args) {
    int x = 9;
    int y = 9;
    int k = 0;
    List<List<Integer>> cells = new ArrayList<>();
    for (int i = 0; i < x; i++) {
      List<Integer> row = new ArrayList<Integer>();
        for (int j = 0; j < y; j++) {
            row.add(k);
            k++;
        }
        cells.add(row);
    }
    System.out.println(cells);
  }
}