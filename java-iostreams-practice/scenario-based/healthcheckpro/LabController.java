package healthcheckpro;

public class LabController {

    @PublicAPI(description = "Get all lab tests")
    public void getAllTests() {
    }

    @PublicAPI(description = "Book a lab test")
    @RequiresAuth
    public void bookTest() {
    }

    public void deleteTest() {
    }
}
