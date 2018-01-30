package pe.softweb.app;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class App 
{
    public static void main( String[] args )
    {
    	try {
			Unirest.post("http://httpbin.org/post")
			  .queryString("name", "Mark")
			  .field("last", "Polo")
			  .asJson();
			
			String x = Unirest.get("http://localhost:3012/responsable/listar")
			  .asJson().getBody().toString();
			System.out.println(x);
			
			Unirest.post("http://localhost:3012/responsable/test")
			  .queryString("data", "{\"hola\":\"mundo\"}")
			  .field("data", "Polo")
			  .asJson();
		} catch (UnirestException e) {
			//e.printStackTrace();
			System.out.println(e.toString());
		}
        System.out.println( "Hello World!" );
    }
}
