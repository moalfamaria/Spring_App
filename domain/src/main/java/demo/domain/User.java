package demo.domain;

import javax.persistence.*;


@Entity
@Table(name = "V1_create_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String User_name;
    private String Password;

   public User()
   {

   }
    public User(long Id, String User_name, String Password){
        this.Id = Id;
        this.User_name = User_name;
        this.Password = Password;
    }

    public long getId() {
        return Id;
    }

    public String getUser_name() {
        return User_name;
    }

    public String getPassword() {
        return Password;
    }

}