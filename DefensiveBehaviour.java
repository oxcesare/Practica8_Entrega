/**
 * @(#)DefensiveBehaviour.java
 *
 *
 * @author 
 * @version 1.00 2012/11/5
 */


public class DefensiveBehaviour implements IBehaviour{
	public int moveCommand()
	{
		System.out.println("\tDefensive Behaviour: if find another robot run from it");
		return -1;
	}
}