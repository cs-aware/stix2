package eu.csaware.stix2.common;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTypeAdapter extends TypeAdapter<LocalDateTime> {

    private static String pattern = "YYYY-MM-dd'T'HH:mm:ss.SSS'Z'";
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

    @Override
    public void write(JsonWriter out, LocalDateTime value) throws IOException {
        out.value(value.format(formatter));
    }

    @Override
    public LocalDateTime read(JsonReader in) throws IOException {

        ZonedDateTime zdt = ZonedDateTime.parse(in.nextString());
        return zdt.toLocalDateTime();
    }
}
