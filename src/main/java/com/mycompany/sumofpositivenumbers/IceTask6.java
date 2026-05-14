/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumofpositivenumbers;
import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */
public class IceTask6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        while (number >= 0){
        sum += number;
        System.out.print("Enter a number ");
        number = input.nextInt();
        }
        System.out.println("The sum of all positive numbers entered is: " + sum);
        
        input.close();
    }
}
