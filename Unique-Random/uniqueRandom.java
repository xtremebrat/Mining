import java.io.*;
import java.util.*;
class uniqueRandom
{
	public static void main(String args[])throws IOException
	{

		Random rng = new Random(); // Ideally just create one instance globally
		// Note: use LinkedHashSet to maintain insertion order
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Maximum Number :");
		int n=Integer.parseInt(br.readLine());
		Set<Integer> generated = new LinkedHashSet<Integer>();
		while (generated.size() < n)
		{
		    Integer next = rng.nextInt(n) + 1;
		    // As we're adding to a set, this will automatically do a containment check
		    generated.add(next);
		}
		System.out.println(generated);
		
	}
}
