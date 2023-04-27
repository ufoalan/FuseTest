package org.mycompany;

import org.apache.camel.*;
import org.apache.camel.util.ExchangeHelper;

public class SentimentAnalysisProcessor implements Processor {
        
    static int num_neutral = 0;
    static int num_negative = 0;
    static int num_realnegative = 0;
    static int num_positive = 0;
    static int num_realpositive = 0;

    public SentimentAnalysisProcessor() { }

    public void process(Exchange exchange) throws Exception
    {
        // Insert code that gets executed *before* delegating
        // to the next processor in the chain.
        Message in = exchange.getIn();
        String tweet = in.getBody(String.class);
        String sentiment = SentimentAnalyzer.findSentiment(tweet);
        System.out.println(tweet + ", " + sentiment);
        in.setBody(tweet + ": " + sentiment);
        if(sentiment.equalsIgnoreCase("Neutral")){
            num_neutral++;
        }
        else if(sentiment.equalsIgnoreCase("Negative")){
            num_negative++;
        }
        else if(sentiment.equalsIgnoreCase("Very Negative")){
            num_realnegative++;
        }
        else if(sentiment.equalsIgnoreCase("Very Positive")){
            num_realpositive++;
        }
        else{
            num_positive++;
        }
        System.out.println("Real Negative: " + num_realnegative);
        System.out.println("Negative: " + num_negative);
        System.out.println("Neutral: " + num_neutral);
        System.out.println("Positive: " + num_positive);
        System.out.println("Real Positive: " + num_realpositive);

//        in.setBody(in.getBody(String.class) + " World!");
    }
}