package demo.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="V2_create_messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private Date Post_date;
    private String Message;
    private long User_id;

    public Message()
    {

    }

    public Message(long Id, Date Post_date, String Message, long User_id) {
        this.Id = Id;
        this.Post_date = Post_date;
        this.Message = Message;
        this.User_id = User_id;
    }

    public long getId() {
        return Id;
    }

    public Date getPost_date() {
        return Post_date;
    }

    public String getMessage() {
        return Message;
    }

    public long getUser_id() {
        return User_id;
    }
}
