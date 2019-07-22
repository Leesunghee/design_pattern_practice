package com.ready2die.singleton.another_practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LogWriter {

    private static LogWriter singleton = new LogWriter();
    private static BufferedWriter bw;

    private LogWriter() {
        try {
            bw = new BufferedWriter(new FileWriter(("log.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static LogWriter getInstance() {
        return singleton;
    }

    public synchronized void log(String str) {
        try {
            // 현재 날짜와 시각 추가
            // bw.write(LocalDateTime.now() + ":" + str + "\n");
            bw.write(str + "\n");
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            super.finalize();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
