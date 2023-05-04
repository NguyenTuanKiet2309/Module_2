package case_study.repository;

import case_study.model.Room;
import case_study.utils.ReadAndWrileToFileRoom;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RoomRepository implements IRoomRepository {
    private Map<Room,Integer> roomList = new LinkedHashMap<>();
    static final String ROOM_PATH = "src/case_study/data/room.csv";

    @Override
    public void addRoom(Room room) {
        roomList = ReadAndWrileToFileRoom.readFile(ROOM_PATH);
        roomList.put(room,0);
        ReadAndWrileToFileRoom.writeFile(roomList, ROOM_PATH);
    }

    @Override
    public Map<Room,Integer> getRoomList() {
        roomList = ReadAndWrileToFileRoom.readFile(ROOM_PATH);
        return roomList;
    }
}
