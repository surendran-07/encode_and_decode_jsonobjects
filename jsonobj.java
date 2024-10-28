package sem;

public class jsonobj {
    public static void main(String[] args) {
        String jsonString = "{ \"name\": \"John Doe\", \"age\": 30 }";

        // Extracting name and age
        String name = jsonString.split("\"name\": \"")[1].split("\"")[0];
        int age = Integer.parseInt(jsonString.split("\"age\": ")[1].split(" }")[0]);

        // Displaying the output
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
