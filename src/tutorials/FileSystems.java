package tutorials;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FileSystems {
	
	public static void main(String[] args) {
		collectDataFromFileAndPutIntoMap("/Users/FerozMac/Documents/Tools/Java/resources/FileSystemData.txt");
	}
	
	public static void collectDataFromFileAndPutIntoMap(String loc)
	{
		Map<String,Integer> m=new HashMap<String,Integer>();
		File f=new File(loc);
		try {
			BufferedReader br=new BufferedReader(new FileReader(f));
			String s=null;
			String[] tok;
			while((s=(br.readLine()))!=null)
			{
				for(String s1: s.split(" "))
				{
					if(m.get(s1)==null)
				      m.put(s1,1);
					else
						m.put(s1, m.get(s1)+1);
				}
				iterateOverHashMap(m);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void iterateOverHashMap(Map<String, Integer> m) {
		Iterator it=m.entrySet().iterator();
		while(it.hasNext())
		{
		Map.Entry pairs=(Map.Entry) it.next();
		System.out.println(pairs.getKey() + "----" + pairs.getValue());
		}
	}

}
