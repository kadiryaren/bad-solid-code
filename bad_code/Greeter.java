package src.main.java.open_closed_bad;

public class Greeter {
    String formality_1;

    public String greet() {
        if (this.formality_1 == "formal") {
            return "Good evening, sir.";
        }
        else if (this.formality_1 == "casual") {
            return "Sup bro?";
        }
        else if (this.formality_1 == "intimate") {
            return "Hello Darling!";
        }
        else {
            return "Hello.";
        }
    }

    public void setFormality_1(String formality_1) {
        this.formality_1 = formality_1;
    }
}
