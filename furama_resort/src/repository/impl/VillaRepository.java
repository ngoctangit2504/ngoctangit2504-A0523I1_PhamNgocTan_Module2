package repository.impl;

import model.House;
import model.Room;
import model.Villa;
import repository.IFacilityRepository;
import util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class VillaRepository implements IFacilityRepository {

    private final String PATH_FACILITY = "D:\\CodeGym\\A0523I1_PhamNgocTan_Module2\\ngoctangit2504-A0523I1_PhamNgocTan_Module2\\furama_resort\\src\\data\\DataFacility.csv";
    @Override
    public void addVilla(Villa villa) {
        List<String> stringList = new ArrayList<>();
        stringList.add(villa.getInfoToCSV());
        ReadAndWriteFile.writeToCSV(PATH_FACILITY,stringList,true);
    }

    @Override
    public void addHouse(House house) {

    }

    @Override
    public void addRoom(Room room) {

    }
}
