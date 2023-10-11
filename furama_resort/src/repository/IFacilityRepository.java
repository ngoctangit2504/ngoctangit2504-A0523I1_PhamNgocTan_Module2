package repository;

import model.House;
import model.Room;
import model.Villa;

public interface IFacilityRepository {
    void addVilla(Villa villa);
    void addHouse(House house);
    void addRoom(Room room);
}
