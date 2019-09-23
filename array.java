int[] myArray;
myArray = new int[5];
myArray[0] = 4;
myArray[1] = 8;
myArray[2] = 8;
myArray[3] = 5;
myArray[4] = 9;

////////////////////////////////
int[] myArray = {4,8,8,5,9};
int[] myArray2 = {3,5,6,7};

///////////////////////////////
import java.util.ArrayList;

ArrayList<Integer> myArray = new ArrayList<Integer>();

myArray.add(10);
int num = myArray.get(0);

///////////////////////////////

import java.util.ArrayList;
ArrayList<Object> list = new ArrayList<Object>();

list.add(10);
list.add("Hello");
list.add( new ArrayList<Integer>());
list.add( new Double(12.0));
list.clear(10);
list.size("Hello");

System.out.println(list); // {10, "Hello", [], 12.0}

///////////////////////////////////////
System.out.println(myArray[0]);
System.out.println(myArray[1]);
System.out.println(myArray[2]);
System.out.println(myArray[3]);
System.out.println(myArray[4]);
System.out.println(myArray[5]);
// ...
System.out.println(myArray[99]);


/////////////// WHILE LOOP ////////////////////////////

int i = 0;
while(i < 7)
{
    System.out.println("foo");
    i++;
}

/////////////////////// FOR LOOP /////////////////////

for (int i = 0; i < 7; i++){
    System.out.println("bar");
}

for (initialization; termination; increment){
    body statements
}

////////////////// EXAMPLE //////////////////////////

ArrayList<String> dynamically = new ArrayList<String>();
dynamically.add("Hello");
dynamically.add("world");
dynamically.add("etc");
for (int i = 0; i < dynamically.size(); i++){
    System.out.println(dynamically.get(i));
}

//////////// ENHANCE FOR LOOP ///////////////////////

for ( int i = 0; i < dynamically.size(); i++){
    String name = dynamically.get(i);
    System.out.println ("hello" + name);
}

/////////////// OHTER WAY //////////////////////////

for (String name: dynamically){
    System.out.println("hello" + name);
}

for (element container: collection){
    // body statements
}



