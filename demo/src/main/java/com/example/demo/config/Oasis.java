package com.example.demo.config;

public interface Oasis {

    /**
     * kubectl get svc | grep oasis-log
     * kubectl exec oasis-xx-xx-xx   env | grep xxx
     * RD：
     * ssh 192.168.0.11      password:Aa123456@h3c
     * mysql :  grep mar     mysql -uroot -proot
     * kafka:
     * ssh192.168.0.40   pw:Aa123456@h3c
     * cd /opt/bak/kafka_2.11-2.1.0/bin
     * sh  kafka-console-consumer.sh --bootstrap-server 192.168.0.40:9092 --topic wlan_problem --from-beginning --property print.timestamp=true
     * db.auth('root','oasis-rd@h3c')
     * at：
     * 223.71.63.145:21091 ?root ?Aa12345678@h3c
     * mysql master节点 5.0.0.84 root root
     * mongo 5.0.0.169   psd:12345678
     * redis 5.0.0.172  psd:12345678
     * kafka:5.0.0.63
     * cd /opt/kafka/kafka_2.11_1.1.0/bin
     * sh  kafka-console-consumer.sh --bootstrap-server 5.0.0.63:9092 --topic wlan_problem --from-beginning --property print.timestamp=true
     *
     * 微软云：
     * azure-h3c.chinanorth.cloudapp.chinacloudapi.cn
     * port:61022
     * user:oasis
     * pwd:@@Pa55w0rd@@
     * rizhi:ssh root@
     * 172.16.4.28   Aa123456
     * mongo:172.16.4.34     psd:azureadminpwd
     * kafka: ssh root@172.20.2.17   psd: Aazureadminpwda123456
     *
     * 国际云：
     * oasisgw.southeastasia.cloudapp.azure.com:22
     * root  Aa123456@h3c
     * ssh 10.0.0.10
     * 命令助手：
     * 1.查看radio上终端信息
     * --sys
     * --dis wlan ap  (radio)  all client---
     *
     * 更新SQL：
     * update tbl_oasis_dgroup_room r join (select s.id,u.name from tbl_oasis_shop s join tbl_oasis_user_region ur on ur.region_id=s.region_id  join tbl_oasis_user u on u.id = ur.user_id where u.parent_id is NULL) tmp on r.shop_id = tmp.id set r.user_name=tmp.name where r.group_name='AREA';
     *
     *
     * mongod --dbpath D:\MongoDB\data\db
     * redis-server.exe redis.windows.conf
     * rabbitmq-server.bat
     */
}
