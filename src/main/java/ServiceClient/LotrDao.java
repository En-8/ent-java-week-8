package ServiceClient;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.List;

public class LotrDao {

    public List<LotrBook> getLotrBooks() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://the-one-api.herokuapp.com/v1/book");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        ObjectMapper mapper = new ObjectMapper();
        Response apiResponse = mapper.readValue(response, Response.class);
        return apiResponse.getDocs();
    }
}
