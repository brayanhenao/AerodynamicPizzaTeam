import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class classtime {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(in.readLine());
		ArrayList<String> xd = new ArrayList<>();

		while (t-- > 0) {

			xd.add(flip(in.readLine()));
		}
		Collections.sort(xd);

		for (String string : xd) {
			out.println(flip(string));
		}

		in.close();
		out.close();
	}

	public static String flip(String xd) {
		StringTokenizer tk = new StringTokenizer(xd);
		String aux = tk.nextToken();
		return tk.nextToken() + " " + aux;
	}

}
