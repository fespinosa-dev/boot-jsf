package dev.fespinosa.bootjsf;


import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class HomeController {
    private String message = "Hello World";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
