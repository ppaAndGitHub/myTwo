package com.newtouch.myspringboot.config;

/**
 * 然后在 src/main/java/com/newtouch/myspringboot/config 目录下创建 HttpclientSpringConfig.java 文件
 * 这里用到了四个很重要的注解
 * @Configuration : 作用于类上，指明该类就相当于一个xml配置文件
 * @Bean : 作用于方法上，指明该方法相当于xml配置中的，注意方法名的命名规范
 * @PropertySource : 指定读取的配置文件，引入多个value={"xxx:xxx","xxx:xxx"},ignoreResourceNotFound=true 文件不存在时忽略
 * @Value : 获取配置文件的值，该注解还有很多语法知识，这里暂时不扩展开
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.concurrent.TimeUnit;

/**
 * @Configuration   作用于类上，相当于一个xml配置文件
 * @Bean            作用于方法上，相当于xml配置中的<bean>
 * @PropertySource  指定读取的配置文件
 * @Value           获取配置文件的值
 */
@Configuration
@PropertySource(value = "classpath:httpclient.properties")
public class HttpclientSpringConfig {
    @Value("${http.maxTotal}")
    private Integer httpMaxTotal;

    @Value("${http.defaultMaxPerRoute}")
    private Integer httpDefaultMaxPerRoute;

    @Value("${http.connectTimeout}")
    private Integer httpConnectTimeout;

    @Value("${http.connectionRequestTimeout}")
    private Integer httpConnectionRequestTimeout;

    @Value("${http.socketTimeout}")
    private Integer httpSocketTimeout;

//    @Autowired
//    private PoolingHttpClientConnectionManager manager;
//
//    @Bean
//    public PoolingHttpClientConnectionManager poolingHttpClientConnectionManager() {
//        PoolingHttpClientConnectionManager poolingHttpClientConnectionManager = new PoolingHttpClientConnectionManager();
//        // 最大连接数
//        poolingHttpClientConnectionManager.setMaxTotal(httpMaxTotal);
//        // 每个主机的最大并发数
//        poolingHttpClientConnectionManager.setDefaultMaxPerRoute(httpDefaultMaxPerRoute);
//        return poolingHttpClientConnectionManager;
//    }
//
//    @Bean   // 定期清理无效连接
//    public IdleConnectionEvictor idleConnectionEvictor() {
//        return new IdleConnectionEvictor(manager, 1L, TimeUnit.HOURS);
//    }
//
//    @Bean   // 定义HttpClient对象 注意该对象需要设置scope="prototype":多例对象
//    @Scope("prototype")
//    public CloseableHttpClient closeableHttpClient() {
//        return HttpClients.custom().setConnectionManager(this.manager).build();
//    }
//
//    @Bean   // 请求配置
//    public RequestConfig requestConfig() {
//        return RequestConfig.custom().setConnectTimeout(httpConnectTimeout) // 创建连接的最长时间
//                .setConnectionRequestTimeout(httpConnectionRequestTimeout) // 从连接池中获取到连接的最长时间
//                .setSocketTimeout(httpSocketTimeout) // 数据传输的最长时间
//                .build();
//    }
}
