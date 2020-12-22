package com.example.demo.file;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

@RestController
public class MyMultipartFile {
    Logger logger = LoggerFactory.getLogger(getClass());

    @PostMapping("/file")
    public String upLoadFile(MultipartFile[] files,String[] name) {
    logger.info("--------------name:{}",name);
//        for (MultipartFile file : files) {
//            logger.info(file.getOriginalFilename());
//        }
        for (int i = 0; i < files.length; i++) {
            logger.info(files[i].getOriginalFilename());
            logger.info(name[i]);
        }
        return "success";

    }

    @Test
    public void test() {
        logger.info("-----start--------");
        for (int i = 0; i < 4; i++) {
            logger.info("-----start {}--------",i);
            try {
                if (i == 0) {
                    int error = 2 % 0;
                }
            } catch (Exception e) {
                logger.error("-------error{}--------",2);
            }
        }

        logger.info("-----end--------");

    }



}
