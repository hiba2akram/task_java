public class Main{
public static void main(String[] args){
Artist artist = new Artist("Charles");
Artwork artwork1 = new Artwork("hina" , 1200, artist);

Artwork shallowCopy = artwork1.shallowCopy();
Artwork deepCopy = artwork1.deepCopy();

System.out.println("original copies");
artwork1.display();

System.out.println("Shallow copy: ");
shallowCopy.display();
artist.setName("dex");
System.out.println("after modifying");
System.out.println("Original Artwork:");
        artwork1.display();

        System.out.println("\nShallow Copy:");
        shallowCopy.display();
   
System.out.println("deep copy: ");
deepCopy.display();







   




}
}