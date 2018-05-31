package nl.hu.sie.bep.friendspammer;


import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import java.util.Properties;

class EmailConfig {


    private EmailConfig() {
        throw new IllegalStateException("This is a utility class");
    }

    static Session getSession() {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.mailtrap.io");
        props.put("mail.smtp.port", "2525");
        props.put("mail.smtp.auth", "true");

        String username = "b04352fb7971c3";
        String password = "d6f4e04c8e00cc";

        return Session.getInstance(props, new javax.mail.Authenticator() {
            @Override protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
    }
}
