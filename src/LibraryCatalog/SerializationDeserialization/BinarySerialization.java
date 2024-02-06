package LibraryCatalog.SerializationDeserialization;

import LibraryCatalog.Catalog;

import java.io.*;

// // Класс, выполняющий бинарную сериализацию и десериализацию
public class BinarySerialization implements SerializationBridge {
    // Сериализация
    @Override
    public byte[] serialize(Catalog catalog) {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream(10000);
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(catalog);
            return bos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Десериализация
    @Override
    public Catalog deserialize(byte[] data) {
        try (ByteArrayInputStream bis = new ByteArrayInputStream(data);
             ObjectInputStream ois = new ObjectInputStream(bis)) {
            return (Catalog) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
