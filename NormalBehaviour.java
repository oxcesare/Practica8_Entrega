/**
 * @(#)NormalBehaviour.java
 *
 *
 * @author 
 * @version 1.00 2012/11/5
 */

public class NormalBehaviour implements IBehaviour{
	public int moveCommand()
	{
		System.out.println("\tNormal Behaviour: if find another robot ignore it");
		return 0;
	}
}


