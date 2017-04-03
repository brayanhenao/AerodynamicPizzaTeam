import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class complexity {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

		String linea;

		while ((linea = in.readLine()) != null) {

			int[] letras = new int[26];

			for (int i = 0; i < linea.length(); i++) {

				letras[((int) linea.charAt(i)) - 97]++;

			}

			int cont = 0;

			for (int i = 0; i < letras.length; i++) {
				if (letras[i] > 0) {
					cont++;
				}
			}

			if (cont < 3) {
				out.println("0");
			} else {

				int res = 0;

				int ii = 1;
				while (cont > 2){
					
					for (int i = 0; i < letras.length; i++) {
						if (letras[i] == ii && cont > 2) {
							cont--;
							res += letras[i];
							letras[i] = 0;
						}
					}
					ii++;
				}
				

				out.println(res);
			}

		}

		in.close();
		out.close();
	}

}
