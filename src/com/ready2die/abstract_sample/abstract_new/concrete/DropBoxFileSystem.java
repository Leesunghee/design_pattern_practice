package com.ready2die.abstract_sample.abstract_new;

import java.io.File;
import java.util.List;

public class DropBoxFileSystem implements CloudFileSystem {

//    private DropBoxClient dbClient = new DropBoxClient(...);

    @Override
    public List<CloudFile> getFiles() {
        //List<DbFile> dbFiles = dbClient.getFiles();
        //List<CloudFile> results = new ArrayList<>(dbFiles.size());
        //for (DbFile file : dbFiles) {
//        DropBoxClouldFile cf = new DropBoxCloudFile(file, dbClient);
//        results.add(cf);/
        //}
//        return results;
        return null;
    }

    @Override
    public List<CloudFile> search(String query) {
        return null;
    }

    @Override
    public CloudFile getFile(String field) {
        return null;
    }

    @Override
    public void addFile(String name, File file) {

    }
}
