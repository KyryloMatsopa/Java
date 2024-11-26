import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;

/**
 * Реалізація інтерфейсу Serializer для формату XML.
 */
public class XmlSerializer<T> implements Serializer<T> {
    private final XmlMapper xmlMapper = new XmlMapper();

    @Override
    public void serialize(T object, File file) throws Exception {
        xmlMapper.writeValue(file, object);
    }

    @Override
    public T deserialize(File file) throws Exception {
        return xmlMapper.readValue(file, (Class<T>) Rental.class); // Вказуємо клас Rental
    }
}
