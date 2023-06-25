package com.demo.bredit.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BreditController {
    // #@/

    @Value("${server.port}")
    int port;

    @GetMapping("/product")
    public String Product() {
        return "port: " + port;
    }

    @GetMapping("/question1")
    @ResponseBody
    public int question1(@RequestParam int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            // System.out.println("i = " + i);
            sum += i;
        }

        return sum;
    }

    @GetMapping("/question2")
    @ResponseBody
    public List<Integer> question2(@RequestParam List<Integer> n,
            @RequestParam("chunk") Integer sizeOfProcess) {
        List<Integer> result = new ArrayList<>(); // Arrays.asList(1,2,3);
        int sum = 0;
        int num = 0;
        for (int i = 0; i < n.size(); i++) {
            num = n.get(i);
            sum += num;
            if ((i + 1) % sizeOfProcess == 0) {
                result.add(sum);
                sum = 0;
            } else if ((n.size() - 1) == i) {
                result.add(sum);
            }
        }

        return result;
    }

    @GetMapping("/question3")
    @ResponseBody
    public int question3(@RequestParam int sizeX, int sizeY, int elementX, int elementY) {
        int countRound = 0;

        while (countRound < (sizeX + sizeY)) {
            int count = 0;
            for (int y = 1; y <= sizeY; y++) {
                for (int x = 1; x <= sizeX; x++) {
                    if ((Math.abs(elementX - x) <= countRound)
                            && (Math.abs(elementY - y) <= countRound)) {
                        // System.out.print("x");
                        count++;

                    } // else {
                      // System.out.print("-");
                      // }

                }
                // System.out.println();
            }

            countRound++;
            if (count == (sizeX * sizeY)) {
                break;
            }
        }

        return countRound;
    }
}
