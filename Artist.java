class Artist{
private String name;
Artist(String name){
this.name = name;
}
public void setName(String name){
this.name=name;
}
public String getName(){
return name;
}

public void displayInfor(){
System.out.println("Name: " + name);
}

}