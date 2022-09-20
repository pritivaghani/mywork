package string;

public class String_buffer_builder {

	public static void main(String[] args) {
		double starttime = System.currentTimeMillis();
		
		StringBuffer pj = new StringBuffer("World");
		for (int i=1;i<100000;i++)
		{
			pj.append("read");
		}
		double endtime = System.currentTimeMillis();
		
		System.out.println("time taken by buffer: "+(endtime-starttime));
		
		
		double starttime1 = System.currentTimeMillis();
      StringBuilder sb = new StringBuilder("Java");
      for(int i=1;i<100000;i++)
      {
    	  sb.append("read");
      }
      double endtime1 = System.currentTimeMillis();
      
      System.out.println("time taken by builder: "+(endtime1-starttime1));
	}

}
