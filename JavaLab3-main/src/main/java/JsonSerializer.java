import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JsonSerializer<T> implements Serializer<T> {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void serialize(T object, File file) throws Exception {
        objectMapper.writeValue(file, object);
    }

    @Override
    public T deserialize(File file) throws Exception {
        return objectMapper.readValue(file, (Class<T>) Rental.class); // Вказуємо клас Rental
    }
}
