package firstArray;

public class DogNameslong {

	public static void main(String[] args) {
		String[] petName = new String[3];

		petName[0] = "mickey";
		petName[1] = "minnie";
		petName[2] = "punete";
		// for each loop
		System.out.println("==========FOREACH LOOP===========");
		for (String dognames : petName) {
			System.out.println(dognames);
		}
		System.out.println("==========FOR LOOP==============");
		
		// for loop
		for (int i = 0; i < petName.length; i++) {
			System.out.println(petName[i]);
		}
	}

}
