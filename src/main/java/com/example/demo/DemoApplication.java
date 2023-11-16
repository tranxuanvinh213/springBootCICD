package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    /*
    echo "# springBootCICD" >> README.md
    git init
    git add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin https://github.com/vinhit213/springBootCICD.git
    git push -u origin main
     */

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
