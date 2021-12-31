class StaticExample{

//Constructor block
StaticExample(){

    System.out.println("constructor executed");
}


//Empty block
{
	 System.out.println("empty block executed");
}

//Static block

static{

      System.out.println("static block executed");
    
}

public static void main(String []args)
{

StaticExample s1 = new StaticExample();

}



}

