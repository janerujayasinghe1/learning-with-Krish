# learning-with-Krish

In here have a java class called StaticExapmle .In side the class 
there have 3 blocks as
  1. static block
  2. non static or empty block
  3. constructor

In each block have a print statement including name of the block.
After running this java file following output was appear

     static block executed 
     empty block executed
     constructor executed

So lets talk about how this happen and what is the flow of execution

lets take static block

 static block is run when the class loading time and runs only once .class loading time means storing class 
specific information in the memory.It means before runung the main method the static block will run.thats why 
the static block executed messeage comes first.static block have ability to inizialize static variables and static methods.
And the static block will run only once.

  empty block

  empty blocks will call when creating a object using new keyword.this will not execute if you are not creating a object.In the empty block both static and
non static variables can be initialized and also static and instance method can be called from the empty block.This empty block will called before calling 
the constructor.thats why "empty block executed" message come before the constructor message.

constructor block

final execution is the constructor.when a object creating using new key word constructor will called and initialized the newly created object.when ever we creating
a object constructor will called.
