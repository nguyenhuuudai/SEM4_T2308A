package org.fai.study.demo_redis.entity;

public class RedisString {
    public String key;
    public String value;

    public RedisString(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public RedisString() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
