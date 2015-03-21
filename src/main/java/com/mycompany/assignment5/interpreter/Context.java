/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.assignment5.interpreter;

/**
 *
 * @author Kurt
 */
public class Context {

    private String input;
    private int output;

    public Context(String input)
    {
      this.input = input;
    }

    public String getInput()
    {
      return input;
    }
    
    public void setInput(String input)
    {
      this.input = input; 
    }    

    public int getOutput()
    {
      return output;
    }

    public void setOutput(int output)
    {
      this.output = output;
    }
    
}
