class Syntax{

int syntaxId;
String keywordExample;
String variableDeclaration;
String conditionalStatement;
String loopStatement;
String functionDefinition;
String classDefinition;
String objectCreation;
String exceptionHandling;
String commentType;
String dataTypes;
String operators;
String accessModifiers;
String inheritanceType;
String interfaceSupport;
String lambdaExpression;
String packageStructure;
String memoryManagement;
String concurrencySupport;
String syntaxStyle;

Syntax(int syntaxId,String keywordExample,String variableDeclaration,
String conditionalStatement,String loopStatement,String functionDefinition,
String classDefinition,String objectCreation,String exceptionHandling,
String commentType,String dataTypes,String operators,String accessModifiers,
String inheritanceType,String interfaceSupport,String lambdaExpression,
String packageStructure,String memoryManagement,String concurrencySupport,
String syntaxStyle){

this.syntaxId=syntaxId;
this.keywordExample=keywordExample;
this.variableDeclaration=variableDeclaration;
this.conditionalStatement=conditionalStatement;
this.loopStatement=loopStatement;
this.functionDefinition=functionDefinition;
this.classDefinition=classDefinition;
this.objectCreation=objectCreation;
this.exceptionHandling=exceptionHandling;
this.commentType=commentType;
this.dataTypes=dataTypes;
this.operators=operators;
this.accessModifiers=accessModifiers;
this.inheritanceType=inheritanceType;
this.interfaceSupport=interfaceSupport;
this.lambdaExpression=lambdaExpression;
this.packageStructure=packageStructure;
this.memoryManagement=memoryManagement;
this.concurrencySupport=concurrencySupport;
this.syntaxStyle=syntaxStyle;

}

public void getSyntaxDetails(){

System.out.println("-----------------------------------");
System.out.println("Syntax ID: "+this.syntaxId);
System.out.println("Keyword Example: "+this.keywordExample);
System.out.println("Variable Declaration: "+this.variableDeclaration);
System.out.println("Conditional Statement: "+this.conditionalStatement);
System.out.println("Loop Statement: "+this.loopStatement);
System.out.println("Function Definition: "+this.functionDefinition);
System.out.println("Class Definition: "+this.classDefinition);
System.out.println("Object Creation: "+this.objectCreation);
System.out.println("Exception Handling: "+this.exceptionHandling);
System.out.println("Comment Type: "+this.commentType);
System.out.println("Data Types: "+this.dataTypes);
System.out.println("Operators: "+this.operators);
System.out.println("Access Modifiers: "+this.accessModifiers);
System.out.println("Inheritance Type: "+this.inheritanceType);
System.out.println("Interface Support: "+this.interfaceSupport);
System.out.println("Lambda Expression: "+this.lambdaExpression);
System.out.println("Package Structure: "+this.packageStructure);
System.out.println("Memory Management: "+this.memoryManagement);
System.out.println("Concurrency Support: "+this.concurrencySupport);
System.out.println("Syntax Style: "+this.syntaxStyle);

}

}