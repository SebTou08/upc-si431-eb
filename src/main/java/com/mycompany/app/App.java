package com.mycompany.app;

/**
 * Holi
 */
public class App
{

    private final String message = "Holi, esto es un cambio!";
    
    

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
