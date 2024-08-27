public abstract class User
{
    protected String id;
    protected String name;
    protected String email;

    public User(String id, String name, String email)
    {
        this.email=email;
        this.name=name;
        this.id=id;
    }

    public abstract void login();

    public abstract void logout();

    public String getName()
    {
        return id;
    }

    public String getId()
    {
        return id;
    }

    public String getEamil()
    {
        return email;
    }
}