import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.JSONArray;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JsonExample {
    public static void main(String[] args) {

        /* Serialize & Deserialize Java object to JSON */

        ObjectMapper objectMapper = new ObjectMapper(); // Create an ObjectMapper instance
        Person person = new Person("John Doe", 30);  // Create a sample object to be converted to JSON
        try {
            // Serialize Java object to JSON
            String json = objectMapper.writeValueAsString(person);
            System.out.println("Serialized JSON: " + json);

            // Deserialize JSON to Java object
            Person deserializedPerson = objectMapper.readValue(json, Person.class);
            System.out.println("\nDeserialized Person:");
            System.out.println("Name: " + deserializedPerson.getName());
            System.out.println("Age: " + deserializedPerson.getAge());

        } catch (Exception e) {
            e.printStackTrace();
        }

        /* JSON to Object using Gson Library */

        String json = "{\"name\":\"John Doe\",\"age\":30}";
        // Create a Gson instance
        Gson gson = new Gson();
        Person person1 = gson.fromJson(json, Person.class);
        // Display information from the converted object
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());

        /* Object to JSON using Gson Library */

        String obj_to_json = gson.toJson(person);
        System.out.println(obj_to_json);

        /* Iterating over JSONObject*/

        String jsonString = "{\"name\":\"John\",\"age\":30}";
        JSONObject obj = new JSONObject(jsonString);
        System.out.println("Iterating over JSONObject:");
        Iterator<String> keys = obj.keys();//all keys: name & age
        while (keys.hasNext()) { //as long as there is another key
            String key = keys.next(); //get next key
            Object value = obj.get(key); //get next value by key
            System.out.println(key + " : " + value);//print key : value
        }

        /* Iterating over JSONArray*/

        System.out.println("Iterating over JSONArray:");
        JSONArray arr = new JSONArray();
        arr.put("Code");
        arr.put("With");
        arr.put("Ease");
        for(int i=0;i<arr.length();i++)
        {
            Object value = arr.get(i);
            System.out.println(value);
        }

        /* JsonArray to Java List using Gson Library */

        String jsonArray = "[{\"name\":\"John\",\"age\":30},{\"name\":\"Jane\",\"age\":25}]";
        Type listType = new TypeToken<List<Person>>() {}.getType();
        List<Person> personList = gson.fromJson(jsonArray, listType);
        for (Person p : personList) {
            System.out.println("Name: " + p.getName() + ", Age: " + p.getAge());
        }
    }
}
