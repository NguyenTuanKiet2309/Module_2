package case_study.repository;

import case_study.model.House;
import case_study.model.Room;

import java.util.List;
import java.util.Map;

public interface IRoomRepository {
    void addRoom(Room room);

    Map<Room, Integer> getRoomList();
}
