package com.walmart.receiving.store.delta.common;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface Sink {


    String COSMOSTODB2_SUCCESS = "cosmostodb2_success";

    @Input("cosmostodb2_success")
    SubscribableChannel cosmostodb2_success();


    String DB2_COSMOS_STORE_SUCCESS = "db2_cosmos_store_success";

    @Input("db2_cosmos_store_success")
    SubscribableChannel db2_cosmos_store_success();


}
