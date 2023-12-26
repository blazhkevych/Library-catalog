package LibraryCatalog.SerializationDeserialization;

import LibraryCatalog.Catalog;

// Интерфейс для моста сериализации
public interface SerializationBridge {
    // Сериализация
    byte[] serialize(Catalog catalog);

    // Десериализация
    Catalog deserialize(byte[] data);
}
