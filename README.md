# 日志链路追踪工具包
通过traceId串联服务内与服务之间的请求日志，方便排查问题

## 引入jar包
        <dependency>
            <groupId>com.cp</groupId>
            <artifactId>trace-client</artifactId>
            <version>0.0.1-SNAPSHOT</version>
        </dependency>
## 修改logback.xml
控制台输出格式里添加%X{traceId}即可打印

## 版本更新

#### 0.0.1版
* 只支持服务内请求链路