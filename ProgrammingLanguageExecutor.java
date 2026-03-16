class ProgrammingLanguageExecutor{

public static void main(String[] args){

ProgrammingLanguage p1 = new ProgrammingLanguage(1,"Java","James Gosling","1995","OOP","Static","Compiled",true,true,"Javac","java.com","21","Application","Cross Platform","Spring","Maven","Docs","Strong","Active","5");
Syntax s1 = new Syntax(101,"class","int a=10","if()","for()","void method()","class A{}","new A()","try-catch","//","int,double","+, -","public","Single","Yes","Lambda","package","GC","Threads","C-like");
p1.syntax=s1;
p1.getProgrammingLanguageDetails();

System.out.println();

ProgrammingLanguage p2 = new ProgrammingLanguage(2,"Python","Guido van Rossum","1991","Multi Paradigm","Dynamic","Interpreted",true,true,"Python","python.org","3.12","AI","Cross Platform","Django","pip","Docs","Huge","Active","5");
Syntax s2 = new Syntax(102,"def","a=10","if:","for i","def func()","class A:","obj=A()","try-except","#","int,str","+, -","public","Multiple","Yes","Lambda","module","GC","Async","Simple");
p2.syntax=s2;
p2.getProgrammingLanguageDetails();

System.out.println();

ProgrammingLanguage p3 = new ProgrammingLanguage(3,"C","Dennis Ritchie","1972","Procedural","Static","Compiled",false,false,"GCC","gnu.org","C18","System","Unix","None","Make","Manual","Strong","Active","4");
Syntax s3 = new Syntax(103,"int","int a","if()","for()","void func()","struct","pointer","setjmp","/* */","int,char","+, -","public","None","No","None","header","Manual","None","Low level");
p3.syntax=s3;
p3.getProgrammingLanguageDetails();

System.out.println();

ProgrammingLanguage p4 = new ProgrammingLanguage(4,"C++","Bjarne Stroustrup","1985","OOP","Static","Compiled",true,false,"G++","cplusplus.com","20","Games","Cross Platform","Qt","CMake","Docs","Strong","Active","4");
Syntax s4 = new Syntax(104,"class","int a","if()","for()","void func()","class A{}","A obj","try-catch","//","int,float","+, -","public","Multiple","Yes","Lambda","namespace","Manual","Threads","C-like");
p4.syntax=s4;
p4.getProgrammingLanguageDetails();

System.out.println();

ProgrammingLanguage p5 = new ProgrammingLanguage(5,"JavaScript","Brendan Eich","1995","Event Driven","Dynamic","Interpreted",true,true,"Node","javascript.com","ES6","Web","Browser","React","npm","Docs","Huge","Active","5");
Syntax s5 = new Syntax(105,"function","let a","if()","for()","function()","class A{}","new A()","try-catch","//","number,string","+, -","public","Prototype","Yes","Arrow","module","GC","Async","Flexible");
p5.syntax=s5;
p5.getProgrammingLanguageDetails();

System.out.println();

/* 6 – 20 simplified */

ProgrammingLanguage p6=new ProgrammingLanguage(6,"Go","Google","2009","Procedural","Static","Compiled",false,true,"Go","golang.org","1.21","Backend","Cross","Gin","Go mod","Docs","Strong","Active","4");
Syntax s6=new Syntax(106,"func","var a","if","for","func()","struct","new","panic","//","int","+, -","public","Single","No","None","package","GC","goroutines","Clean");
p6.syntax=s6; p6.getProgrammingLanguageDetails();

System.out.println();

ProgrammingLanguage p7=new ProgrammingLanguage(7,"Rust","Mozilla","2010","System","Static","Compiled",true,false,"Rustc","rust-lang.org","1.70","System","Cross","Rocket","Cargo","Docs","Strong","Active","4");
Syntax s7=new Syntax(107,"fn","let a","if","loop","fn()","struct","Box","Result","//","int","+, -","pub","Traits","Yes","Closure","crate","Ownership","Threads","Strict");
p7.syntax=s7; p7.getProgrammingLanguageDetails();

System.out.println();

ProgrammingLanguage p8=new ProgrammingLanguage(8,"Kotlin","JetBrains","2011","OOP","Static","Compiled",true,true,"Kotlin","kotlinlang.org","1.9","Android","JVM","Ktor","Gradle","Docs","Strong","Active","5");
Syntax s8=new Syntax(108,"fun","var a","if","for","fun()","class","obj","try","//","int","+, -","public","Single","Yes","Lambda","package","GC","Coroutine","Modern");
p8.syntax=s8; p8.getProgrammingLanguageDetails();

System.out.println();

ProgrammingLanguage p9=new ProgrammingLanguage(9,"Swift","Apple","2014","OOP","Static","Compiled",true,false,"Swift","swift.org","5.9","iOS","Apple","SwiftUI","SwiftPM","Docs","Strong","Active","5");
Syntax s9=new Syntax(109,"func","var a","if","for","func()","class","obj","try","//","int","+, -","public","Multiple","Yes","Closure","module","ARC","Async","Clean");
p9.syntax=s9; p9.getProgrammingLanguageDetails();

System.out.println();

ProgrammingLanguage p10=new ProgrammingLanguage(10,"PHP","Rasmus","1995","Procedural","Dynamic","Interpreted",true,true,"PHP","php.net","8.2","Web","Server","Laravel","Composer","Docs","Strong","Active","4");
Syntax s10=new Syntax(110,"function","$a","if","for","function()","class","new","try","//","int","+, -","public","Single","Yes","Closure","namespace","GC","Async","Web");
p10.syntax=s10; p10.getProgrammingLanguageDetails();


}
}