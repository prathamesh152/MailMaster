package com.application;

/**
 * Send Mail in Java using SMTP without authentication
 */

import javax.mail.Session;
import java.util.Properties;

public class SimpleEmail {

    public static void main(String[] args) {

            System.out.println("SimpleEmail Start");
            String smtpHostServer = "smtp.example.com";
            String emailID = "email_me@example.com";
            Properties props = System.getProperties();
            props.put("mail.smtp.host", smtpHostServer);
            Session session = Session.getInstance(props, null);
            EmailUtil.sendEmail(session, emailID,"SimpleEmail Testing Subject", "SimpleEmail Testing Body");
    }

}
