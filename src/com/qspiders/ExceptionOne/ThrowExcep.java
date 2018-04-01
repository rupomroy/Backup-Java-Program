package com.qspiders.ExceptionOne;

class ThrowExcep
{
    static void fun()
    {
        try
        {
        	 throw new NullPointerException();
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught inside fun().");
            throw new NullPointerException();
        }
    }
 
    public static void main(String args[])
    {
        try
        {
            fun();
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught in main.");
        }
    }
}