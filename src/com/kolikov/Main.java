package com.kolikov;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class Main {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws IOException {
        objectMapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, false);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

        simpleSerialization();
    }

    private static void simpleDeserialization() throws IOException {
        URL resources = Main.class.getResource("/category.json");
        Category category = objectMapper.readValue(resources, Category.class);

        System.out.println(category);
    }

    private static void simpleSerialization() throws IOException {
        Category category = new Category();
        category.setId(123);
        category.setName("Фантастика");

        Book book = new Book();
        book.setName("Книга");
        book.setCategory(category);

        category.setBooks(List.of(book));

        String categoryJson = objectMapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(category);
        System.out.println(categoryJson);
    }

    private static void pointer() throws IOException {
        URL resources = Main.class.getResource("/simple.json");
        JsonNode jsonNode = objectMapper.readTree(resources);

        JsonNode node = jsonNode.at("/websites/0/description");
        System.out.println(node.asText());
    }

    private static void readArray() throws IOException {
        URL resources = Main.class.getResource("/array.json");
        ArrayNode arrayNode = (ArrayNode) objectMapper.readTree(resources);

        for (JsonNode jsonNode : arrayNode) {
            if (jsonNode instanceof ObjectNode) {
                for (Iterator<String> it = jsonNode.fieldNames(); it.hasNext(); ) {
                    String nameField = it.next();
                    System.out.println(nameField);
                }
            } else if (jsonNode instanceof BooleanNode) {
            }
        }
    }

    private static void readTree() throws IOException {
        URL resources = Main.class.getResource("/simple.json");
        JsonNode jsonNode = objectMapper.readTree(resources);
        System.err.println(jsonNode.get("first_name").asText());

        System.out.println(jsonNode.get("websites").get(0).get("description").asText());
    }
}
