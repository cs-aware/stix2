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

	@Override
	public void write(JsonWriter out, LocalDateTime value) throws IOException {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		String timeString = value.format(formatter);
		out.value(timeString);
	}

	@Override
	public LocalDateTime read(JsonReader in) throws IOException {
		String timeString = in.nextString();
		ZonedDateTime zdt = ZonedDateTime.parse(timeString);
		LocalDateTime localDateTime = zdt.toLocalDateTime();
		return localDateTime;
	}
}
