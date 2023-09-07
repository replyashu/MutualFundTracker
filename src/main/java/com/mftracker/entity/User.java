package com.mftracker.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Table(name = "user_details", indexes = @Index(columnList = "userId, email"))
@Entity
@Data
public class User {
    @Id
    public String userId;
    public String email;
    public String name;
    public String imageUrl;
    public String pushNotificationToken;
    public String isFukraUSer;
    public String source;
}

