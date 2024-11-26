import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

import java.io.File;

/**
 * Реалізація інтерфейсу Serializer для формату YAML.
 */
public class YamlSerializer<T> implements Serializer<T> {
    private final YAMLMapper yamlMapper = new YAMLMapper();

    @Override
    public void serialize(T object, File file) throws Exception {
        yamlMapper.writeValue(file, object);
    }

    @Override
    public T deserialize(File file) throws Exception {
        return yamlMapper.readValue(file, (Class<T>) Rental.class); // Вказуємо клас Rental
    }
}
