package org.mycompany;

import org.apache.camel.Exchange;
import org.apache.camel.json.simple.JsonObject;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.apache.camel.runtimecatalog.JSonSchemaResolver;
import org.json.simple.JSONObject;
import twitter4j.*;

public class SAAggregationStrategy implements AggregationStrategy {

    public Exchange aggregate(Exchange original, Exchange resource) {
        Status originalBody = original.getIn().getBody(Status.class);
        JSONObject inResObject = resource.getIn().getBody(JSONObject.class);
        Object resourceResponse = resource.getOut().getBody();
        Object mergeResult = resourceResponse;
        inResObject.put("userName", originalBody.getUser().getName());
        inResObject.put("userScreenName", originalBody.getUser().getScreenName());
        inResObject.put("userLocation", originalBody.getUser().getLocation());
        inResObject.put("favouritesCount", originalBody.getUser().getFavouritesCount());
        inResObject.put("retweetCount", originalBody.getRetweetCount());
        inResObject.put("favoriteCount", originalBody.getFavoriteCount());
        inResObject.put("text", originalBody.getText());
        mergeResult = inResObject;
        System.out.println(mergeResult.toString());
        if (original.getPattern().isOutCapable()) {
            original.getOut().setBody(mergeResult);
        } else {
            original.getIn().setBody(mergeResult);
        }
        return original;
    }
}
