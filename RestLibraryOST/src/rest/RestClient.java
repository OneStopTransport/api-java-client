package rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class RestClient {

	public static String executeHttpGet(String uri) {

		String erroLigacao = "Não foi possível obter ligação com o servidor OST.";
		
		BufferedReader in = null;

		HttpClient httpclient = new DefaultHttpClient();
		HttpGet request = new HttpGet();
		
		try {
			request.setURI(new URI(uri));
		} catch (URISyntaxException e1) {
			System.err.println("O URL enviado não é valido.");
			return null;
		}
		HttpResponse response = null;
		try {
			response = httpclient.execute(request);
		} catch (ClientProtocolException e1) {
			System.err.println(erroLigacao);
			return null;
		} catch (IOException e1) {
			System.err.println(erroLigacao);
			return null;
		}
		try {
			in = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		} catch (IllegalStateException e1) {
			System.err.println(erroLigacao);
			return null;
		} catch (IOException e1) {
			System.err.println(erroLigacao);
			return null;
		}
		
		StringBuffer sb = new StringBuffer("");
		String line = "";
		String NL = System.getProperty("line.separator");

		try {
			while ((line = in.readLine()) != null) {
				sb.append(line + NL);
			}
		} catch (IOException e1) {
			System.err.println("Não foi possível obter dados da ligação.");
			return null;
		}
		try {
			in.close();
		} catch (IOException e) {
			System.err.println("Não foi possível terminar a ligação.");
			return null;
		}
		finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					System.err.println("Não foi possível terminar a ligação.");
					return null;
				}
			}
		}
		return sb.toString(); 		
	}
}
