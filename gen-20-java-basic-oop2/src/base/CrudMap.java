package base;

import pojo.DataSiswa;

public interface CrudMap {
    void tambahElement(DataSiswa s) throws Exception;

    void deleteElement(int id);

    void tampilkanElement();

    void updateElement(DataSiswa s);
}
