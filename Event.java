public class Event {
    private String nameEvent;
    private String size;
    private String start;
    private String end;

    public Event(String name) {
        this.nameEvent = name;

    }
    public String nameEvent() {
        return nameEvent;
    }
    public void setNameEvent(String newNameEvent) {
        this.nameEvent = newNameEvent;
    }
    public String size() {
        return size;
    }
    public void setSize(String newSize) {
        this.size = newSize;
    }
    public String start() {
        return start;
    }
    public void setStart(String newStart) {
        this.start = newStart;
    }
    public String end() {
        return end;
    }
    public void setEnd( String newEnd) {
        this.end = newEnd;
    }
}
