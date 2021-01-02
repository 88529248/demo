package com.example.demo.spring.mgr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AopMgrImpl implements AopMgr{

    Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void execute() {
        logger.info("AopMgrImpl......");
    }
}
