package objectCollab;
public class Subject {
  private String history;
  private String computer;
  private String science;

    public Subject(String history, String computer, String science) {
        this.history = history;
        this.computer = computer;
        this.science = science;
        
    }

    public Subject() {
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getScience() {
        return science;
    }

    public void setScience(String science) {
        this.science = science;
    }

    public String getComputer() {
        return computer;
    }

    public void setComputer(String computer) {
        this.computer = computer;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "history='" + history + '\'' +
                ", science='" + science + '\'' +
                ", computer='" + computer + '\'' +
                '}';
    }
}

