import org.apache.http.HttpHost;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.xcontent.XContentType;
import org.junit.After;
import org.junit.Before;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class EsTest {

    public static RestHighLevelClient client = new RestHighLevelClient(
            RestClient.builder(
                    new HttpHost("localhost", 9200, "http"),
                    new HttpHost("localhost", 9201, "http")));



    public static void main(String[] args) throws IOException {
        //##################################### step0: 创建索引 #####################################
        // 创建Request对象， 准备创建的索引名为twitter
        if(false){
            CreateIndexRequest request = new CreateIndexRequest("twitter");

            // 设置Request参数
            request.settings(Settings.builder()
                    .put("index.number_of_shards", 3) // 设置分区数
                    .put("index.number_of_replicas", 2) // 设置副本数
            );

            // 通过JSON字符串的方式，设置ES索引结构的mapping
            // ps: 通常都是通过json配置文件加载索引mapping配置，不需要拼接字符串。
            request.mapping(
                    "{\n" +
                            "  \"properties\": {\n" +
                            "    \"message\": {\n" +
                            "      \"type\": \"text\"\n" +
                            "    }\n" +
                            "  }\n" +
                            "}",
                    XContentType.JSON);
            CreateIndexResponse createIndexResponse = client.indices().create(request, RequestOptions.DEFAULT);
            if (createIndexResponse.isAcknowledged()) {
                System.out.println("创建成功");
            }
        }



        //##################################### step1: 插入数据 #####################################
        // indexName must be lowercase
        if(true){
            // 创建对应的Request请求，设置索引名为javaestest
            IndexRequest request = new IndexRequest("javaestest");
            // 设置文档id=1
            request.id("2");

            // 以json字符串的形式设置文档内容，也就是准备插入到ES中的数据
            String jsonString = "{" +
                    "\"user\":\"knight\"," +
                    "\"postDate\":\"2022-01-30\"," +
                    "\"message\":\"trying out javaElasticsearch\"" +
                    "}";
            request.source(jsonString, XContentType.JSON);

            // 执行请求
            IndexResponse indexResponse = client.index(request, RequestOptions.DEFAULT);
            System.out.println(indexResponse);
        }

        //##################################### step2:查询数据 #####################################
        if (true){
            GetRequest getRequest = new GetRequest(
                    "javaestest",
                    "2");

            // 执行ES请求
            GetResponse getResponse = client.get(getRequest, RequestOptions.DEFAULT);

            // 处理查询结果
            String index = getResponse.getIndex();
            String id = getResponse.getId();
            // 检查文档是否存在
            if (getResponse.isExists()) {
                long version = getResponse.getVersion();
                // 获取文档数据的json字符串形式，可以使用json库转换成Java对象
                String sourceAsString = getResponse.getSourceAsString();
                // 获取文档数据的Map形式
                Map<String, Object> sourceAsMap = getResponse.getSourceAsMap();
                // 获取文档数据的字节数组形式
                byte[] sourceAsBytes = getResponse.getSourceAsBytes();
                System.out.println(sourceAsString);
            } else {
                // 文档不存在
                System.out.println("文档不存在");
            }
        }

        //##################################### step3:更新索引 #####################################
        // ：创建对应的Request对象，设置索引名为javaestest, 文档id=1
        if(false){
            UpdateRequest request = new UpdateRequest("javaestest", "2");

            // 以map形式，设置需要更新的文档字段
            Map<String, Object> jsonMap = new HashMap<>();
            jsonMap.put("updated", new Date());
            jsonMap.put("reason", "daily update");
            request.doc(jsonMap);

            // 执行请求
            UpdateResponse updateResponse = client.update(
                    request, RequestOptions.DEFAULT);
            System.out.println(updateResponse);
        }


        //##################################### step4:删除索引 #####################################
        // 创建对应的Request对象，设置索引名为javaestest, 文档id=1
        if(false){
            DeleteRequest request = new DeleteRequest(
                    "javaestest",
                    "1");
            // 执行请求
            DeleteResponse deleteResponse = client.delete(
                    request, RequestOptions.DEFAULT);
            System.out.println(deleteResponse);
        }
        client.close();
    }
}


/*
* 发现 索引和mapping都可以不实现创建
* 直接插入数据即可
* 推测为 默认方式配置*
* */