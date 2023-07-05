package streams;

import java.io.*;
import java.util.*;
import java.util.function.Supplier;

public class ExceptionCaseStudy {
    // exception should be declared ot handled in the caller method
    private static List<String> create() throws IOException {
        throw new IOException();
    }

    public static void main(String[] args) throws IOException {
        //The problem that The Supplier interface does not allow checked exceptions.
        //Supplier<List<String>> s1 = ExceptionCaseStudy::create; // DOES NOT COMPILE
        ugly();
        Supplier<List<String>> s = ExceptionCaseStudy::createSafe;
    }

    // the first approach to solve this problem : catch the exception and turn it into an unchecked exception.
    // it works but it's not easy to read
    public static void ugly() {
        Supplier<List<String>> s = () -> {
            try {
                return ExceptionCaseStudy.create();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
    }


    //Another alternative is to create a wrapper method with the try/catch.
    private static List<String> createSafe() {
        try {
            return ExceptionCaseStudy.create();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}