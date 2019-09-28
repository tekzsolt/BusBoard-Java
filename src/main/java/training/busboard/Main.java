package training.busboard;

import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class Main {
    public static void main(String args[]) {
        //id: 490008660N
//        List<widget> widgets = client
//                .path("/widgets")
//                .request(MediaType.APPLICATION_JSON_TYPE)
//                .get(new GenericType<List<Widget>>() {});

        Client client = ClientBuilder.newBuilder().register(JacksonFeature.class).build();

//        List<widget> widgets = client
//                .path("/widgets")
//                .request(MediaType.APPLICATION_JSON_TYPE)
//                .get(new GenericType<List<Widget>>() {});
    }
}	
