import java.util.Objects;

public class Rooms {
    private String name;

    public Rooms() {
    name();

    }

    public enum RoomType {
        LECTURE_HALL, COMPUTER_LAB, SEMINAR_HALL, MEETING_ROOM, AMPHITHEATER;
    }

    private RoomType type;

    public Rooms(String name, RoomType type) {
        this.name = name;
        this.type = type;
    }

    public String name() {
        return name;
    }

    public void setName(String newName) {
        this.name =newName;
    }
    public RoomType type() {
        return type;
    }

    public void setRoomType(RoomType newType) {
        this.type = newType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rooms rooms = (Rooms) o;
        return name.equals(rooms.name) && type == rooms.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }

    public static void main(String[] args) {
    Rooms LECTURE_HALL = new Rooms();
    // Rooms computerLabs = new Rooms();
    //public static void main(String[] args) {

        new Rooms("309", RoomType.LECTURE_HALL);
        System.out.println(Rooms.name , Rooms.type);
    }

    @Override
    public String toString() {
        return "Rooms{" + "type=" + type + '}';
    }
}
