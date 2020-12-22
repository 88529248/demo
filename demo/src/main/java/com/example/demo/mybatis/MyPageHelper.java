package com.example.demo.mybatis;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.List;
import java.util.Properties;

class MyPageHelper {

    private List<PageBean> list;

    @PostConstruct
    void init() {
        for (int i = 0; i < 9; i++) {
            PageBean pageBean = new PageBean();
            pageBean.setId(i + "");
            pageBean.setTime(LocalDate.now() + "");
            pageBean.setUrl("url");
            list.add(pageBean);
        }
    }

    @GetMapping("/page")
    public List<PageBean> page(@RequestParam Integer curPage) {
//        PageHelper.startPage(1, 3,"id desc");  
//        PageInfo<PageBean> pageBeanPageInfo = new PageInfo<>(list);
//        return pageBeanPageInfo.getList();
        return null;


    }

    class PageBean {
        String id;

        String time;

        String url;


        public PageBean() {
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

}

