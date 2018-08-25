package com.ready2die.abstract_sample.abstract_new;

import java.io.InputStream;
import java.io.OutputStream;

public class DropBoxCloudFile implements CloudFile {

//    private DropBoxClient dbClient;
//    private DbFile dbFile;

//    public DropBoxCloudFile(DbFile dbFile, DropBoxClient dbClient) {
//        this.dbFile = dbFiel;
//        this.dbClient = dbClient;
//    }



    @Override
    public String getId() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public long getLength() {
        return 0;
    }

    @Override
    public Boolean hasUrl() {
        return null;
    }

    @Override
    public String getUrl() {
        return null;
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }

    @Override
    public void write(OutputStream out) {

    }

    @Override
    public void delete() {

    }
}
