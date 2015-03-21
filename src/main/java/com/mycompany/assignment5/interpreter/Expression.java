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
public abstract class Expression {

    public void interpret(Context context)
    {
      if (context.getInput().length() == 0) 
        return;

      if (context.getInput().startsWith(nine()))
      {
        context.setOutput(context.getOutput() + (9 * multiplier()));
        context.setInput(context.getInput().substring(2));
      }
      else if (context.getInput().startsWith(four()))
      {
        context.setOutput(context.getOutput() + (4 * multiplier()));
        context.setInput(context.getInput().substring(2));
      }
      else if (context.getInput().startsWith(five()))
      {
        context.setOutput(context.getOutput() + (5 * multiplier()));
        context.setInput( context.getInput().substring(1));
      }

      while (context.getInput().startsWith(one()))
      {
        context.setOutput(context.getOutput() + (1 * multiplier()));
        context.setInput(context.getInput().substring(1));
      }
    }

    public abstract String one();
    public abstract String four();
    public abstract String five();
    public abstract String nine();
    public abstract int multiplier();
    
}
