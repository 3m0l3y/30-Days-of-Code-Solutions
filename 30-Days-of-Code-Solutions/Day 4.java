public class Person {
    private int age;
    private int initialAge;
  
	public Person(int initialAge) {
  		if(initialAge < 0){
            age = 0;
            System.out.println("Age is not valid, setting age to " + age + ".");        
        }
        else age = initialAge;
	}

	public void amIOld() {
        if(age < 13){
            System.out.println("You are young.");
        }
        if(age > 12 && age < 18){
            System.out.println("You are a teenager.");
        }
        else{
            if(age >= 18){
                System.out.println("You are old.");
            }
        } 
	}
    
	public void yearPasses() {
  		age = age + 1;
	}