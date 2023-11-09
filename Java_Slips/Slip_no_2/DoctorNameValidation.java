import java.util.Scanner;

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

public class DoctorNameValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter Doctor Name: ");
            String doctorName = scanner.nextLine();
            validateDoctorName(doctorName);
            System.out.println("Doctor Name is valid: " + doctorName);
        } catch (InvalidNameException e) {
            System.out.println("Name is Invalid: " + e.getMessage());
        }
    }

    public static void validateDoctorName(String name) throws InvalidNameException {
        // Regular expression to check for digits or special symbols
        String regex = ".*[0-9!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*";
        
        if (name.matches(regex)) {
            throw new InvalidNameException("Doctor Name contains digits or special symbols.");
        }
    }
}
