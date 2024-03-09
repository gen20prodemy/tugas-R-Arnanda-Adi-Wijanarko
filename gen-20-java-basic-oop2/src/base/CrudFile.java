package base;

import pojo.DataSiswa;

import java.io.IOException;

public abstract class CrudFile {
    public abstract void tambahRow(DataSiswa s) throws IOException;

    public abstract void deleteRow(int id) throws IOException;

    public abstract void tampilkanIsiRow() throws IOException;

    public abstract void updateRow(DataSiswa s) throws IOException;
}

