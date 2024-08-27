public class Author
{
    private String name;
    private String bio;

    public Author(String name, String bio)
    {
        this.bio=bio;
        this.name=name;
    }


    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }
}