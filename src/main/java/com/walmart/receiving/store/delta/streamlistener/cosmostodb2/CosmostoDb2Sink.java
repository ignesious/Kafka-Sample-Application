package com.walmart.receiving.store.delta.streamlistener.cosmostodb2;


import com.walmart.receiving.store.delta.common.Sink;

import java.util.logging.Logger;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(Sink.class)
public class CosmostoDb2Sink {

    private static final Logger LOGGER = Logger.getLogger(CosmostoDb2Sink.class.getName());


   @StreamListener(Sink.COSMOSTODB2_SUCCESS)
    public void cosmostodb2_success(String successInput) throws Exception {

        LOGGER.info("Inside cosmostodb2_success input message --> " + successInput);

    }



}
