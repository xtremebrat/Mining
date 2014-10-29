import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import weka.associations.Apriori;
import weka.core.Instances;

public class WekaApriori
{
	public static void main(String[] args) 
	{
		Instances data = null;
		try 
		{
			BufferedReader reader = new BufferedReader(new FileReader("data/supermarket.arff"));
			data = new Instances(reader);
			reader.close();
			data.setClassIndex(data.numAttributes() - 1);
		} catch (IOException e) 
		
		{
			e.printStackTrace();
		}
		double deltaValue = 0.05;
		double lowerBoundMinSupportValue = 0.1;
		double minMetricValue = 0.9;
		int numRulesValue = 10;
		double upperBoundMinSupportValue = 1.0;
		String resultapriori;
		Apriori apriori = new Apriori();
		apriori.setDelta(deltaValue);
		apriori.setLowerBoundMinSupport(lowerBoundMinSupportValue);
		apriori.setNumRules(numRulesValue);
		apriori.setUpperBoundMinSupport(upperBoundMinSupportValue);
		apriori.setMinMetric(minMetricValue);
		try 
		
		{
			apriori.buildAssociations(data);
		} catch (Exception e) 
		
		{
			e.printStackTrace();
		}
		resultapriori = apriori.toString();
		System.out.println(resultapriori);
	}
}
