import java.io.Serializable;
    /* This class is sending between server and clients */
    public class Message implements Serializable {
        private String userName;
        private String date;
        private String IP;
        private String state;
       private String str;
        private static final long serialVersionUID = 1L;
        Message( String userName, String date, String IP, String state, String str ) {
            this.userName = userName;
            this.date = date;
            this.IP = IP;
            this.state = state;
            this.str = str;
        }
        void setMessageText( String messageText ) {
            this.str = messageText;
        }
        String getMessageText() { return str; }
        Message getGreetings() { return new Message(userName, date, IP, state,  str); }
    }

