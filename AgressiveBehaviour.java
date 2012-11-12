/**
 * @(#)AgressiveBehaviour.java
 *
 *
 * @author 
 * @version 1.00 2012/11/5
 */


public class AgressiveBehaviour implements IBehaviour{
	
	public int moveCommand()
	{
		System.out.println("\tAgressive Behaviour: if find another robot attack it");
		return 1;
	}
}