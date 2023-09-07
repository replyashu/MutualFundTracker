package com.mftracker.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Table(name = "mutual_funds", indexes = @Index(columnList = "schemeCode"))
@Entity
@Data
public class MutualFund {
    @Id
    private String schemeCode;
    private String schemeName;

    @OneToMany(cascade = CascadeType.ALL)
    private List<MutualFundNav> mutualFundNavList;
}
