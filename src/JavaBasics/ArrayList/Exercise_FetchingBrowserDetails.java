package JavaBasics.ArrayList;
import java.util.ArrayList;

public class Exercise_FetchingBrowserDetails {

	String name;
	int version;
	ArrayList<String> pluginslist;
	
	
	
	public Exercise_FetchingBrowserDetails(String name, int version, ArrayList<String> pluginlist) {
		this.name = name;
		this.version = version;
		this.pluginslist = pluginlist;
	}



	public static void main(String[] args) {
		ArrayList<String> pluginList = new ArrayList<String>();
		pluginList.add("firepath");
		pluginList.add("chropath");
		pluginList.add("IDE");
		
		Exercise_FetchingBrowserDetails obj = new Exercise_FetchingBrowserDetails("Chrome",28,pluginList);
		System.out.println(obj.name);
		System.out.println(obj.version);
		
		for (int i = 0; i < obj.pluginslist.size(); i++) {
			System.out.println(obj.pluginslist.get(i));
		}

		
	}

}
