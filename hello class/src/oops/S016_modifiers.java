package oops;

class Workers 
{
int id;
String name;
     
  
    
    Workers (int id , String name)
    {
    	this.id = id;
    	this.name = name;
    }
    
    public void display()
    {
    	System.out.println("Running display method...");
    	System.out.println(id+" "+"name");
    }
}




