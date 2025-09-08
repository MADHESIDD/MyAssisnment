package homeassign.sep6;

public class ApiClient {
	public void sendRequest(String endpoint) {
		System.out.println("EndPoint:"+endpoint);
	}
public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
		System.out.println("EndPoint:"+endpoint);
		System.out.println("RequestBody:"+requestBody);
		if(requestStatus)
		{
			System.out.println("RequestStatus Successful");
		}
		else {
			System.out.println("requestFailed");
		}
	}
public static void main(String[] args) {
	ApiClient ap=new ApiClient();
	ap.sendRequest("ClientDetails");
	ap.sendRequest("ClientName:", "{ \"name\": \"John\", \"age\": 30 }", true);
}
}
