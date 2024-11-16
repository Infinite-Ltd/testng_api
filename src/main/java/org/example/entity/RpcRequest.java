package org.example.entity;


import lombok.Data;

@Data
public class RpcRequest {
    private String serviceName;
    private String methodName;
    private Object[] params;
    private Class<?>[] paramTypes;
    private String requestId;
    private String version;
    private String group;
    private String timeout;
    private String loadBalance;
    private String retry;
    private String retryInterval;
    private String retryTimes;
    private String retryStrategy;
    private String retryStrategyParam;
}
