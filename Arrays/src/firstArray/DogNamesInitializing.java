package firstArray;

public class DogNamesInitializing{

	public static void main(String[] args) {
	
		//String[] petName = new String[5]; this is the format that it consoles
		String [] petName = {"Mickey", "Minnie", "Coco", "Rocky", "Batman"};
		//						0 		1			2		3		4
	
		//it printed [1] because array list starts from 0
		System.out.println(petName[1]); 
		
		System.out.println("=============FOR LOOP==============");
		//for loop will get the list of the pet names and saves it in the value of i
		for (int i = 0; i < petName.length; i++) {
			System.out.println(petName[i]);
		}
		
		System.out.println("=================FOREACH LOOP============");
		
		//foreach loop on the right side of : you save your array list, on the left you can declare any name 
		//it has to match the same value as your array string  
		for (String dogName: petName) {
			System.out.println(dogName);
		}
	}

}
