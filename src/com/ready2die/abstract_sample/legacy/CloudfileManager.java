package com.ready2die.abstract_sample.legacy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CloudfileManager {
    public List<FileInfo> getFileInfos(CloudId cloudId) {
        if (cloudId == CloudId.DROPBOX) {
//            DropboxClient dc = null;
            List<FileInfo> result = new ArrayList<>();

            //blah ~~
            FileInfo fileInfo = new FileInfo();
            fileInfo.setCloudId(CloudId.DROPBOX);
            //blah ~~

            result.add(fileInfo);

            return result;
        } else if (cloudId == CloudId.BOX) {
            //blah ~~

            return null;
        }

        //클라우드 추가 사항 발생
        //else if (cloudId.SCLOUD) {
        //  ...
        //}
        //else if (cloudId.NCLOUD) {
        //  ...
        //}
        //else if (cloudId.DCLOUD) {
        //  ...
        //}
        //download(), uplaod(), delete(), search()도 유사한 else-if 블록 추가

       return null;
    }

    public void download(FileInfo file, File localTarget) throws IOException {
        if (file.getCloudId() == CloudId.DROPBOX) {
//            DropboxClient dc = null;
            FileOutputStream out = new FileOutputStream(localTarget);
//            dc.copy(file.getFileId(), out);
            out.close();

        } else if (file.getCloudId() == CloudId.BOX) {
//            BoxService boxSvc = ...;
//            InputStream is = boxSvc.getInputStream(file.getId());
            FileOutputStream out = new FileOutputStream(localTarget);
//            CopyUtil.copy(is, out);
        }

    }

    public FileInfo upload(File file, CloudId cloudId) {
        if (cloudId == CloudId.DROPBOX) {
            ;
        } else if (cloudId == CloudId.BOX) {
            ;
        }
        return null;
    }

    public void delete(String fileId, CloudId cloudId) {
        if (cloudId == CloudId.DROPBOX) {
            ;
        } else if (cloudId == CloudId.BOX) {
            ;
        }
    }

    public List<FileInfo> search(String query, CloudId cloudId) {
        if (cloudId == CloudId.DROPBOX) {
            ;
        } else if (cloudId == CloudId.BOX) {
            ;
        }
        return null;
    }


    //새로운 요구사항 클라우드 간 복사
    public FileInfo copy(FileInfo fileInfo, CloudId to) {
        CloudId from = fileInfo.getCloudId();
        if (to == CloudId.DROPBOX) {
            if (from == CloudId.BOX) {

            }
            //추가된 클라우드 별 분기문이 모두 존재해야 함.
        } else if (to == CloudId.BOX) {
            if (from == CloudId.DROPBOX) {

            }
            //추가된 클라우드 별 분기문이 모두 존재해야 함.
        }
        //.........
        return null;
    }


    //개발 시간 증가 이유
    //- 코드 구조가 길어지고 복잡해짐
    //  . 중첩 if-else는 복잡도 배로 증가
    //  . if-else가 많을 수록 진척 더딤(신중 모드)
    //- 관련 코드가 여러 곳에 분산됨
    //  . 한 클라우드 처리와 관련된 코드가 여러 메서드에 흩어짐
    //- 결과적으로, 코드 가독성과 분석 속도 저하
    //  . 코드 추가에 따른 노동 시간 증가
    //  . 실수하기 쉽고 이로 인한 블필요한 디버깅 시간 증가
}
