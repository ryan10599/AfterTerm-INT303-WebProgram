/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int303.PrimeNumber.Model;

/**
 *
 * @author user
 */
public class PrimeNumberModel {

    private int input;
    private String result2;

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public String getResult2() {
        int count = 0;

            for (int i = 1; i <= input; i++) {
                double result = input % i;
                
                if (result == 0.0) {
                    count++;
                }

            }

            System.out.println("Count = " + count);

            String result2 = "";

            if (count == 2) {
                result2 = "This Number is Prime Number";
            } else if (count != 2) {
                result2 = "This Number isn't Prime Number";
            }
        return result2;
    }

    public void setResult2(String result2) {
        this.result2 = result2;
    }

    @Override
    public String toString() {
        return String.format("<h1>x=%d <br> Result=%s</h1>", input, result2);
    }
    

}
