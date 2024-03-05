public class AgeValidation {

    //Melempar CustomAgeException jika umur tidak memenuhi kriteria
    public static void validateAge(int age) throws CustomAgeException{
        if (age < 0){
            throw new CustomAgeException("Umur tidak boleh memiliki nilai negtif");
        } else if(age > 150){
            throw new CustomAgeException("Umur melebihi batas yang relaistis");
        }
        System.out.println("Umur valid: " + age);
    }
}
