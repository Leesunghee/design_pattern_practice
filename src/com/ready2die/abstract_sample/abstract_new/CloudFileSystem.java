package com.ready2die.abstract_sample.abstract_new;

import java.io.File;
import java.util.List;

public interface CloudFileSystem {
    List<CloudFile> getFiles();

    List<CloudFile> search(String query);

    CloudFile getFile(String field);

    void addFile(String name, File file);

    //신규 추가
    void copyFrom(CloudFile file);
}
