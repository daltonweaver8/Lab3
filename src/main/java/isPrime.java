/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dalto
 */
public class isPrime {
  public boolean isPrime(int num){
    for (int i = 2; i < num; i++)
    {
      if (num % i == 0)
      {
        return false;
      }
    }
    return true;
}
  
}
