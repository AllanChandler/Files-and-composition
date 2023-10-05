import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(new Room(1, 2, 3));
        rooms.add(new Room(1, 2, 3));
        rooms.add(new Room(1, 2, 3));

        Building building = new Building(3, 5, true, rooms);

        int numberOfLamps = countLampsInBuilding(building);
        System.out.println("Sum of lamps: " + numberOfLamps);
        boolean b = isNormal(building);
        System.out.println("Outcome is: " + b);
    }

    public static int countLampsInBuilding(Building building) {
        int lamps = 0;
        for (Room room : building.getRooms()) {
            lamps += room.getNumberOfLamps();
        }
        return lamps;
    }

    public static boolean isNormal(Building building) {
        if (building.getNumberOfFloors() > building.getRooms().size()) {
            return true;
        }
        System.out.println("This is an odd building");
        return false;
    }
}




