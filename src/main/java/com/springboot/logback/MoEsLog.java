package com.springboot.logback;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * com.springboot.logback
 * <strong>描述：</strong>
 * <strong>功能：</strong>
 * <strong>使用场景：</strong>
 * <strong>注意事项：</strong>
 *
 * @author: wangjun
 * @date: 2018/12/17.
 */


@Document(indexName = "eslog")
public class MoEsLog {

    @Id
    private String _id;

    private String message;

    private String dateTime;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
