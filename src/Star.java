import java.util.ArrayList;
import java.util.List;

public class Star {

    private String row;
    private List<String> rowsContainer;

    public Star() {
        this.rowsContainer = new ArrayList<>();
    }

    public void printStar() {

        for (String row : rowsContainer
                ) {
            System.out.println(row);
        }

    }

    public void addToStarContainer(String row) {
        rowsContainer.add(row);
    }

}
