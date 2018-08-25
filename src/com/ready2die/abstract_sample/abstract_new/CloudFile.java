package com.ready2die.abstract_sample.abstract_new;

import java.io.InputStream;
import java.io.OutputStream;

public interface CloudFile {
    String getId();

    String getName();

    long getLength();

    Boolean hasUrl();

    String getUrl();

    InputStream getInputStream();

    void write(OutputStream out);

    void delete();

}
