package io.github.shreeshasa;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SQSEvent;

/**
 * @author shreeshasa
 */
public class LambdaHandler implements RequestHandler<SQSEvent, Void> {

  @Override
  public Void handleRequest(SQSEvent event, Context context) {
    for (SQSEvent.SQSMessage msg : event.getRecords()) {
      context.getLogger().log(msg.getBody());
    }
    return null;
  }
}
