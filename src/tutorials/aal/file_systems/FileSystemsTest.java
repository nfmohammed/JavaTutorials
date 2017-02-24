package tutorials.aal.file_systems;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FileSystemsTest {
	
	public static void main(String[] args) {
		FileSystemsTest fst = new FileSystemsTest();
		collectDataFromFileAndPutIntoMap("FileSystemData.txt");
	}
	
	public static void collectDataFromFileAndPutIntoMap(String fname)
	{
		Map<String,Integer> m=new HashMap<String,Integer>();
		String filePath = System.getProperty("user.dir") + "/src/tutorials/aal/file_systems/" + fname;
		File f=new File(filePath);
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
