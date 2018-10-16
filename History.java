import java.util.ArrayList;
/**
 * The class History creates a list of guess the player entered
 */
public class History {
    private String history = "";
    private ArrayList<String> historyList = new ArrayList<>();

    public void setHistory(String h) {
	history = h;
    }

    public String getHistory() {
	return history;
    }

    /** Add guess to list */
    public ArrayList<String> History() {
	historyList.add(getHistory());
	return historyList;
    }
}
