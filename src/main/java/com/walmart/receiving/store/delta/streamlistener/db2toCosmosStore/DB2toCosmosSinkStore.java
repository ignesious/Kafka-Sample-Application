package com.walmart.receiving.store.delta.streamlistener.db2toCosmosStore;


import com.walmart.receiving.store.delta.common.Sink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import java.util.logging.Logger;

@EnableBinding(Sink.class)
public class DB2toCosmosSinkStore {

    private static final Logger LOGGER = Logger.getLogger(DB2toCosmosSinkStore.class.getName());

    @StreamListener(Sink.DB2_COSMOS_STORE_SUCCESS)
    public void db2_cosmos_store_success(String successInput) throws Exception {

        LOGGER.info("Inside db2_cosmos_store_success input message --> " + successInput);

    }

}
