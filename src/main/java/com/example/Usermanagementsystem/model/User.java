package com.example.Usermanagementsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="regis")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   

    private String fullname;
    private String email;
    private String address;
    private String qualification;
    private String password;
    
}
