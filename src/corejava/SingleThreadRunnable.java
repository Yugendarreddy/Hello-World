package corejava;
import java.lang.*;
import java.util.*;

public class SingleThreadRunnable implements Runnable
{
	public void run()
	{
		for(int i=0; i<5; i++)
			System.out.println(i);
	}
}
