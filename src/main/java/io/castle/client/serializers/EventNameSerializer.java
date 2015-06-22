package io.castle.client.serializers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import io.castle.client.objects.Event;

import java.io.IOException;

/**
 * Created by castleofsand on 22/06/15.
 */
public class EventNameSerializer extends JsonSerializer<Event.EventName> {

    @Override
    public void serialize(Event.EventName eventName, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        jsonGenerator.writeString(eventName.getEventName());
    }
}
