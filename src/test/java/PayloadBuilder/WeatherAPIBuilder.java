package PayloadBuilder;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.UUID;

public class WeatherAPIBuilder {


    public static JSONObject registerPayload(){
        JSONObject payload = new JSONObject();

        String externalId = "DEMO_TEST_" + UUID.randomUUID().toString().replace("-", "").substring(0, 8);
        String name = "San Francisco Test Station " + UUID.randomUUID().toString().substring(0, 4);

        payload.put("external_id", externalId);
        payload.put("name", name);
        payload.put("latitude", 37.76);
        payload.put("longitude", -122.43);
        payload.put("altitude", 150);

        return payload.toString();


    }
}
