/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.BasicJava;

/**
 * Add your docs here.
 */
public class classExample {
    private int num;
    private String word;

    public classExample(int _num, String _word){
        num = _num;
        word = _word;
    }

    /**
     * to find the greater number in a pair of numbers
     * @param newNum - number being compared to num
     * @return whether or not the 
     */
    /*
    this is a method! All classes have methods
    In a program, there are often pieces of code that you have to use many times.
    a method is a way so you can run pieces of code without having to type the same thing over and over again.
    Since it would be extremely difficult to write robot code from scratch, 
    WPILib comes with a group of classes, with methods, that we use to write robot code.

    most of the time, methods have an input and output.
    Parameters are the input, they are variables unique to the method, declared in method header
    "int newNum" is the only parameter of this method. Methods can have as many parameters as you want or none.

    The return statement is the output of the method. the type of data returned is defined in the method header.
    the return type of this method is a boolean, which is either equal to true or false. 
    A method can return any data type, or none if the return type is declared as "void"
    */
    public boolean isGreater(int newNum){
        if(newNum <= num){
            return false;
        }
        else{
            return true;
        }
    }
}
