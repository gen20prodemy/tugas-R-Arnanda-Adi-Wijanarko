package implemen;

import base.CrudMap;
import pojo.DataSiswa;

import java.util.HashMap;
import java.util.Map;

public class CrudMapImpl implements CrudMap {
    private Map<Integer, DataSiswa> dataMap;

    public CrudMapImpl() {
        this.dataMap = new HashMap<>();
    }

    @Override
    public void tambahElement(DataSiswa s) throws Exception {
        if (dataMap.containsKey(s.getId())) {
            throw new Exception("Data dengan ID tersebut sudah ada.");
        }
        dataMap.put(s.getId(), s);
    }

    @Override
    public void deleteElement(int id) {
        if (dataMap.containsKey(id)) {
            dataMap.remove(id);
            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Data tidak ada.");
        }
    }

    @Override
    public void tampilkanElement() {
        System.out.println("Data Map:");
        for (DataSiswa s : dataMap.values()) {
            System.out.println("ID: " + s.getId() + ", Nama: " + s.getNama() + ", Nilai: " + s.getNilai());
        }
    }

    @Override
    public void updateElement(DataSiswa s) {
        if (dataMap.containsKey(s.getId())) {
            dataMap.put(s.getId(), s);
            System.out.println("Data berhasil diupdate.");
        } else {
            System.out.println("Data tidak ada.");
        }
    }
}

