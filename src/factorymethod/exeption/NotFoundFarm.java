package factorymethod.exeption;

public class NotFoundFarm extends RuntimeException {
    private String message;

    public NotFoundFarm(String message) {
        this.message = message;
    }
}
