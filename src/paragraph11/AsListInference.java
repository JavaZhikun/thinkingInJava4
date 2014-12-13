package paragraph11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AsListInference 
{
	public static void main(String[] args) {
		List<Snow> snow1 = Arrays.asList(
				new Crusty(), new Slush(), new Powder());
		
		//只有powder类型，会创建list<powder>
//		List<Snow> snow2 = Arrays.asList(
//				new Light(), new Heavy());
		
		List<Snow> snow3 = new ArrayList<Snow>();
		Collections.addAll(snow3, new Light(), new Heavy());
		
		List<Snow> snow4 =  Arrays.<Snow>asList(new Light(), new Heavy());
		System.out.println(snow4);
	}

}

class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}
