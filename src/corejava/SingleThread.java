package corejava;
import java.lang.*;
import java.util.*;

public class SingleThread extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
			System.out.println(i);
	}
}
