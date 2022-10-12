import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
public class Main{
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Vadym");
        person.setLastName("Lapynin");
        Gson gson = new GsonBuilder().create();
        String json = gson.toJson(person);
        System.out.println(json);
    }
}
